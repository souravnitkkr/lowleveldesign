package org.shrayansh.meetingschedular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeetingRoomManager {
    private List<MeetingRoom> meetingRoomList;
    private Map<MeetingRoom,Calender> meetingRoomCalenderMap;

    public MeetingRoomManager() {
        meetingRoomList=new ArrayList<>();
        meetingRoomCalenderMap=new HashMap<>();
    }

    public List<MeetingRoom> getMeetingRoomList() {
        return meetingRoomList;
    }

    public Map<MeetingRoom, Calender> getMeetingRoomCalenderMap() {
        return meetingRoomCalenderMap;
    }

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRoomList.add(meetingRoom);
        meetingRoomCalenderMap.put(meetingRoom,new Calender());
    }

    public void bookMeetingRoom(List<MeetingRoom> availableMeetingRooms,TimeInterval timeInterval,List<User> userList){

        if(availableMeetingRooms.isEmpty()){
            System.out.println("No Available meeting room for this time interval "+timeInterval);
            return;
        }

        int size=availableMeetingRooms.size();
        //selecting random meeting room from the available meeting room
        int roomIndex=(int)(Math.random()*size);
        MeetingRoom meetingRoom=availableMeetingRooms.get(roomIndex);
        System.out.println("Out of "+size+" meeting rooms available, meeting room with id : "+meetingRoom.getId()+" selected")  ;

        Meeting meeting=new Meeting(meetingRoom,userList,timeInterval);

        Calender calender=meetingRoomCalenderMap.get(meetingRoom);
        calender.addTimeInterval(timeInterval);

        meetingRoomCalenderMap.put(meetingRoom,calender);
        meeting.notifyParticipants();
    }

    public List<MeetingRoom> getAllAvailableRooms(int capacity,TimeInterval timeInterval){
        List<MeetingRoom> availableMeetingRoom=new ArrayList<>();

        for(MeetingRoom meetingRoom:meetingRoomList){
            boolean isAvailable=true;
            if(meetingRoom.getCapacity()>=capacity){
                Calender calender=meetingRoomCalenderMap.get(meetingRoom);
                for(TimeInterval bookedTimeInterval:calender.getTimeIntervalList()){
                    if(timeInterval.getDay() == bookedTimeInterval.getDay() &&
                            !(bookedTimeInterval.getStartTime()>=timeInterval.getEndTime() || bookedTimeInterval.getEndTime()<=timeInterval.getStartTime())){
                        isAvailable=false;
                        break;
                    }
                }
            }else{
                isAvailable=false;
            }
            if(isAvailable)
                availableMeetingRoom.add(meetingRoom);
        }
        if(!availableMeetingRoom.isEmpty())
            System.out.println("List of available rooms with capacity = "+capacity+" for time interval = "+timeInterval+" is "+availableMeetingRoom);
        else
            System.out.println("No room available with capacity = "+capacity+" for time interval = "+timeInterval);
        return availableMeetingRoom;
    }

}
