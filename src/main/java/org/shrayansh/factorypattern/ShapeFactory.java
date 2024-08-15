package org.shrayansh.factorypattern;

public class ShapeFactory {

    Shape getShape(String shape){
        switch (shape){
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            case "SQUARE": return new Square();
            default: return null;
        }
    }

}
