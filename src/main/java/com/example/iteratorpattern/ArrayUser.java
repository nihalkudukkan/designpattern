package com.example.iteratorpattern;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayUser {
    User[] users;
    int index = 0;

    public ArrayUser() {

        users = new User[3];

        addUser("nihal", 23);
        addUser("fasal", 28);
        addUser("sahal", 33);
    }

    private void addUser(String name, int age) {
        users[index] = new User(name, age);
        index++;
    }

    public Iterator getUsers() {
        return Arrays.asList(users).iterator();
    }
}
