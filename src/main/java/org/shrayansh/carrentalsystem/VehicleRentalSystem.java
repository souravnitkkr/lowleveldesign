package org.shrayansh.carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private List<User> userList;
    private List<Store> storeList;

    private static VehicleRentalSystem vehicleRentalSystem;

    private VehicleRentalSystem(){
        userList=new ArrayList<>();
        storeList=new ArrayList<>();
    }

    public static VehicleRentalSystem getVehicleRentalSystemInstance(){
        if(vehicleRentalSystem == null){
            synchronized (VehicleRentalSystem.class){
                if(vehicleRentalSystem == null){
                    vehicleRentalSystem=new VehicleRentalSystem();
                }
            }
        }
        return vehicleRentalSystem;
    }

    public void addStore(Store store){
        storeList.add(store);
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void removeStore(Store store){
        storeList.remove(store);
    }

    public void removeUser(User user){
        userList.remove(user);
    }

    public Store getStore(Location location){
        for(Store store:storeList){
            if(store.getLocation().getAddress().equals(location.getAddress()))
                return store;
        }
        System.out.println("Getting the store for location "+location);
        return storeList.get(0);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }
}
