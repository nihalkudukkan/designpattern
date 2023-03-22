package com.example.observer.newobserver;

import com.example.observer.old.Setup;
import com.example.observer.old.Thermometer;

public class ObserverThermometerClinet implements Observer{
    public ObserverThermometerClinet() {
    }

    public static void main(String[] args) {
        Setup s = new Setup();
        ObserverThermometerClinet client = new ObserverThermometerClinet();
        s.getThermometer().addObserver(client);
        try {
            Thread.sleep(20000);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        s.shutdown();
    }

    @Override
    public void update(Observable o) {
        Thermometer t = (Thermometer) o;
        System.out.println(
                "Checking temperature: "
                        + t.getTemperatureCelcius()
                        + ", "
                        + t.getTemperatureKelvin()
                        + ", "
                        + t.getTemperatureFarenheit()
        );
    }
}
