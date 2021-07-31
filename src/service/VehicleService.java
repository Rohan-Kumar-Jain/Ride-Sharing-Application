package service;

import model.User;
import model.Vehicle;
import repository.Repository;

public class VehicleService {

    public static Vehicle addVehicle(User user, String name, String number){
        Vehicle v = new Vehicle(user,name,number);
        Repository.vehicleArrayList.add(v);
        return v;
    }

}
