package ru.sfedu.logan.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.sfedu.logan.entity.User;

import java.util.Optional;

@RepositoryRestResource
public interface UserRepository extends MongoRepository<User, ObjectId> {
    Optional<User> findUserByUsername(String username);
    Optional<User> findUserByEmail(String email);
    boolean existsUserByUsername(String username);
    boolean existsUserByEmail(String email);
}
