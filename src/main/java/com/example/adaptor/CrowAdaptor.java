package com.example.adaptor;

public class CrowAdaptor implements Human {
    Crow crow;

    public CrowAdaptor(Crow crow) {
        this.crow = crow;
    }

    @Override
    public void walk() {
        crow.fly();
    }

    @Override
    public void talk() {
        crow.cry();
    }
}
