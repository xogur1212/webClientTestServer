package com.voicestore.auth.config.security.oauth2.user;

import java.util.Map;

public class TwitchOAuth2UserInfo extends OAuth2UserInfo {

    public TwitchOAuth2UserInfo(Map<String, Object> attributes){
        super(attributes);
    }

    @Override
    public String getId() {
        return (String) attributes.get("sub");
    }

    @Override
    public String getName() {

        return (String) attributes.get("preferred_username");

    }

    @Override
    public String getEmail() {
//        return (String) attributes.get("email");
        return (String) attributes.get("sub");
    }

    @Override
    public String getImageUrl() {

        return (String) attributes.get("sub");

    }

}
