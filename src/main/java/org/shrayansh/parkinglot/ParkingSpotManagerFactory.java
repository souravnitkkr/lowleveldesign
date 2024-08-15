package org.shrayansh.parkinglot;

import java.util.List;

public class ParkingSpotManagerFactory {

    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> parkingSpotList,
                                             ParkingStrategy parkingStrategy){
        switch (vehicleType){
            case TWO_WHEELER:return new TwoWheelerSpotManager(parkingSpotList,parkingStrategy);
            case FOUR_WHEELER:return new FourWheelerSpotManager(parkingSpotList,parkingStrategy);
            default:return null;
        }
    }

}
