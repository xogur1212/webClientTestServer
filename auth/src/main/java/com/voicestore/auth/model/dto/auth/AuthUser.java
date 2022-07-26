package com.voicestore.auth.model.dto.auth;

import com.voicestore.auth.model.AuthProvider;
import com.voicestore.auth.model.User;
import com.voicestore.auth.model.UserStatus;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class AuthUser {

    private Long userSeq;

    private String userId;

    private String password;


    private String userName;

    private String email;

    private String tel;

    private String address;

    private String detailAddress;

    private Timestamp lastLoginDt;

    private Long insertUserSeq;

    private Timestamp insertDt;

    private Long updateUserSeq;

    private Timestamp updateDt;

    private String status;

    private String refreshToken;

    private UserStatus userStatus;

    private List<AuthUserInGroup> userInGroup = new ArrayList<>();

    private AuthProvider provider;

    private String providerId;

    public AuthUser(User user) {
        this.userSeq = user.getUserSeq();

        this.userId = user.getUserId();

        this.password = user.getPassword();

        this.userName = user.getUserName();

        this.email = user.getEmail();

        this.tel = user.getTel();

        this.address = user.getAddress();

        this.detailAddress = user.getDetailAddress();

        this.lastLoginDt = user.getLastLoginDt();

        this.insertUserSeq = user.getInsertUserSeq();

        this.insertDt = user.getInsertDt();

        this.updateUserSeq = user.getUpdateUserSeq();

        this.updateDt = user.getUpdateDt();

        this.status = user.getStatus();

        this.refreshToken = user.getRefreshToken();

        this.userStatus = user.getUserStatus();

        this.userInGroup = user.getUserInGroup()
                .stream()
                .map(AuthUserInGroup::new)
                .collect(Collectors.toList());

        this.provider = user.getProvider();

        this.providerId = user.getProviderId();

    }
}
