package org.shrayansh.carrentalsystem;

public class User {
    private int userId;
    private String drivingLicense;
    private String userName;

    public User(int userId, String drivingLicense, String userName) {
        this.userId = userId;
        this.drivingLicense = drivingLicense;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
