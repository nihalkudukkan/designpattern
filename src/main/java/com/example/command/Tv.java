package com.example.command;

public class Tv implements Device {
    String name;

    public Tv(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("Tv " + name + " -> ON");
    }

    @Override
    public void off() {
        System.out.println("Tv " + name + " -> OFF");
    }
}
