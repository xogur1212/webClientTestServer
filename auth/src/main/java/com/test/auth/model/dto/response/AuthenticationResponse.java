package com.test.auth.model.dto.response;

public class AuthenticationResponse {

    private final String accessToken;

    public AuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;

    }

    public String getAccessToken() {
        return accessToken;
    }
}
