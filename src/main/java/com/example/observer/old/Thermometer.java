package com.example.observer.old;

import com.example.observer.newobserver.Observable;

public class Thermometer extends Observable {
    public double temperatureInKelvin = -1.0;
    private final String KELVIN_FORMAT = "%,.1fK";
    private final String CELCIUS_FORMAT = "%,.1fC";
    private final String FARENHEIT_FORMAT = "%,.1fF";

    public Thermometer() {
    }

    void driverValue(long value) {
        this.temperatureInKelvin = value/100;
        super.notifyDependents();
    }

    public String getTemperatureKelvin() {
        return String.format(KELVIN_FORMAT, this.temperatureInKelvin);
    }

    public String getTemperatureCelcius() {
        return String.format(CELCIUS_FORMAT, (this.temperatureInKelvin - 273.15));
    }

    public String getTemperatureFarenheit() {
        return String.format(FARENHEIT_FORMAT, (this.temperatureInKelvin - 273.15));
    }
}
