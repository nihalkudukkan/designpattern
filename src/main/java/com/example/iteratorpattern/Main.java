package com.example.iteratorpattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayListUser al = new ArrayListUser();
        ArrayUser array = new ArrayUser();
        HashTableUser ht = new HashTableUser();

        Iterator user1 = al.getUsers();
        while (user1.hasNext()) {
            User user = (User) user1.next();
            System.out.println(user.name + ": " + user.age);
        }

        Iterator user2 = array.getUsers();
        while (user2.hasNext()) {
            User user = (User) user2.next();
            System.out.println(user.name + ": " + user.age);
        }

        Iterator user3 = ht.getUsers();
        while (user3.hasNext()) {
            User user = (User) user3.next();
            System.out.println(user.name + ": " + user.age);
        }
    }
}
