package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String username;
    private int age;
    private int numberOfPosts;
    private String group;

    public User(String username, int age, int numberOfPosts, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                getNumberOfPosts() == user.getNumberOfPosts() &&
                getUsername().equals(user.getUsername()) &&
                getGroup().equals(user.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getGroup(), getAge(), getNumberOfPosts());
    }


}