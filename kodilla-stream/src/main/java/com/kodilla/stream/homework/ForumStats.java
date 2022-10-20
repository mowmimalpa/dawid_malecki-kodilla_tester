package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(postsAverageForUsersOlderAndEqualThan40(UsersRepository.getUsersList()));
        System.out.println(postsAverageForUsersYoungerThan40(UsersRepository.getUsersList()));
    }

    public static double postsAverageForUsersOlderAndEqualThan40(List<User> users){
        double average = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);
        return average;
    }

    public static double postsAverageForUsersYoungerThan40(List<User> users){
        double average = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);
        return average;
    }
}