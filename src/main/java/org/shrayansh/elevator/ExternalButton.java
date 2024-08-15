package org.shrayansh.elevator;

public class ExternalButton {
    private ExternalButtonDispatcher externalButtonDispatcher;

    public ExternalButton() {
        externalButtonDispatcher = new ExternalButtonDispatcher();
    }

    public ElevatorCarController pressButton(int floor,Direction direction){
        ElevatorCarController elevatorController=externalButtonDispatcher.getElevator(floor, direction);
        if (elevatorController != null){
            return elevatorController;
        }else {
            System.out.println("No elevator controller configured");
            return null;
        }
    }

    public ExternalButtonDispatcher getExternalButtonDispatcher() {
        return externalButtonDispatcher;
    }

    public void setExternalButtonDispatcher(ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButtonDispatcher = externalButtonDispatcher;
    }
}
