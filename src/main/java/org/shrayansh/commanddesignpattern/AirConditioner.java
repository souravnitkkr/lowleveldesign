package org.shrayansh.commanddesignpattern;


//receiver class
public class AirConditioner {

    boolean isOn;
    int temperature;

    public void turnOnAC(){
        isOn=true;
        System.out.println("AC is ON");
    }

    public void turnOffAC(){
        isOn=false;
        System.out.println("AC is OFF");
    }

}
