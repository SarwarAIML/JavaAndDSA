package org.example.eclax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserUpdateAndSaveExample {

    public static void main(String[] args) {
        // Original list of users
        List<User> existingUsers = new ArrayList<>();
        existingUsers.add(new User(1L, "Alice"));
        existingUsers.add(new User(2L, "Bob"));

        // New list of users to update or save
        List<User> updatedUsers = new ArrayList<>();
        updatedUsers.add(new User(1L, "Updated Alice")); // Update existing user
        updatedUsers.add(new User(3L, "Charlie"));      // Save new user

        // Perform update and save operations
        updateAndSaveUsers(existingUsers, updatedUsers);

        // Print the updated list of users
        System.out.println("Updated List of Users:");
        existingUsers.forEach(user -> System.out.println("User: " + user.getId() + ", Name: " + user.getName()));
    }

    private static void updateAndSaveUsers(List<User> existingUsers, List<User> updatedUsers) {
        // Create a map for existing users for efficient lookup
        Map<Long, User> existingUsersMap = existingUsers.stream()
                .collect(Collectors.toMap(User::getId, user -> user));

        // Partition updated users into two groups: for update and for save
        Map<Boolean, List<User>> partitionedUsers = updatedUsers.stream()
                .collect(Collectors.partitioningBy(user -> existingUsersMap.containsKey(user.getId())));

        // Update existing users
        List<User> usersToUpdate = partitionedUsers.get(true);
        usersToUpdate.forEach(existingUser -> {
            User updatedUser = existingUsersMap.get(existingUser.getId());
            updatedUser.setName(existingUser.getName());
        });

        // Save new users
        List<User> newUsersToSave = partitionedUsers.get(false);
        existingUsers.addAll(newUsersToSave);
    }
}


    // Implement equals and hashCode based on id
    // Omitted for brevi

