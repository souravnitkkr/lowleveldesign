package org.shrayansh.meetingschedular;

public class TimeInterval {
    private Day day;
    private int startTime;
    private int endTime;

    public TimeInterval(Day day, int startTime, int endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Day getDay() {
        return day;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "TimeInterval{" +
                "day=" + day +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
