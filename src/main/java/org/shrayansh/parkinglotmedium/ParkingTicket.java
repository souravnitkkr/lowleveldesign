package org.shrayansh.parkinglotmedium;

import org.shrayansh.parkinglotmedium.vehicle.VehicleType;

import java.time.LocalDateTime;

public class ParkingTicket {
    int ticketId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    int parkingFloorId;
    int parkingSpotId;
    int amount;
    VehicleType vehicleType;
    String vehicleRegNo;

    public ParkingTicket(String vehicleRegNo, VehicleType vehicleType, int parkingFloorId, int parkingSpotId){
        this.startTime=LocalDateTime.now();
        this.vehicleType=vehicleType;
        this.vehicleRegNo=vehicleRegNo;
        this.ticketId=generateTicketId();
        this.parkingFloorId=parkingFloorId;
        this.parkingSpotId=parkingSpotId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public int getParkingFloorId() {
        return parkingFloorId;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public int getAmount() {
        return amount;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    private int generateTicketId(){
        int min = 10000;
        int max = 99999;
        int randomNumber = (int)(Math.random()*(max-min+1))+min;
        return randomNumber;
    }

    public void setEndTime() {
        this.endTime = LocalDateTime.now();
    }

}
