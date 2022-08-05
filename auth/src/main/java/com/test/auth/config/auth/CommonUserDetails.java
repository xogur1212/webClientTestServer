package com.test.auth.config.auth;

import com.test.auth.model.User;
import com.test.auth.model.UserGroupPermit;
import com.test.auth.model.dto.auth.AuthUser;
import com.test.auth.model.dto.auth.AuthUserGroup;
import com.test.auth.model.dto.auth.AuthUserInGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.io.Serializable;
import java.util.*;


@Slf4j
public class CommonUserDetails implements UserDetails, OAuth2User, Serializable {

    private AuthUser authUser;

    private Set<String> permitList;

    private Map<String, Object> attributes;




    public CommonUserDetails(User user) {

        this.authUser = new AuthUser(user);
//        this.authUserInGroup = user.getUserInGroup().stream().map(AuthUserInGroup::new).collect(Collectors.toList());
        permitList = new LinkedHashSet<>();
    }

    public CommonUserDetails(User user, Map<String, Object> attributes) {
        this(user);
        this.attributes = attributes;
    }


    public AuthUser getUser() {

        return authUser;
    }

    public Long getUserSeq() {
        return authUser.getUserSeq();
    }

    @Override
    public String getPassword() {
        return authUser.getPassword();
    }

    @Override
    public String getUsername() {
        return authUser.getUserName();
    }

    @Override
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    @Override
    public String getName() {
        return String.valueOf(authUser.getUserName());
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();


        if (authUser != null) {
            List<AuthUserInGroup> authUserInGroupList = authUser.getUserInGroup();
//            System.out.println(userInGroup.size());
            for (AuthUserInGroup u : authUserInGroupList) {
                AuthUserGroup group = u.getUserGroup();
                List<UserGroupPermit> ugp = group.getUserGroupPermit();
                for (UserGroupPermit ugp2 : ugp)
                    permitList.add("ROLE_" + ugp2.getPermitMenu().getCodeValue());
            }

            for (String permit : permitList) {
                authorities.add(new SimpleGrantedAuthority(permit));
            }

            permitList.forEach(permit -> {
                authorities.add(new SimpleGrantedAuthority(permit));
            });
        }
        return authorities;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
