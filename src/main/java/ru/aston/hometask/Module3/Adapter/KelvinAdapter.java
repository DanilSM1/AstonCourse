package ru.aston.hometask.Module3.Adapter;

public class KelvinAdapter implements TemperatureInterface{

    private KelvinSensor sensor;

    public KelvinAdapter(KelvinSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperature() {
        double kelvin = sensor.getKelvin();
        return kelvin - 273.15;
    }
}
