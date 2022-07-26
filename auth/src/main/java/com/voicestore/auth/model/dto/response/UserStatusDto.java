package com.voicestore.auth.model.dto.response;

import com.voicestore.auth.model.UserStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserStatusDto {
    private String codeId;
    private String codeName;
    private int codeValue;

    public UserStatusDto(UserStatus userStatus) {
        this.codeId =userStatus.getCodeId();
        this.codeName = userStatus.getCodeName();
        this.codeValue = Integer.parseInt(userStatus.getCodeValue());
    }
}
