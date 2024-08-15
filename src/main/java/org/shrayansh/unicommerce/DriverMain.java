package org.shrayansh.unicommerce;

public class DriverMain {
    public static void main(String[] args) {
        ExternalHardware externalHardware=new ExternalHardware();
        externalHardware.writeMsg();
        externalHardware.processMsg();
    }
}
