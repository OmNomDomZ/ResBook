package v.rabetskii;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String name;
    private String email;
    private String role;

    public User createUser(String name, String email, String role) {
        User user = new User();
        user.uuid = UUID.randomUUID();
        user.name = name;
        user.email = email;
        user.role = role;
        return user;
    }

    public void deleteUser() {

    }

    public UUID getUuid() {
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
}
