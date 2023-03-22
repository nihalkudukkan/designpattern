package com.example.adaptor;

public class Main {
    public static void main(String[] args) {
        Human crowAdaptor = new CrowAdaptor(new Crow());

        crowAdaptor.talk();
        crowAdaptor.walk();
    }
}
