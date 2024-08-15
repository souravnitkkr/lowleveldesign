package org.shrayansh.parkinglotmedium;

import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpot;
import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpotType;
import org.shrayansh.parkinglotmedium.vehicle.Vehicle;
import org.shrayansh.parkinglotmedium.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingFloor {
    private int parkingFloorId;
    private Map<ParkingSpotType, List<ParkingSpot>> parkingSpots;
    private DisplayBoard displayBoard;

    public ParkingFloor(int parkingFloorId) {
        this.parkingFloorId = parkingFloorId;
        parkingSpots = new HashMap<>();
        parkingSpots.put(ParkingSpotType.TWO_WHEELER,new ArrayList<ParkingSpot>());
        parkingSpots.put(ParkingSpotType.FOUR_WHEELER,new ArrayList<ParkingSpot>());
        displayBoard = new DisplayBoard();
    }

    public int getParkingFloorId() {
        return parkingFloorId;
    }

    public Map<ParkingSpotType, List<ParkingSpot>> getParkingSpots() {
        return parkingSpots;
    }




    public ParkingSpot getAvailableSpot(Vehicle vehicle){
        ParkingSpotType parkingSpotType=getSpotTypeFromVehicleType(vehicle.getVehicleType());
        List<ParkingSpot> parkingSpotList=parkingSpots.get(parkingSpotType);
        if(!parkingSpotList.isEmpty()){
            for(ParkingSpot parkingSpot:parkingSpotList){
                if(parkingSpot.isSpotAvailable())
                    return parkingSpot;
            }
        }
        return null;
    }

    public void showDisplayBoard(Vehicle vehicle){
        ParkingSpotType parkingSpotType=getSpotTypeFromVehicleType(vehicle.getVehicleType());
        List<ParkingSpot> parkingSpotList = parkingSpots.get(parkingSpotType);
        long count=parkingSpots.isEmpty() ? 0 : parkingSpotList.stream().filter(spot -> spot.isSpotAvailable()).count();
        displayBoard.displayBoard(parkingSpotType,(int)count);
    }

    public ParkingSpotType getSpotTypeFromVehicleType(VehicleType vehicleType){
        switch (vehicleType){
            case CAR:
            case ELECTRIC_CAR : return ParkingSpotType.FOUR_WHEELER;
            case CYCLE:
            case MOTORCYCLE : return ParkingSpotType.TWO_WHEELER;
        }
        return null;
    }

    public List<ParkingSpot> getInUseSpotID(VehicleType vehicleType){
        ParkingSpotType parkingSpotType=getSpotTypeFromVehicleType(vehicleType);
        List<ParkingSpot> parkingSpotList = parkingSpots.get(parkingSpotType);
        if(parkingSpotList != null)
            return parkingSpotList.stream().filter(spot -> !spot.isSpotAvailable()).collect(Collectors.toList());
        return new ArrayList<>();
    }

    public boolean canPark(Vehicle vehicle){
        ParkingSpotType parkingSpotType=getSpotTypeFromVehicleType(vehicle.getVehicleType());
        List<ParkingSpot> parkingSpotList=parkingSpots.get(parkingSpotType);
        if(!parkingSpotList.isEmpty())
            return true;
        return false;
    }
}
