package org.shrayansh.flyweightdesignpattern.robot;

public class DriverMain {
    public static void main(String[] args) {
        IRobot humanRobot1= RoboticFactory.createRobot("HUMANOID");
        humanRobot1.display(10,11);

        IRobot humanRobot2=RoboticFactory.createRobot("HUMANOID");
        humanRobot2.display(1,2);

        IRobot dogRobot1=RoboticFactory.createRobot("ROBOTICDOG");
        dogRobot1.display(1,2);

        IRobot dogRobot2=RoboticFactory.createRobot("ROBOTICDOG");
        dogRobot2.display(10,11);
    }
}
