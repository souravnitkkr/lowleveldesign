package org.shrayansh.parkinglot;

import java.util.List;

public class FourWheelerSpotManager extends ParkingSpotManager{
    List<ParkingSpot> fourWheelerSpotList;
    ParkingStrategy parkingStrategy;

    public FourWheelerSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        super(parkingSpotList, parkingStrategy);
    }
}
