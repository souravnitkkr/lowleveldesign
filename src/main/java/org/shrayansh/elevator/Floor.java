package org.shrayansh.elevator;

public class Floor {
    private int floorId;
    private ExternalButton externalButton;

    public Floor(int floorId) {
        this.floorId = floorId;
        this.externalButton=new ExternalButton();
    }

    public int getFloorId() {
        return floorId;
    }

    public void setExternalButtonDispatcher(ExternalButtonDispatcher externalButtonDispatcher){
        this.externalButton.setExternalButtonDispatcher(externalButtonDispatcher);
    }

    public ElevatorCarController pressButton(Direction direction){
        System.out.println("Button pressed from floor : "+floorId+" for direction : "+direction);
        ElevatorCarController elevatorCarController=externalButton.pressButton(floorId,direction);
        return elevatorCarController;
    }
}
