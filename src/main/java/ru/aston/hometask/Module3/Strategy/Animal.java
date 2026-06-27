package ru.aston.hometask.Module3.Strategy;

public class Animal {

    FlyStrategy flyStrategy;

    public void fly(){
        flyStrategy.fly();
    }

    public void sound(){
        System.out.println("Animal makes a sound");
    }

    public void hunt(){
        System.out.println("Animal is hunting");
    }

//    public void fly(){
//        System.out.println("Animal is flying");
//    }
}
