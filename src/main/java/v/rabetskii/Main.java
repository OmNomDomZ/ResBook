package v.rabetskii;

import v.rabetskii.datacontrol.DataControlJSON;
import v.rabetskii.user.User;
import v.rabetskii.user.UserService;

public class Main {
    public static void main(String[] args) {
        DataControlJSON<User> dataControlJSON = new DataControlJSON<>("user.json");

        User user1 = new User("Alex", "alex@gmail.com", "client");
        User user2 = new User("Bob", "bob@gmail.com", "client");
        User user3 = new User("John", "john@gmail.com", "client");

        UserService userService = new UserService();
        userService.createUser(user1);
        userService.createUser(user2);
        userService.createUser(user3);

        dataControlJSON.saveData(userService.getUsers());

        userService.deleteUser(user1.getID());
        userService.deleteUser(user2.getID());
        userService.deleteUser(user3.getID());

        System.out.println("Пользователи после удаления: " + userService.getUsers());

        dataControlJSON.loadData(userService.getUsers());

        System.out.println("Пользователи после загрузки из файла: " + userService.getUsers());
    }
}