package org.shrayansh.parkinglotmedium.parkingspot;

public class ParkingSpotFactory {

    ParkingSpot getParkingSpot(int spotId,ParkingSpotType parkingSpotType){
        switch (parkingSpotType){
            case TWO_WHEELER : return new TwoWheelerParkingSpot(spotId);
            case FOUR_WHEELER : return new FourWheelerParkingSpot(spotId);
            default : return null;
        }
    }
}
