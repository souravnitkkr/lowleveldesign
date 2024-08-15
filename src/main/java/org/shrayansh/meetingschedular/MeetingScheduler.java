package org.shrayansh.meetingschedular;

import java.util.ArrayList;
import java.util.List;

public class MeetingScheduler {

    private MeetingRoomManager meetingRoomManager;

    public static void main(String[] args) {
        MeetingScheduler meetingScheduler=new MeetingScheduler();
        meetingScheduler.initialize();
        meetingScheduler.scheduleMeeting();

    }

    private void scheduleMeeting(){
        TimeInterval timeInterval1=new TimeInterval(Day.MONDAY,10,14);
        List<User> userList=new ArrayList<>();
        userList.add(new User("Rahul"));
        userList.add(new User("Rajat"));
        userList.add(new User("Sourav"));
        userList.add(new User("Manish"));
        List<MeetingRoom> availableMeetingRoom=meetingRoomManager.getAllAvailableRooms(4,timeInterval1);
        meetingRoomManager.bookMeetingRoom(availableMeetingRoom,timeInterval1,userList);

        userList.add(new User("Aviral"));
        TimeInterval timeInterval2=new TimeInterval(Day.MONDAY,11,13);
        availableMeetingRoom=meetingRoomManager.getAllAvailableRooms(5,timeInterval2);
        meetingRoomManager.bookMeetingRoom(availableMeetingRoom,timeInterval2,userList);

        TimeInterval timeInterval3=new TimeInterval(Day.MONDAY,10,12);
        availableMeetingRoom=meetingRoomManager.getAllAvailableRooms(5,timeInterval3);
        meetingRoomManager.bookMeetingRoom(availableMeetingRoom,timeInterval3,userList);
    }

    private void initialize(){
        meetingRoomManager=new MeetingRoomManager();
        MeetingRoom meetingRoom1=new MeetingRoom(1,3,new Location(1,1));
        MeetingRoom meetingRoom2=new MeetingRoom(2,4,new Location(2,1));
        MeetingRoom meetingRoom3=new MeetingRoom(3,4,new Location(3,1));
        MeetingRoom meetingRoom4=new MeetingRoom(4,5,new Location(4,1));
        MeetingRoom meetingRoom5=new MeetingRoom(5,3,new Location(5,1));
        meetingRoomManager.addMeetingRoom(meetingRoom1);
        meetingRoomManager.addMeetingRoom(meetingRoom2);
        meetingRoomManager.addMeetingRoom(meetingRoom3);
        meetingRoomManager.addMeetingRoom(meetingRoom4);
        meetingRoomManager.addMeetingRoom(meetingRoom5);
    }
}
