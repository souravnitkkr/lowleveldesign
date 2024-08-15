package org.shrayansh.carrentalsystem.product;

import java.util.Date;

public class Vehicle {
    private int vehicleId;
    private int vehicleNumber;
    private int kmDriven;
    private VehicleType vehicleType;
    private Status status;
    private String companyName;
    private String modelName;
    private Date manufacturingDate;
    private int average;
    private int cc;
    private int hourlyRentalCost;
    private int dailyRentalCost;
    private int noOfSeat;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public void setHourlyRentalCost(int hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleNumber=" + vehicleNumber +
                ", kmDriven=" + kmDriven +
                ", vehicleType=" + vehicleType +
                ", status=" + status +
                ", companyName='" + companyName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", average=" + average +
                ", cc=" + cc +
                ", hourlyRentalCost=" + hourlyRentalCost +
                ", dailyRentalCost=" + dailyRentalCost +
                ", noOfSeat=" + noOfSeat +
                '}';
    }
}
