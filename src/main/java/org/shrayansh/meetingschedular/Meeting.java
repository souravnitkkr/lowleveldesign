package org.shrayansh.meetingschedular;

import java.util.List;

public class Meeting {
    private MeetingRoom meetingRoom;
    private List<User> participantList;
    private TimeInterval timeInterval;
    private Notification notification;

    public Meeting(MeetingRoom meetingRoom,List<User> userList,TimeInterval timeInterval){
        this.meetingRoom=meetingRoom;
        this.participantList=userList;
        this.timeInterval=timeInterval;
        this.notification=new Notification(userList);
    }

    public void notifyParticipants(){
        notification.setMessage("Meeting set on "+timeInterval.getDay()+" from "+timeInterval.getStartTime()+" to "+timeInterval.getEndTime());
    }

}
