package org.shrayansh.templatemethoddesignpattern;

public abstract class BeverageMaker {

    public void boilWater(){
        System.out.println("Boil water");
    }
    public abstract void brew();
    public abstract void addCondiments();
    public void pourInCup(){
        System.out.println("Pour in cup");
    }


    public final void makeBeverage(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
}
