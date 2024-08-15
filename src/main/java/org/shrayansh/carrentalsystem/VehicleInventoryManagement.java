package org.shrayansh.carrentalsystem;

import org.shrayansh.carrentalsystem.product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {
    private List<Vehicle> vehicleList;

    public VehicleInventoryManagement() {
        vehicleList=new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
