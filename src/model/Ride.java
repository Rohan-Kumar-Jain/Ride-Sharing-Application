package model;

import java.util.ArrayList;

public class Ride {
    private User rideOfferedBy;
    private ArrayList<User> rideAcceptedBy;
    private int seat;
    private String origin;
    private String destination;
    private Vehicle vehicle;
    private boolean isOpened;

    public Ride(User rideOfferedBy, ArrayList<User> rideAcceptedBy, int seat, String origin, String destination, Vehicle vehicle, boolean isOpened) {
        this.rideOfferedBy = rideOfferedBy;
        this.rideAcceptedBy = rideAcceptedBy;
        this.seat = seat;
        this.origin = origin;
        this.destination = destination;
        this.vehicle = vehicle;
        this.isOpened = isOpened;
    }

    public User getRideOfferedBy() {
        return rideOfferedBy;
    }

    public void setRideOfferedBy(User rideOfferedBy) {
        this.rideOfferedBy = rideOfferedBy;
    }

    public ArrayList<User> getRideAcceptedBy() {
        return rideAcceptedBy;
    }

    public void setRideAcceptedBy(ArrayList<User> rideAcceptedBy) {
        this.rideAcceptedBy = rideAcceptedBy;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
