package org.shrayansh.parkinglotmedium.parkingspot;

import org.shrayansh.parkinglotmedium.vehicle.Vehicle;

abstract public class ParkingSpot {
    private int parkingSpotId;
    private ParkingSpotType parkingSpotType;
    private Vehicle vehicle;
    private boolean isSpotAvailable;

    public ParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.vehicle=null;
        this.isSpotAvailable=true;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isSpotAvailable() {
        return isSpotAvailable;
    }

    public void setSpotAvailable(boolean spotAvailable) {
        isSpotAvailable = spotAvailable;
    }

    public void assignVehicleToSpot(Vehicle vehicle) throws Exception {
        if(!this.isSpotAvailable)
            throw new Exception("No spot is available now for parking spot type "+this.parkingSpotType+"!");
        this.vehicle=vehicle;
        this.isSpotAvailable=false;
    }

    public void removeVehicleFromSpot(){
        this.vehicle=null;
        this.isSpotAvailable=true;
    }



}
