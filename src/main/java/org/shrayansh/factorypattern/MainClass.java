package org.shrayansh.factorypattern;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Factory pattern started");
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        shape = shapeFactory.getShape("SQUARE");
        shape.draw();
    }
}
