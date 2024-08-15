package org.shrayansh.meetingschedular;

public class Location {
    private int floorNo;
    private int buildingNo;

    public Location(int floorNo, int buildingNo) {
        this.floorNo = floorNo;
        this.buildingNo = buildingNo;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "floorNo=" + floorNo +
                ", buildingNo=" + buildingNo +
                '}';
    }
}
