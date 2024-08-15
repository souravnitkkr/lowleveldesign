package org.shrayansh.parkinglotmedium.vehicle;

public enum VehicleType {
    CAR("FOUR_WHEELER"),
    MOTORCYCLE("TWO_WHEELER"),
    ELECTRIC_CAR("FOUR_WHEELER"),
    CYCLE("TWO_WHEELER");

    private String no_of_wheeler;

    VehicleType(String no_of_wheeler){
        this.no_of_wheeler=no_of_wheeler;
    }

    public String getNo_of_wheeler() {
        return no_of_wheeler;
    }
}
