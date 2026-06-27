package ru.aston.hometask.Module3.Strategy;

public class FlyingSquirrel extends Animal{

    public FlyingSquirrel(){
        this.flyStrategy = new PassiveFlyStrategy();
    }
}
