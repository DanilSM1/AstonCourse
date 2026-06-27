package ru.aston.hometask.Module3.Adapter;

public class Main {
    public static void main(String[] args) {
        TemperatureInterface cels1 = new FahrenheitAdapter(new FahrenheitSensor());
        TemperatureInterface cels2 = new KelvinAdapter(new KelvinSensor());

        System.out.println("Температура из Фаренгейта: " + cels1.getTemperature() + "C");
        System.out.println("Температура из Кельвина: " + cels2.getTemperature() + "C");
    }
}
