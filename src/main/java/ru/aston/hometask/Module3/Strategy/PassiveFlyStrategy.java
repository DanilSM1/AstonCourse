package ru.aston.hometask.Module3.Strategy;

public class PassiveFlyStrategy implements FlyStrategy{

    @Override
    public void fly() {
        System.out.println("Animal is planning");
    }
}
