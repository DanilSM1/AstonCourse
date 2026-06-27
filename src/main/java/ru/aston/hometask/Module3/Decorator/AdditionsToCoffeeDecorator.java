package ru.aston.hometask.Module3.Decorator;

public class AdditionsToCoffeeDecorator implements Coffee{

    private Coffee coffee;
    private String description;
    private int cost;

    public AdditionsToCoffeeDecorator(Coffee coffee, String description, int cost) {
        this.coffee = coffee;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + this.description;
    }

    @Override
    public int getCost() {
        return this.cost + coffee.getCost();
    }
}
