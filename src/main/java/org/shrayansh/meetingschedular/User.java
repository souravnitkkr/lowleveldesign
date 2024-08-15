package org.shrayansh.meetingschedular;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void notificationReceived(String message){
        System.out.println("Hi, "+ name+" "+ message);
    }
}
