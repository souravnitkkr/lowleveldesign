package org.shrayansh.parkinglotmedium.account;

public class ParkingAttendant extends Account{
    public ParkingAttendant(String username, String password) {
        super(username, password);
    }

    public boolean processTicket(){
        return false;
    }
}
