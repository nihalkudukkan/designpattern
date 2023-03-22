package com.example.template;

public class Main {
    public static void main(String[] args) {
        BasicEngineering computer = new ComputerScience();
        BasicEngineering electronics = new Electronics();

        computer.papers();
        electronics.papers();
    }
}
