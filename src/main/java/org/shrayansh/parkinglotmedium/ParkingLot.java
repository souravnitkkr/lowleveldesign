package org.shrayansh.parkinglotmedium;

import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpot;
import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpotType;

import java.util.List;
import java.util.Map;

public class ParkingLot {

    private static ParkingLot parkingLot;
    private List<ParkingFloor> parkingFloorList;
    private List<EntryPanel> entryPanelList;
    private List<ExitPanel> exitPanelList;

    private ParkingLot(){
    }

    public static ParkingLot getInstance(){
        if(parkingLot ==  null){
            synchronized (ParkingLot.class){
                if(parkingLot == null){
                    parkingLot=new ParkingLot();
                }
            }
        }
        return parkingLot;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public List<EntryPanel> getEntryPanelList() {
        return entryPanelList;
    }

    public List<ExitPanel> getExitPanelList() {
        return exitPanelList;
    }

    public ParkingSpot vacateParkingSpot(int parkingSpotId, ParkingSpotType spotType){
        for(ParkingFloor parkingFloor:parkingFloorList){
            Map<ParkingSpotType, List<ParkingSpot>> parkingSpots = parkingFloor.getParkingSpots();
            List<ParkingSpot> parkingSpotList = parkingSpots.get(spotType);
            for(ParkingSpot parkingSpot:parkingSpotList){
                if(parkingSpot.getParkingSpotId() == parkingSpotId && !parkingSpot.isSpotAvailable()) {
                    parkingSpot.removeVehicleFromSpot();
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
