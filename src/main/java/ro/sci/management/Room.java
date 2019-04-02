package ro.sci.management;
/**
 * Room attributes + setter and getters
 */


import ro.sci.management.HotelApp.HotelApp;

/**
 * Room types are private
 */
public class Room  extends HotelApp {
    private static Object Room;
    private int number;
    private String type;
    private boolean occupied;
    private boolean cleaned;




   /* public void setType(ro.sci.management.Room.type apartment) {

    }

    enum type {
        SINGLE, DOUBLE, APARTMENT
    }*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isCleaned() {
        return cleaned;
    }

    public void setCleaned(boolean cleaned) {
        this.cleaned = cleaned;
    }




}

   /* private Room(String argType) {
        this.type = argType;

    }

    private String getType() {
        return type;
    }

    private void setName(String type) {
        this.type = type;
    }*/

   /* public static void main(String[] args) {
        roomType();
    }

    private static void roomType() {

        Room roomType1 = new Room("Single");
        roomType1.setType("Single");

        System.out.println("We have " + roomType1.getType() + " rooms available");

        Room roomType2 = new Room("Double");
        roomType2.setType("Double");

        System.out.println("We have " + roomType2.getType() + " rooms available");

        Room roomType3 = new Room("Apartment");
        roomType3.setType ("Apartment";);

        System.out.println("We have " + roomType3.getType() + "s available");
    }
}*/













