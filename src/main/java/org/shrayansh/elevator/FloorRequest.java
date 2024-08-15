package org.shrayansh.elevator;

public class FloorRequest implements Comparable<FloorRequest>{
    private int floor;
    private Direction direction;

    public FloorRequest(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    @Override
    public int compareTo(FloorRequest o) {
        return this.floor-o.floor;
    }

    public int getFloor() {
        return floor;
    }

    public Direction getDirection() {
        return direction;
    }
}
