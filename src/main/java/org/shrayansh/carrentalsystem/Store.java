package org.shrayansh.carrentalsystem;

import org.shrayansh.carrentalsystem.product.Vehicle;
import org.shrayansh.carrentalsystem.product.VehicleType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private int storeId;
    private VehicleInventoryManagement vehicleInventoryManagement;
    private Location location;
    private List<Reservation> reservationList;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public VehicleInventoryManagement getVehicleInventoryManagement() {
        return vehicleInventoryManagement;
    }

    public void setVehicleInventoryManagement(VehicleInventoryManagement vehicleInventoryManagement) {
        this.vehicleInventoryManagement=vehicleInventoryManagement;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Vehicle> getVehicle(VehicleType type){
        System.out.println("Getting list of vehicle for type = "+type);
        return vehicleInventoryManagement.getVehicleList().stream().filter(vehicle -> vehicle.getVehicleType() == type)
                 .collect(Collectors.toList());
    }

    public Reservation createReservation(Vehicle vehicle,User user){
        Reservation reservation=new Reservation(vehicle,user);
        reservation.setBookedFrom(LocalDateTime.now());
        System.out.println("Reservation for ="+reservation);
        return reservation;
    }

    public void completeReservation(Reservation reservation){
        reservation.setReservationStatus(ReservationStatus.COMPLETED);
        reservation.setBookedTill(LocalDateTime.now());
        System.out.println("Reservation completed");
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", vehicleInventoryManagement=" + vehicleInventoryManagement +
                ", location=" + location +
                ", reservationList=" + reservationList +
                '}';
    }
}
