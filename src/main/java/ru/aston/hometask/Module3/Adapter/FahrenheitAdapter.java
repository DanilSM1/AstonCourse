package ru.aston.hometask.Module3.Adapter;

public class FahrenheitAdapter implements TemperatureInterface {

    private FahrenheitSensor fahrenheitSensor;

    public FahrenheitAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature() {
        double fahrenheit = fahrenheitSensor.getFahrenheit();
        return (fahrenheit - 32) / 1.8;
    }
}
