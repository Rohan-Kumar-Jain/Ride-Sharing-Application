package service;

import model.Ride;
import model.User;
import model.Vehicle;
import repository.Repository;

import java.util.ArrayList;

public class RideService {
    public static Ride offerRide(User name, String origin, int seat, Vehicle vehicle, String des) throws Exception {
        boolean b = (validateUser(name,vehicle) && validateVehicle(vehicle));
        if(b){
            vehicle.setBooked(true);
            Ride r =  new Ride(name,new ArrayList<>(),seat,origin,des,vehicle,true);
            Repository.rideArrayList.add(r);
            return r;
        }else{
            throw new Exception("This call should fail, since a ride has already been offered by this user for this vehicle.");
        }
    }

    public static boolean validateUser(User u, Vehicle v){
        if(v.getUser().getName().equals(u.getName())){
            return true;
        }else{
            return false;
        }
    }

    public static boolean validateVehicle(Vehicle v){
        return !v.getBooked();
    }

    public static void endRide(Ride r){
        r.setOpened(false);
        r.getVehicle().setBooked(false);
    }

    public static void selectRide(User u, String origin, String des, int seat,String vehicle){
        ArrayList<Ride> rideArrayList = Repository.rideArrayList;
        int max = 0;Ride r = null;
        for(int i=0;i<Repository.rideArrayList.size();i++){
            if(origin.equals(Repository.rideArrayList.get(i).getOrigin()) && des.equals(Repository.rideArrayList.get(i).getDestination())){
                if(seat<=Repository.rideArrayList.get(i).getSeat()){
                    if(vehicle.equals("Most Vacant")){
                        if(max<Repository.rideArrayList.get(i).getSeat()){
                            r = rideArrayList.get(i);
                            max = Repository.rideArrayList.get(i).getSeat();
                        }
                    }else{
                        String vehiclename = vehicle;
                        if(vehiclename.equals(Repository.rideArrayList.get(i).getVehicle().getName())){
                            r = rideArrayList.get(i);
                            break;
                        }
                    }
                }
            }
        }
        if(r != null){
            r.getRideAcceptedBy().add(u);
            r.setSeat(r.getSeat()-seat);
        }

    }

    public static void printRideStats(){
        ArrayList<User> users = Repository.userArrayList;
        ArrayList<Ride> rides = Repository.rideArrayList;

        for(int i=0;i<users.size();i++){
            int taken=0;
            int offered = 0;
            for(int j=0;j<rides.size();j++){
                if(!rides.get(j).isOpened()) {
                    if (rides.get(j).getRideOfferedBy().getName().equals(users.get(i).getName())) {
                        offered++;
                    }
                    ArrayList<User> us = rides.get(j).getRideAcceptedBy();

                    for (int k = 0; k < us.size(); k++) {
                        if (us.get(k).getName().equals(users.get(i).getName())) {
                            taken++;
                        }
                    }
                }
            }
            System.out.print(users.get(i).getName()+": ");
            System.out.println(taken+" Taken,"+offered+" offered");
        }
    }
}
