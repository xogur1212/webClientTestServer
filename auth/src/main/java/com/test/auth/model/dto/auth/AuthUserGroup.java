package com.test.auth.model.dto.auth;

import com.test.auth.model.UserGroup;
import com.test.auth.model.UserGroupPermit;
import com.test.auth.model.UserInGroup;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class AuthUserGroup {

    private Long userGroupSeq;

    private String groupName;

    private String groupDesc;

    private Timestamp insertDt;

    private Long insertUserSeq;

    private Timestamp updateDt;

    private Long updateUserSeq;

    private String userGroupStatus;

    private final List<UserInGroup> userInGroup = new ArrayList<>();

    private final List<UserGroupPermit> userGroupPermit = new ArrayList<>();

    public AuthUserGroup(UserGroup userGroup) {

        this.userGroupSeq= userGroup.getUserGroupSeq();

        this.groupName=userGroup.getGroupName();

        this.groupDesc=userGroup.getGroupDesc();

        this.insertDt=userGroup.getInsertDt();

//        private Long insertUserSeq;
//
//        private Timestamp updateDt;
//
//        private Long updateUserSeq;
//
//        private String userGroupStatus;
//
//        private final List<UserInGroup> userInGroup = new ArrayList<>();
//
//        private final List<UserGroupPermit> userGroupPermit = new ArrayList<>();
    }

}
