package org.example;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int roomNumber;
    private String roomName;
    private List<RoomObject> listOfRoomObjects = new ArrayList<RoomObject>();

    public Room(int roomNumber, String roomName) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void addRoomObject(RoomObject roomObject) {
        listOfRoomObjects.add(roomObject);
    }

    public RoomObject getRoomObject(String name) {
        for (RoomObject roomObject : listOfRoomObjects) {
            if(roomObject.getName().equals(name)) {
                return roomObject;
            }
        }
        System.out.println("Room object not found");
        return null;
    }

}
