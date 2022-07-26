package com.voicestore.auth.repository;

import com.voicestore.auth.model.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
    UserGroup findByGroupName(String groupName);

    UserGroup findByUserGroupSeq(int userGroupSeq);
}
