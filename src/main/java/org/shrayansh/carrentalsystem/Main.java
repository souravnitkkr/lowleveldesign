package org.shrayansh.carrentalsystem;

import org.shrayansh.carrentalsystem.product.Car;
import org.shrayansh.carrentalsystem.product.Vehicle;
import org.shrayansh.carrentalsystem.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VehicleRentalSystem obj=VehicleRentalSystem.getVehicleRentalSystemInstance();
        addUserList(obj);
        addStoreList(obj);

        //0. User come
        User user=obj.getUserList().get(0);

        //1. user search based on the location
        Location location=new Location("FilmCity","Noida","UttarPradesh",201301);
        Store store=obj.getStore(location);
        System.out.println("Store found "+ store);

        //2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicle=store.getVehicle(VehicleType.CAR);

        //3. creating reservation for the particular vehicle
        Reservation reservation=store.createReservation(storeVehicle.get(0),user);

        //4. generate the bill
        Bill bill = new Bill(500,reservation);

        //5. make payment
        Payment payment = new Payment(bill);
        payment.payBill();

        //6. trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation);

    }

    static void addUserList(VehicleRentalSystem obj){
        obj.addUser(new User(1001,"1123456","Ram"));
        obj.addUser(new User(1002,"1123457","Shyam"));
        obj.addUser(new User(1003,"1123458","Honey"));
        obj.addUser(new User(1004,"1123459","Rohini"));
    }

    static void addStoreList(VehicleRentalSystem obj){

        List<Vehicle> vehicleList = getVehicleList();
        VehicleInventoryManagement inventoryManagement=new VehicleInventoryManagement();
        vehicleList.stream().forEach((vehicle -> inventoryManagement.addVehicle(vehicle)));

        Store store1=new Store();
        store1.setStoreId(101);
        Location location1=new Location("Atta Market","Noida","UttarPradesh",812006);
        store1.setLocation(location1);
        store1.setVehicleInventoryManagement(inventoryManagement);


        Store store2=new Store();
        store2.setStoreId(102);
        Location location2=new Location("FilmCity","Noida","UttarPradesh",201301);
        store2.setLocation(location2);
        store2.setVehicleInventoryManagement(inventoryManagement);

        obj.addStore(store1);
        obj.addStore(store2);
    }

    static List<Vehicle> getVehicleList(){
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleId(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle2.setVehicleId(2);
        vehicle2.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;

    }

}
