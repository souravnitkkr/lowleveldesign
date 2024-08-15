package org.shrayansh.meetingschedular;

import java.util.ArrayList;
import java.util.List;


public class Notification {
    List<User> userList;
    String message;

    public Notification(List<User> userList) {
        this.userList = userList;
    }

    public void setMessage(String message){
        this.message=message;
        notifyUsers();
    }

    private void notifyUsers() {
        for(User user:userList){
            user.notificationReceived(message);
        }
    }


}
