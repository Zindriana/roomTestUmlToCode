package org.example;

public class RoomObject {

    private String name;
    private String description;

    public RoomObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void interactWithObject() {
        System.out.println("You are interacting with " + this.getName());
    }
}
