package org.shrayansh.meetingschedular;


public class MeetingRoom {
    private int id;
    private int capacity;
    private Location location;

    public MeetingRoom(int id, int capacity, Location location) {
        this.id = id;
        this.capacity = capacity;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "MeetingRoom{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", location=" + location +
                '}';
    }
}
