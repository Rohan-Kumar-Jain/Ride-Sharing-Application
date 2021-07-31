package model;

public class Vehicle {
    private User user;
    private String name;
    private String number;
    private Boolean isBooked;

    public Vehicle(User user, String name, String number) {
        this.user = user;
        this.name = name;
        this.number = number;
        this.isBooked = false;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }
}
