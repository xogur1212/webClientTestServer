package com.voicestore.auth.config.security.oauth2;

import com.voicestore.auth.config.auth.CommonUserDetails;
import com.voicestore.auth.config.auth.CommonUserDetailsService;
import com.voicestore.auth.model.dto.TokenDto;
import com.voicestore.auth.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
@Slf4j

public class OAuth2SuccessHandler implements AuthenticationSuccessHandler {


    private final JwtUtil jwtUtil;
    private final CommonUserDetailsService commonUserDetailsService;
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Value("${successUrl}")
    private String DEFAULT_LOGIN_SUCCESS_URL;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        CommonUserDetails oAuth2User = (CommonUserDetails) authentication.getPrincipal();
        log.info("Attributes = {}", oAuth2User.getAttributes());


//        final CommonUserDetails commonUserDetails = commonUserDetailsService.loadUserByUsername(user.getUserId());
//        //TODO userDetails이 잘못들어왔을때에 에러페이지 관리 필요
        final TokenDto jwt = jwtUtil.generateToken(oAuth2User);

            writeTokenResponse(response, jwt);
        Map<String,Object> header1 =new HashMap<>();
        header1.put("Client-Id","umxal8abrevf0pgo5dxoilvl50v2x8");
        header1.put("Client-Authorization","Bearer " +oAuth2User.getAttributes().get("sub"));
        redirectStrategy2(request, response, (String)oAuth2User.getAttributes().get("aud"),header1);
        // redirectStrategy(request, response, authentication);

    }

    private void writeTokenResponse(HttpServletResponse response, TokenDto tokenDto) throws IOException {
//        response.setContentType("text/html;charset=UTF-8");

//        response.addHeader("Auth", tokenDto.getAccessToken());
//        response.addHeader("Refresh", tokenDto.getRefreshToken());
//        response.setContentType("application/json;charset=UTF-8");
//        MediaType mediaType = MediaType.APPLICATION_JSON;

        //final HttpHeaders headers = new HttpHeaders();
//            Consumer<HttpHeaders> headersConsumer = httpHeaders -> {
//                httpHeaders.setContentType(mediaType);
//                httpHeaders.setAccept(Collections.singletonList(mediaType));
//                String cookie = tokenDto.getAccessToken();
//                log.info("cookie={}", cookie);
//                httpHeaders.add("Cookie", cookie);
//
//                httpHeaders.set("Authorization", cookie);
//                httpHeaders.setBearerAuth("");


        Cookie cookie = new Cookie("Auth", tokenDto.getAccessToken());
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(3000);
        response.addCookie(cookie);

    }

    private void redirectStrategy(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {

        redirectStrategy.sendRedirect(request, response, DEFAULT_LOGIN_SUCCESS_URL);
    }

    private void redirectStrategy2(HttpServletRequest request, HttpServletResponse response, String aud , @RequestHeader Map <String,Object> requestHeader)
            throws IOException, ServletException {

        URL url = new URL("https://api.twitch.tv/helix/users");
        HttpURLConnection huc = (HttpURLConnection)url.openConnection();

        huc.setRequestProperty("Client-Id","mxal8abrevf0pgo5dxoilvl50v2x8");
        huc.setRequestProperty("Authorization","Bearer " +aud);
        System.out.println( huc.getResponseMessage());
      //  redirectStrategy.sendRedirect(request, response, "https://api.twitch.tv/helix/users");
    }



}



