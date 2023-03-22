package com.example.builder;

public class CarBuilder {
    private String brand;
    private String color;
    private int cc;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setCc(int cc) {
        this.cc = cc;
        return this;
    }

    public Car buildCar() {
        return new Car(brand, color, cc);
    }
}
