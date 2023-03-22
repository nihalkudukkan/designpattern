package com.example.bridge;

public class TvPause extends RemoteButton {

    public TvPause(EntertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void buttonNine() {
        System.out.println("Tv is paused");
    }
}
