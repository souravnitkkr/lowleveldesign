package org.shrayansh.elevator;

public class ElevatorCar {
    private int id;
    private Display display;
    private int currentFloor;
    private Direction direction;
    private Status status;
    private InternalButton internalButton;

    public ElevatorCar(int id) {
        this.id = id;
        this.currentFloor = 0;
        this.direction = Direction.UP;
        this.status = Status.IDLE;
        this.display=new Display();
        this.internalButton=new InternalButton(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public void setInternalDispatcher(InternalButtonDispatcher internalDispatcher) {
        this.internalButton.setInternalButtonDispatcher(internalDispatcher);
    }

    public void move(int destinationFloor, Direction direction){
        this.internalButton.pressButton(destinationFloor, direction);
    }
}
