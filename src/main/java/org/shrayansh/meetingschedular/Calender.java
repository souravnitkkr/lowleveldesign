package org.shrayansh.meetingschedular;


import java.util.ArrayList;
import java.util.List;

public class Calender {
    private List<TimeInterval> timeIntervalList;

    public Calender() {
        timeIntervalList=new ArrayList<>();
    }

    public List<TimeInterval> getTimeIntervalList() {
        return timeIntervalList;
    }

    public void addTimeInterval(TimeInterval timeInterval){
        timeIntervalList.add(timeInterval);
    }
}
