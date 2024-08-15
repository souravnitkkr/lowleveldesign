package org.shrayansh.carrentalsystem;

import org.shrayansh.carrentalsystem.product.Vehicle;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationId;
    private User user;
    private Vehicle vehicle;
    private LocalDateTime bookingDate;
    private LocalDateTime bookedFrom;
    private LocalDateTime bookedTill;
    private Long fromTimeStamp;
    private Long tillTimeStamp;
    private Location pickUpLocation;
    private Location dropLocation;
    private ReservationStatus reservationStatus;
    private Location location;

    public Reservation(Vehicle vehicle,User user){
        this.user=user;
        this.vehicle=vehicle;
        this.reservationId = (int)(Math.random() *(99999-10000)+10000);
        bookingDate= LocalDateTime.now();
        reservationStatus=ReservationStatus.SCHEDULED;
    }

    public int getReservationId() {
        return reservationId;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDateTime getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(LocalDateTime bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public LocalDateTime getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(LocalDateTime bookedTill) {
        this.bookedTill = bookedTill;
    }

    public Long getFromTimeStamp() {
        return fromTimeStamp;
    }

    public void setFromTimeStamp(Long fromTimeStamp) {
        this.fromTimeStamp = fromTimeStamp;
    }

    public Long getTillTimeStamp() {
        return tillTimeStamp;
    }

    public void setTillTimeStamp(Long tillTimeStamp) {
        this.tillTimeStamp = tillTimeStamp;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", user=" + user +
                ", vehicle=" + vehicle +
                ", bookingDate=" + bookingDate +
                ", bookedFrom=" + bookedFrom +
                ", bookedTill=" + bookedTill +
                ", fromTimeStamp=" + fromTimeStamp +
                ", tillTimeStamp=" + tillTimeStamp +
                ", pickUpLocation=" + pickUpLocation +
                ", dropLocation=" + dropLocation +
                ", reservationStatus=" + reservationStatus +
                ", location=" + location +
                '}';
    }
}
