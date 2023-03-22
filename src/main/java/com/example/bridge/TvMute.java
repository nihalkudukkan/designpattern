package com.example.bridge;

public class TvMute extends RemoteButton {
    public TvMute(EntertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void buttonNine() {
        System.out.println("Tv is muted");
    }
}
