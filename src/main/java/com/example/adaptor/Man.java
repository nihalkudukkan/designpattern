package com.example.adaptor;

public class Man implements Human {
    @Override
    public void walk() {
        System.out.println("Man walks");
    }

    @Override
    public void talk() {
        System.out.println("Man talks");
    }
}
