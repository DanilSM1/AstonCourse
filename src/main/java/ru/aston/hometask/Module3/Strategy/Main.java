package ru.aston.hometask.Module3.Strategy;

public class Main {
    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal flyingSquirrel = new FlyingSquirrel();

        bird.fly();
        flyingSquirrel.fly();
    }
}
