package v.rabetskii.user;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserService {
    private final Map<UUID, User> users = new HashMap<>();

    public void createUser(User user) {
        users.put(user.getID(), user);
    }

    public User getUser(UUID id) {
        return users.get(id);
    }

    public void updateUser(User user){
        users.put(user.getID(), user);
    }

    public void deleteUser(UUID id) {
        users.remove(id);
    }

    public Map<UUID, User> getUsers() {
        return users;
    }
}
