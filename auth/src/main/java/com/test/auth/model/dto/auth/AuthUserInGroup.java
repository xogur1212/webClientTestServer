package com.test.auth.model.dto.auth;

import com.test.auth.model.UserInGroup;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class AuthUserInGroup {

    private Long userInGroupSeq;

    private Timestamp insertDt;

    private Long insertUserSeq;
    private AuthUserGroup userGroup;

    public AuthUserInGroup(UserInGroup userInGroup) {
        this.userInGroupSeq = userInGroup.getUserInGroupSeq();

        this.insertDt = userInGroup.getInsertDt();

        this.insertUserSeq = userInGroup.getInsertUserSeq();

        this.userGroup = new AuthUserGroup(userInGroup.getUserGroup());
    }

}
