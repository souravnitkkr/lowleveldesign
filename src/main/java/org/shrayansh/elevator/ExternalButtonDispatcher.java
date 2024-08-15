package org.shrayansh.elevator;

import java.util.ArrayList;
import java.util.List;

public class ExternalButtonDispatcher {

    private List<ElevatorCarController> elevatorControllerList;

    public ExternalButtonDispatcher() {
        this.elevatorControllerList = new ArrayList<>();
    }

    public void addElevatorController(ElevatorCarController elevatorController){
        elevatorControllerList.add(elevatorController);
    }

    public ElevatorCarController getElevator(int floor, Direction direction){
        if(elevatorControllerList != null && !elevatorControllerList.isEmpty()){
            for(ElevatorCarController elevatorController:elevatorControllerList){
                Direction elevatorDirection=elevatorController.getElevatorCar().getDirection();
                int elevatorFloor=elevatorController.getElevatorCar().getCurrentFloor();
                //if elevatorFloor is same as destination floor
                //or elevatorFloor is less than destination floor and elevator is going up
                //or elevatorFloor is greater than destination floor and elevator is going down
                if(elevatorFloor == floor || (elevatorFloor<floor && elevatorDirection == Direction.UP && direction == Direction.UP) ||
                        (elevatorFloor > floor && elevatorDirection == Direction.DOWN && direction == Direction.DOWN)){
                    System.out.println("Elevator controller with elevatorControllerId : " +elevatorController.getElevatorControllerID()+
                            " elevatorDirection : "+elevatorDirection+" elevatorFloor : "+elevatorFloor+" is selected");
                    return elevatorController;
                }
            }
            ElevatorCarController elevatorController=elevatorControllerList.get(0);
            System.out.println("Default elevator controller is selected i.e. elevatorControllerId : "+elevatorController.getElevatorControllerID()+
                    "elevatorDirection : "+elevatorController.getElevatorCar().getDirection()+
                    "elevatorFloor : "+elevatorController.getElevatorCar().getCurrentFloor());
            return elevatorController;
        }
        return null;
    }
}
