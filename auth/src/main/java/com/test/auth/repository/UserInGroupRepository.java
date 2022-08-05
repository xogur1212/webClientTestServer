package com.test.auth.repository;

import com.test.auth.model.User;
import com.test.auth.model.UserGroup;
import com.test.auth.model.UserInGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserInGroupRepository extends JpaRepository<UserInGroup,Long> {

    List<UserInGroup> findAllByUser(User user);

    List<UserInGroup> findAllByUserGroup(UserGroup userGroup);

    Long deleteByUserGroup(UserGroup userGroup);

    @Transactional
    @Modifying
    @Query("delete from UserInGroup where user.userSeq = :userSeq")
    void deleteAllByUserSeq(int userSeq);

    @Transactional
    @Modifying
    @Query("delete from UserInGroup where userGroup.userGroupSeq = :groupSeq")
    void deleteAllByUserGroupSeq(int groupSeq);

    Long deleteAllByUser(User user);

    Long deleteByUserAndUserGroup(User user, UserGroup userGroup);
}
