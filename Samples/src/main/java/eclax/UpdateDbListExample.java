package eclax;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UpdateDbListExample {

    public static void main(String[] args) {
        // Sample database list
        List<User> dbList = new ArrayList<>();
        dbList.add(new User(1L, "Alice"));
        dbList.add(new User(2L, "Bob"));

        // Sample new list
        List<User> newList = new ArrayList<>();
        newList.add(new User(0L, "New User"));   // Save this user
        newList.add(new User(2L, "Updated Bob")); // Update this user

        // Update dbList based on newList
        updateDbList(dbList, newList);

        // Print the updated dbList
        System.out.println("Updated DbList:");
        dbList.forEach(user -> System.out.println("User: " + user.getId() + ", Name: " + user.getName()));
    }

    private static void updateDbList(List<User> dbList, List<User> newList) {
        // Create a map for dbList for efficient lookup
        Map<Long, User> dbMap = dbList.stream()
                .collect(Collectors.toMap(User::getId, Function.identity()));

        System.out.println(dbMap);

        // Update dbList based on newList
        for (User newUser : newList) {
            if (newUser.getId() == 0L) {
                // Save new user with ID 0
                dbList.add(newUser);
            } else if (dbMap.containsKey(newUser.getId())) {
                // Update existing user
                User existingUser = dbMap.get(newUser.getId());
                existingUser.setName(newUser.getName());
            }
        }
    }
}

