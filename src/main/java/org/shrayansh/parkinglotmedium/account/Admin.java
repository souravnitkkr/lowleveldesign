package org.shrayansh.parkinglotmedium.account;

import org.shrayansh.parkinglotmedium.EntryPanel;
import org.shrayansh.parkinglotmedium.ExitPanel;
import org.shrayansh.parkinglotmedium.ParkingFloor;
import org.shrayansh.parkinglotmedium.ParkingLot;
import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpot;
import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpotType;

import java.util.List;

public class Admin extends Account{

    public Admin(String username, String password) {
        super(username, password);
    }

    public boolean addParkingFloor(ParkingFloor parkingFloor){
        List<ParkingFloor> parkingFloorList = ParkingLot.getInstance().getParkingFloorList();
        boolean floorExist = parkingFloorList.stream().anyMatch((floor)->floor.getParkingFloorId()==parkingFloor.getParkingFloorId());
        if(!floorExist) {
            parkingFloorList.add(parkingFloor);
            return true;
        }
        return false;
    }

    public boolean addParkingSpot(int floorId, ParkingSpot parkingSpot) throws Exception {
        List<ParkingFloor> parkingFloorList=ParkingLot.getInstance().getParkingFloorList();

        ParkingFloor parkingFloor = parkingFloorList.stream().filter((floor)->floor.getParkingFloorId()==floorId).findFirst().orElse(null);
        if(parkingFloor == null){
            throw new Exception("Invalid floor with floorId = "+floorId);
        }

        ParkingSpotType spotType=parkingSpot.getParkingSpotType();

        ParkingSpot existingParkingSpot = parkingFloor.getParkingSpots().get(spotType).stream()
                .filter((spot)->spot.getParkingSpotId()==parkingSpot.getParkingSpotId())
                .findFirst().orElse(null);

        if(existingParkingSpot != null){
            throw new Exception("ParkingSpot already exist with spotId = "+parkingSpot.getParkingSpotId());
        }

        parkingFloor.getParkingSpots().get(spotType).add(parkingSpot);
        return true;
    }

    public void addEntryPanel(EntryPanel entryPanel) throws Exception {
        List<EntryPanel> entryPanelList = ParkingLot.getInstance().getEntryPanelList();
        boolean isExists = entryPanelList.stream().anyMatch(panel->panel.getEntryPanelId() == entryPanel.getEntryPanelId());
        if(isExists == true)
            throw new Exception("Entry Panel already exists with id = "+entryPanel.getEntryPanelId());
        entryPanelList.add(entryPanel);
    }

    public void addExitPanel(ExitPanel exitPanel) throws Exception {
        List<ExitPanel> exitPanelList = ParkingLot.getInstance().getExitPanelList();
        boolean isExists = exitPanelList.stream().anyMatch(panel->panel.getExitPanelId() == exitPanel.getExitPanelId());
        if(isExists)
            throw new Exception("Exit Panel already exists with id = "+exitPanel.getExitPanelId());
        exitPanelList.add(exitPanel);
    }
}
