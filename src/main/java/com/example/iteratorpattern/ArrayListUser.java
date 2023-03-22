package com.example.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUser {
    ArrayList<User> user;

    public ArrayListUser() {
        user = new ArrayList<>();

        addUser("nihal", 23);
        addUser("fasal", 28);
        addUser("sahal", 33);
    }

    public void addUser(String name, int age) {
        user.add(new User(name, age));
    }

    public Iterator getUsers() {
        return user.iterator();
    }
}
