package org.shrayansh.mementodesignpattern;

public class DriverMain {
    public static void main(String[] args) {

        ConfigurationCareTaker careTakerObj=new ConfigurationCareTaker();

        //initializing the configuration originator
        ConfigurationOriginator originator=new ConfigurationOriginator(7,8);

        //saving it
        ConfigurationMemento snapShot1 =  originator.createMemento();

        //adding in the caretaker history
        careTakerObj.addMemento(snapShot1);

        //changing the state of originator
        originator.setHeight(10);
        originator.setWidth(15);

        //saving the state
        ConfigurationMemento snapShot2 = originator.createMemento();

        //Adding it to the history
        careTakerObj.addMemento(snapShot2);

        //originator changing the state again
        originator.setHeight(18);
        originator.setWidth(20);

        //UNDO
        ConfigurationMemento mementoToBeUndoState = careTakerObj.undo();

        //restore memento
        originator.restoreMemento(mementoToBeUndoState);

        System.out.println("Restored height : "+originator.height + " width : "+originator.width);

    }
}
