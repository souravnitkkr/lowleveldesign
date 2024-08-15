package org.shrayansh.decoratordesignpattern;

public class MushroomDecorator extends BasePizza{
    private BasePizza pizza;
    public MushroomDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override
    int cost() {
        return pizza.cost()+5;
    }
}
