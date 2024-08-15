package org.shrayansh.elevator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorCarController {

    private int elevatorControllerID;

    private ElevatorCar elevatorCar;
    //for down
    private PriorityQueue<Integer> maxPQ;
    //for up
    private PriorityQueue<Integer> minPQ;
    //pending jobs
    private Queue<Integer> pendingJob;

    public ElevatorCarController(int elevatorControllerID) {
        this.elevatorControllerID = elevatorControllerID;
        this.elevatorCar = new ElevatorCar(elevatorControllerID);
        this.maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        this.minPQ = new PriorityQueue<>();
        this.pendingJob = new LinkedList<>();
    }

    public void setInternalDispatcher(InternalButtonDispatcher internalDispatcher) {
        this.elevatorCar.getInternalButton().setInternalButtonDispatcher(internalDispatcher);
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void setElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public void submitNewRequest(int floor, Direction direction){
        int elevatorPosition=elevatorCar.getCurrentFloor();
        Direction elevatorDirection=elevatorCar.getDirection();

        if(elevatorDirection == Direction.UP){
            if(direction == Direction.UP){
                if(floor >= elevatorPosition){
                    minPQ.add(floor);
                }else{
                    pendingJob.add(floor);
                }
            }else{
                maxPQ.add(floor);
            }
        }else{
            if(direction == Direction.DOWN){
                if(floor <= elevatorPosition){
                    maxPQ.add(floor);
                }else{
                    pendingJob.add(floor);
                }
            }else{
                minPQ.add(floor);
            }
        }
    }



    public void controlElevatorCar(){
        while (!minPQ.isEmpty() || !maxPQ.isEmpty() || !pendingJob.isEmpty()){

            if(elevatorCar.getStatus() == Status.IDLE)
                flipStatus();

            //initially we assume lift is going up
            while (!minPQ.isEmpty()){
                int poppedElement=minPQ.poll();
                elevatorCar.getDisplay().display(poppedElement,Direction.UP);
                System.out.println("Popped element is while going up " + poppedElement);
            }

            //pushing pending job to minimum priority queue as it is containing request
            //for going upward direction
            while (!pendingJob.isEmpty()){
                minPQ.add(pendingJob.poll());
            }

            flipDirection();

            //then lift will go down
            while (!maxPQ.isEmpty()){
                int poppedElement=maxPQ.poll();
                elevatorCar.getDisplay().display(poppedElement,Direction.DOWN);
                System.out.println("Popped element is while going down "+poppedElement);
            }

            //pushing pending job to maximum priority queue as it is containing request
            //for going downward direction
            while (!pendingJob.isEmpty()){
                maxPQ.add(pendingJob.poll());
            }

            flipDirection();
        }
    }

    public void flipStatus(){
        Status currentStatus=this.elevatorCar.getStatus();
        Status newStatus = (currentStatus==Status.IDLE)?Status.MOVING:Status.IDLE;
        this.elevatorCar.setStatus(newStatus);
        System.out.println("Status of elevator controller with ID : "+this.getElevatorControllerID()+
                " changed from status : "+currentStatus+" to status : "+newStatus);
    }

    public void flipDirection(){
        Direction currentDirection=this.elevatorCar.getDirection();
        Direction newDirection=(currentDirection==Direction.UP)?Direction.DOWN:Direction.UP;
        this.elevatorCar.setDirection(newDirection);
        System.out.println("Direction of elevator controller with ID : "+this.getElevatorControllerID()+
                " changed from direction : "+currentDirection+" to direction : "+newDirection);
    }


    public Integer getElevatorControllerID() {
        return elevatorControllerID;
    }

    public void setElevatorControllerID(Integer elevatorControllerID) {
        this.elevatorControllerID = elevatorControllerID;
    }
}
