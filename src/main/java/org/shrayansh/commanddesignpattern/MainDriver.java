package org.shrayansh.commanddesignpattern;

public class MainDriver {

    public static void main(String[] args) {


        //Set up AC object
        AirConditioner airConditioner=new AirConditioner();

        //Set up remote object
        MyRemoteControl remoteControl=new MyRemoteControl();

        //create command and execute commands
        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.pressButton();

        //undo the last operation
        remoteControl.undoAction();
    }

}
