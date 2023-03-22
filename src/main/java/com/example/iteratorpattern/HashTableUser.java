package com.example.iteratorpattern;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableUser {
    Hashtable<Integer, User> users;
    int index = 0;

    public HashTableUser() {
        users = new Hashtable<>();

        addUser("nihal", 23);
        addUser("fasal", 28);
        addUser("sahal", 33);
    }

    private void addUser(String name, int age) {
        users.put(index, new User(name, age));
        index++;
    }

    public Iterator getUsers() {
        return users.values().iterator();
    }
}
