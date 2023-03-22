package com.example.proxy;

public class Main {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
//        atmMachine.ejectCard();
//        atmMachine.insertCard();
//        atmMachine.insertPin(1234);
//        atmMachine.requestCash(2000);
//        atmMachine.insertCard();
//        atmMachine.insertPin(1234);

//        GetATMData atmData = new ATMMachine();
//        GetATMData atmProxy = new ATMProxy();

        GetATMData atmProxy = atmMachine;

        System.out.println("\nCurrent ATM state " + atmProxy.getATMData());
        System.out.println("\nCash in ATM machine " + atmProxy.getCashInMachine());
    }
}
