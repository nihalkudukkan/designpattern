package com.example.bridge;

public class Main {
    public static void main(String[] args) {
        RemoteButton tv1 = new TvMute(new TvDevice(1, 200));
        RemoteButton tv2 = new TvPause(new TvDevice(1, 200));

        System.out.println("Test tv with mute");
        tv1.buttonFive();
        tv1.buttonSix();
        tv1.buttonNine();

        System.out.println("\nTest tv with mute");
        tv2.buttonFive();
        tv2.buttonSix();
        tv2.buttonSix();
        tv2.buttonSix();
        tv2.buttonNine();
        tv2.deviceFeedBack();
    }
}
