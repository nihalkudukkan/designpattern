package com.example.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Device nihalsTv = TvRemote.getTv("nihal");
        Device fasalsTv = TvRemote.getTv("fasal");
        Device sahalsTv = TvRemote.getTv("sahal");
//        Command turnOn = new TurnOn(nihalsTv);
//        Button onPress = new Button(turnOn);
//        onPress.press();

        List<Device> devices = new ArrayList<>(Arrays.asList(nihalsTv, fasalsTv, sahalsTv));
        Command turnOnAll = new TurnOnAll(devices);
        Button onPress = new Button(turnOnAll);
        onPress.press();
    }
}
