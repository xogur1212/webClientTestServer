package com.test.auth.config.security.oauth2.user;

import com.test.auth.config.security.oauth2.OAuth2AuthenticationProcessingException;
import com.test.auth.model.AuthProvider;

import java.util.Map;

public class OAuth2UserInfoFactory {


    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        }else if(registrationId.equalsIgnoreCase(AuthProvider.twitch.toString())){
            return new TwitchOAuth2UserInfo(attributes);
        }
        else {
            throw new OAuth2AuthenticationProcessingException("해당 방법은 아직 로그인 할 수 없는 방법 입니다.");
        }
    }
}
