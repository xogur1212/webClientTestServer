package com.voicestore.auth.config.auth;

import com.voicestore.auth.model.User;
import com.voicestore.auth.repository.UserRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

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