package ro.sci.management.HotelApp;
/**
 * HotelApp is the main class of the app. It contains Contact, Room, Client and Staff information.
 * For Room, here are displayed the room types and their availabilty and status.
 * Guest should enter a room type and then get the numbers of available rooms. Next, Guest enters a room number.
 * If e.g.'cleaning' is true, e.g. Guest is satisfied, Hotel gets Rating.
 *
 *
 */

import ro.sci.management.Room;

import java.util.ArrayList;
import java.util.List;

public class HotelApp {


    public static void main (String args[]) {

        System.out.println("Welcome to our hotel! Enjoy your stay");

       List<Room> rooms;
        rooms = new ArrayList<Room>();


        for (int i=1; i<33; i++) {
            Room room1;
            room1 = new Room();
            room1.setNumber(i);
            room1.setType("SINGLE");
            rooms.add(room1);
            System.out.println (room1.getNumber () +" "+ room1.getType ());

                    }

        for (int i=5; i<15; i++ ) {
            Room room1 = new Room();
            room1.setNumber(i);
            room1.setOccupied(true);
            rooms.add(room1);
            System.out.println (room1.getNumber () +" "+ room1.isOccupied ());
        }

        for (int i=34; i<66; i++) {
            Room room2 = new Room();
            room2.setNumber(i);
            room2.setType("DOUBLE");
            room2.setOccupied(true);
            rooms.add(room2);
            System.out.println (room2.getNumber () + room2.getType ()+ room2.isOccupied () );
        }


        for (int i=67; i<100; i++) {
            Room room3 = new Room();
            room3.setNumber(i);
            room3.setType("APARTMENT");
            rooms.add(room3);
            System.out.println (room3.getNumber () +" "+ room3.getType ());
        }

        for (int i=67; i<77; i++) {
            Room room3 = new Room();
            room3.setNumber(i);
            room3.setOccupied(true);
            rooms.add(room3);
            System.out.println (room3.getNumber () +" "+ room3.isOccupied ());
        }


    }

   }
