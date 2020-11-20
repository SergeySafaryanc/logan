package ru.sfedu.logan.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.WebApplicationContext;
import ru.sfedu.logan.InstanceEntity;
import ru.sfedu.logan.dto.request.SignupRequest;
import ru.sfedu.logan.entity.User;
import ru.sfedu.logan.repository.UserRepository;

import javax.annotation.PostConstruct;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AuthControllerTest {
    private static final Logger log = LogManager.getLogger(AuthControllerTest.class);

    @Autowired
    private TestRestTemplate template;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    void defaultUser() {
        log.info(userRepository.save(InstanceEntity.usr1));
    }

    @Test
    void givenAuthRequestOnPrivateService_shouldSucceedWith200() {
    }

    @Test
    void authenticateUser() {
    }

    @Test
    void registerUser() {
    }
}