package com.example.statedesign;

public class NoCash implements ATMState {
    ATMMachine atmMachine;

    NoCash(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM out of money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have money. No card entered");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have money.");
    }

    @Override
    public void requestCash(int withDraw) {
        System.out.println("We don't have money.");
    }
}
