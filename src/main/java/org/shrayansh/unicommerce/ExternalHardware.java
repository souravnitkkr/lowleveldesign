package org.shrayansh.unicommerce;

public class ExternalHardware {

    private AlarmClock alarmClock;

    public ExternalHardware() {
        this.alarmClock = new AlarmClock();
    }

    public void writeMsg(){
        for(int i=0;i<10;i++){
            Message message=new Message("This is the msg"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            alarmClock.readMsg(message);
        }
    }

    public void processMsg(){
        alarmClock.processMsg();
    }

}
