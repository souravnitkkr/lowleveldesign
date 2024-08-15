package org.shrayansh.parkinglotmedium;

import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpotType;

public class DisplayBoard {
    void displayBoard(ParkingSpotType parkingSpotType,int freeSpots){
        String message = parkingSpotType + " spots free: "+freeSpots;
        System.out.println(message);
    }
}
