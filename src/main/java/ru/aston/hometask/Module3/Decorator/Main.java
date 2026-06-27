package ru.aston.hometask.Module3.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription());
        System.out.println(simpleCoffee.getCost());
        System.out.println();

        Coffee coffeeWithMilk = new MilkCoffee(simpleCoffee);
        System.out.println(coffeeWithMilk.getDescription());
        System.out.println(coffeeWithMilk.getCost());
        System.out.println();

        Coffee coffeeWithMilkAndSugar = new SugarCoffee(new MilkCoffee(simpleCoffee));
        System.out.println(coffeeWithMilkAndSugar.getDescription());
        System.out.println(coffeeWithMilkAndSugar.getCost());
        System.out.println();

        Coffee coffeeWithMilkAndSugarAndChocolate = new ChocolateCoffee(new SugarCoffee(new MilkCoffee(simpleCoffee)));
        System.out.println(coffeeWithMilkAndSugarAndChocolate.getDescription());
        System.out.println(coffeeWithMilkAndSugarAndChocolate.getCost());
        System.out.println();
    }
}
