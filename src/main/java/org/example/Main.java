package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UI ui = new UI();

        Room library = new Room(1, "library");
        Room meetingHall = new Room(2, "meetingHall");
        Room cafe = new Room(3, "cafe");

        library.addRoomObject(new RoomObject("Desk", "A white desk"));
        library.addRoomObject(new RoomObject("Table", "A black table"));

        cafe.addRoomObject(new RoomObject("Chair", "A small chair"));

        System.out.println(library.getRoomObject("Desk").getDescription());
        cafe.getRoomObject("Chair").interactWithObject();

        System.out.println("1: Shelf, 2: Table, 3: Chair");
        System.out.println("Choose which object that you want to interact with.");
//        int index = sc.nextInt();
//        ui.interactWithObject(index);



    }
}