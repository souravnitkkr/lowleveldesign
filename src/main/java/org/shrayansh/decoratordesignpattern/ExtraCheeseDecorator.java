package org.shrayansh.decoratordesignpattern;

public class ExtraCheeseDecorator extends ToppingDecorator{
    private BasePizza basePizza;
    public ExtraCheeseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    int cost() {
        return basePizza.cost()+10;
    }
}
