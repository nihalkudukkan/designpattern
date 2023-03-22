package com.example.proxy;

public class HasPin implements ATMState {
    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You cant enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Already entered pin");
    }

    @Override
    public void requestCash(int withDraw) {
        if (withDraw>atmMachine.cashInMachine) {
            System.out.println("Don't have enough cash");
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(withDraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - withDraw);
            System.out.println("card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
            if (atmMachine.cashInMachine<=0) {
                System.out.println("card ejected, atm has no cash");
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }
}
