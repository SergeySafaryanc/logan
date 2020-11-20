package ru.sfedu.logan.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import ru.sfedu.logan.InstanceEntity;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class UserRepositoryTest {
    private static final Logger log = LogManager.getLogger(UserRepositoryTest.class);

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    public void before() {
        log.info("Init before()");
        log.info(userRepository.save(InstanceEntity.usr1));
    }

    @AfterEach
    public void after() {
        log.info("Init after()");
        userRepository.deleteAll();
    }

    @Test
    void findUserByUsername() {
        assertTrue(userRepository.findUserByUsername(InstanceEntity.usr1.getUsername()).isPresent());
    }

    @Test
    void findUserByEmail() {
        assertTrue(userRepository.findUserByEmail(InstanceEntity.usr1.getEmail()).isPresent());
    }

    @Test
    void existsUserByUsername() {
        assertTrue(userRepository.existsUserByUsername(InstanceEntity.usr1.getUsername()));
    }

    @Test
    void existsUserByEmail() {
        assertTrue(userRepository.existsUserByEmail(InstanceEntity.usr1.getEmail()));
    }
}