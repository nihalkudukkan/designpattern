package com.example.builder;

public class Main {
    public static void main(String[] args) {
        Car bens = new CarBuilder().setBrand("Mercedes").setCc(1800).setColor("Black").buildCar();
        System.out.println(bens);
    }
}
