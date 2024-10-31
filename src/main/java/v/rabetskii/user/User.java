package v.rabetskii.user;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String name;
    private String email;
    private String role;

    public User() {}

    public User(String name, String email, String role) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public UUID getID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', role='" + role + "'}";
    }
}
