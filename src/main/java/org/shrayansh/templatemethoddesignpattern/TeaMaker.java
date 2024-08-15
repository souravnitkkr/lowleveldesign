package org.shrayansh.templatemethoddesignpattern;

public class TeaMaker extends BeverageMaker{
    @Override
    public void brew() {
        System.out.println("Dripping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add the condiments");
    }
}
