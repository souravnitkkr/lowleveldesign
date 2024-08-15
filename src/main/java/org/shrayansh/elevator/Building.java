package org.shrayansh.elevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Building {
    private List<Floor> floorList;
    private List<ElevatorCarController> elevatorControllerList;
    private InternalButtonDispatcher internalButtonDispatcher;
    private ExternalButtonDispatcher externalButtonDispatcher;
    private Map<Integer,Floor> floorMap;

    public Building() {
        this.floorList = new ArrayList<>();
        this.elevatorControllerList=new ArrayList<>();
        this.internalButtonDispatcher=new InternalButtonDispatcher();
        this.externalButtonDispatcher=new ExternalButtonDispatcher();
        this.floorMap=new HashMap<>();
    }

    public void addFloor(Floor floor){
        floorList.add(floor);
        floorMap.put(floor.getFloorId(),floor);
        floor.setExternalButtonDispatcher(externalButtonDispatcher);
    }

    public void addElevatorController(ElevatorCarController elevatorController){
        elevatorControllerList.add(elevatorController);
        elevatorController.setInternalDispatcher(internalButtonDispatcher);
        internalButtonDispatcher.addElevatorController(elevatorController);
        externalButtonDispatcher.addElevatorController(elevatorController);
    }

    public void moveToDestination(int floorId,int destinationFloorId, Direction dir){
        if(floorMap.containsKey(floorId)){
            Floor floor=floorMap.get(floorId);
            ElevatorCarController elevatorCarController = floor.pressButton(dir);
            System.out.println("Elevator selected with ecId :" +elevatorCarController.getElevatorControllerID());
            elevatorCarController.submitNewRequest(destinationFloorId,dir);
        }else{
            System.out.println("Floor does not exist with id "+floorId);
        }
    }

    public void processRequest(){
        for(ElevatorCarController elevatorController:elevatorControllerList){
            elevatorController.controlElevatorCar();
        }
    }
}
