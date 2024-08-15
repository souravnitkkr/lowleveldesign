package org.shrayansh.decoratordesignpattern;

public class DriverClass {
    public static void main(String[] args) {
        BasePizza pizza=new MushroomDecorator(new ExtraCheeseDecorator(new FarmHousePizza()));
        System.out.println("Farmhouse pizza with mushroom and extracheese : "+pizza.cost());
        BasePizza pizza1=new ExtraCheeseDecorator(new VegDelightPizza());
        System.out.println("VegDelight pizza with extra cheese : "+pizza1.cost());
    }
}
