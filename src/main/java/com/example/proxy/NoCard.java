package com.example.proxy;

public class NoCard implements ATMState {
    ATMMachine atmMachine;

    NoCard(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter pin");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter card first");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter card first");
    }

    @Override
    public void requestCash(int withDraw) {
        System.out.println("Enter card first");
    }
}
