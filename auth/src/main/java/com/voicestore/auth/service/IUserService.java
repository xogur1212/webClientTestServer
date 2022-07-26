package com.voicestore.auth.service;

import com.voicestore.auth.model.User;
import com.voicestore.auth.model.dto.Result;
import com.voicestore.auth.model.dto.response.UserResponse;

import java.util.Map;

public interface IUserService {

    UserResponse findUser(String userName);

    UserResponse findUser(Long userSeq);

    User updateUser(String userName, String token);

    Result checkId(String userId);


    User findUserWithPassword(String username);

    UserResponse findOneUser(Long userSeq);

    Result saveUser(User user);

    Result updateUser(Map<String, Object> paramMap);
}
