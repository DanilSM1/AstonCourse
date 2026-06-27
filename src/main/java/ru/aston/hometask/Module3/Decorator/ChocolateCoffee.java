package ru.aston.hometask.Module3.Decorator;

public class ChocolateCoffee extends AdditionsToCoffeeDecorator{
    public ChocolateCoffee(Coffee coffee) {
        super(coffee, ", Добавление шоколада", 40);
    }
}
