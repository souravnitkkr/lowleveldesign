package org.shrayansh.parkinglotmedium;

import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpot;
import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpotFactory;
import org.shrayansh.parkinglotmedium.vehicle.Vehicle;

import java.util.List;

public class EntryPanel {
    private ParkingSpotFactory parkingSpotFactory;
    private int entryPanelId;

    public EntryPanel(int entryPanelId) {
        this.entryPanelId = entryPanelId;
        this.parkingSpotFactory=new ParkingSpotFactory();
    }

    public int getEntryPanelId() {
        return entryPanelId;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) throws Exception {
        ParkingLot parkingLot = ParkingLot.getInstance();
        List<ParkingFloor> parkingFloorList =  parkingLot.getParkingFloorList();
        ParkingFloor parkingFloor = parkingFloorList.stream().filter(floor -> floor.canPark(vehicle)).findFirst().orElse(null);
        if(parkingFloor == null)
            throw new Exception("Parking is unsupported for this " + vehicle.getVehicleType() + " type");

        ParkingSpot parkingSpot = parkingFloor.getAvailableSpot(vehicle);

        if (parkingSpot == null) {
            throw new Exception("No spots are available for " + vehicle.getVehicleType());
        }

        ParkingTicket ticket=generateParkingTicket(vehicle,parkingFloor.getParkingFloorId(), parkingSpot.getParkingSpotId());
        parkingSpot.assignVehicleToSpot(vehicle);
        return ticket;

    }

    private ParkingTicket generateParkingTicket(Vehicle vehicle, int parkingSpotId, int parkingFloorId) {
        ParkingTicket parkingTicket=new ParkingTicket(vehicle.getRegNo(), vehicle.getVehicleType(), parkingSpotId, parkingFloorId);
        return parkingTicket;
    }
}
