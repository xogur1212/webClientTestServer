package com.test.auth.config.auth;

import com.test.auth.model.User;
import com.test.auth.repository.UserRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        classes = {UserRepository.class}
)
class CommonUserDetailsTest {


    User user;

    @Autowired
    private UserRepository userRepository;

    @Before
    void beforeMethod() {
        user = userRepository.findByUserSeq(1L);
    }


    @Test
    void asdasd() {
        System.out.println("test");
        if (user != null) {
            user.getUserInGroup().forEach(userInGroup -> {
                System.out.println(
                        userInGroup
                                .getUserGroup()
                                .getUserGroupPermit());


            });

        }
    }
}