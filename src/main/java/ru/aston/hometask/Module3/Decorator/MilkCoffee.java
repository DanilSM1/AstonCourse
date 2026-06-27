package ru.aston.hometask.Module3.Decorator;

public class MilkCoffee extends AdditionsToCoffeeDecorator{
    public MilkCoffee(Coffee coffee) {
        super(coffee, ", Добавление молока", 50);
    }
}
