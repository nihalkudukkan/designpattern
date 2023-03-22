package com.example.builder;

public class Car {
    private String brand;
    private String color;
    private int cc;

    public Car(String brand, String color, int cc) {
        this.brand = brand;
        this.color = color;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", cc=" + cc +
                '}';
    }
}
