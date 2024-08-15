package org.shrayansh.flyweightdesignpattern.robot;

public class RoboticDog implements IRobot {

    private String type;
    private Sprite body; //small 2d bitmap (graphic element)

    public RoboticDog(String type, Sprite body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprite getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("use the robotic dog sprites object");
        System.out.println("and X ="+x+" and Y ="+y+ " to render the object");
    }
}
