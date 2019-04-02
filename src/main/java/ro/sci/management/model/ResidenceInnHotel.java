package ro.sci.management.model;
/**
 * Model of a Hotel
 */


import ro.sci.management.Contact;
import ro.sci.management.Room;
import ro.sci.management.Staff;

import java.util.List;

public class ResidenceInnHotel<setRoom> implements Contact {
    private int Rating = 0;
    private String adress;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    private String email;
    private List<Room> rooms;
    private List<Staff> staff;

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaf(List<Staff> staff) {
        this.staff = staff;
    }



    public void enterName() {

        final String firstName;
        firstName = "ResidenceInn";
        final String secondName;
        secondName = "Mariott";

        System.out.println("Welcome to " + firstName + secondName + "!" + "" +
                " Enjoy the experiece!");


    }


    public void createAddress() {

        final String streetName;
        streetName = "West Century Boulevard";
        final int streetNumber = 5963;
        final String city = "Los Angeles";
        final String country = "USA";

        System.out.println("We are located on " + streetNumber + ", " + streetName + ", " + city + ", " + country + ". " );
    }

    public void defineEmail() {
        final String email;
        email = "residence_inn@mariott_hotels.com";
        System.out.println("You can contact us by email: " + email + " or by phone: +1 310-568-770. " +
                "Our operators are always there to answer.");


    }
    public static void main(String[] args) {
        Contact contact;
        contact = new ResidenceInnHotel();
        contact.enterName();
        contact.createAddress();
        contact.defineEmail();

            }



}



