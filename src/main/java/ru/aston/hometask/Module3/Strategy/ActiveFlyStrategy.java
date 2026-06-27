package ru.aston.hometask.Module3.Strategy;

public class ActiveFlyStrategy implements FlyStrategy{

    @Override
    public void fly() {
        System.out.println("Animal takes off and flies");
    }
}
