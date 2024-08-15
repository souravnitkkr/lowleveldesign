package org.shrayansh.elevator;


public class ElevatorMainClass {
    public static void main(String[] args) {
        Building building = new Building();
        building.addFloor(new Floor(0));
        building.addFloor(new Floor(1));
        building.addFloor(new Floor(2));
        building.addFloor(new Floor(3));
        building.addFloor(new Floor(4));
        building.addFloor(new Floor(5));

        building.addElevatorController(new ElevatorCarController(1));
        building.addElevatorController(new ElevatorCarController(2));

        building.moveToDestination(0,4,Direction.UP);
        building.moveToDestination(1,3,Direction.UP);
        building.moveToDestination(4,1,Direction.DOWN);

        building.processRequest();

    }
}
