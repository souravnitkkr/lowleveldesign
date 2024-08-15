package org.shrayansh.elevator;

public class InternalButton {
    private int ecId;
    private InternalButtonDispatcher internalButtonDispatcher;

    public InternalButton(int ecId) {
        this.ecId = ecId;
    }

    public void setInternalButtonDispatcher(InternalButtonDispatcher internalButtonDispatcher) {
        this.internalButtonDispatcher = internalButtonDispatcher;
    }

    public void pressButton(int destinationFloor, Direction direction){
        internalButtonDispatcher.submitRequest(ecId,destinationFloor,direction);
    }
}
