package org.shrayansh.elevator;

import java.util.HashMap;
import java.util.Map;

public class InternalButtonDispatcher {

    private Map<Integer,ElevatorCarController> elevatorControllerMap;

    public InternalButtonDispatcher() {
        this.elevatorControllerMap = new HashMap<>();
    }

    public void addElevatorController(ElevatorCarController elevatorController){
        elevatorControllerMap.put(elevatorController.getElevatorControllerID(), elevatorController);
    }

    public void submitRequest(int ecId,int destinationFloorId,Direction dir){
        if(elevatorControllerMap.containsKey(ecId)){
            ElevatorCarController elevatorController=elevatorControllerMap.get(ecId);
            elevatorController.submitNewRequest(destinationFloorId,dir);
        }else{
            System.out.println("ElevatorController does not exist with id : "+ecId);
        }

    }


}
