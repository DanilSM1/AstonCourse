package ru.aston.hometask.Module3.Decorator;

public class SugarCoffee extends AdditionsToCoffeeDecorator{
    public SugarCoffee(Coffee coffee) {
        super(coffee, ", Добавление сахара", 25);
    }
}
