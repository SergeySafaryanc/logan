package ru.sfedu.logan.dto.response;

import org.bson.types.ObjectId;
import ru.sfedu.logan.entity.Role;

public class JwtResponse {
    private String token;
    private String type = "Bearer ";
    private ObjectId id;
    private String username;
    private String email;
    private Role role;

    public JwtResponse(String accessToken,
                       ObjectId id,
                       String username,
                       String email,
                       Role role) {
        this.token = accessToken;
        this.type = type;
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
