package ru.aston.hometask.Module3.Strategy;

public class Bird extends Animal{

    public Bird(){
        this.flyStrategy = new ActiveFlyStrategy();
    }
}
