package org.shrayansh.parkinglot;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager{
    List<ParkingSpot> twoWheelerSpotList;
    ParkingStrategy parkingStrategy;

    public TwoWheelerSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        super(parkingSpotList, parkingStrategy);
    }
}
