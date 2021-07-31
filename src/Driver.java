import model.Ride;
import model.User;
import model.Vehicle;
import service.RideService;
import service.UserService;
import service.VehicleService;

public class Driver {
    public static void main(String[] args) {

        User u1 = UserService.addUser("Rohan","M",36);
        Vehicle v1 = VehicleService.addVehicle(u1,"Swift","KA-01-12345");
        User u2 = UserService.addUser("Shashank","M",29);
        Vehicle v2 = VehicleService.addVehicle(u2,"Baleno","TS-05-62395");
        User u3 = UserService.addUser("Nandini","F",29);
        User u4 = UserService.addUser("Shipra","F",27);
        Vehicle v3 = VehicleService.addVehicle(u4,"Polo","KA-05-41491");
        Vehicle v4 = VehicleService.addVehicle(u4,"Activa","KA-12-12332");
        User u5 = UserService.addUser("Gaurav","M",29);
        User u6 = UserService.addUser("Rahul","M",35);
        Vehicle v5 = VehicleService.addVehicle(u6, "XUV"," KA-05-1234");

        Ride r1=null,r2=null,r3=null,r4=null,r5=null;
        try{
            r1 = RideService.offerRide(u1,"Hyderabad",1,v1,"Bangalore");
            r2 = RideService.offerRide(u4,"Bangalore",1,v4,"Mysore");
            r3 = RideService.offerRide(u4,"Bangalore",2,v3,"Mysore");
            r4 = RideService.offerRide(u2,"Hyderabad",2,v2,"Bangalore");
            r5 = RideService.offerRide(u6,"Hyderabad",5,v5,"Bangalore");
            Ride r6 = RideService.offerRide(u1,"Bangalore",1,v1,"Pune");

        }catch(Exception e){
            System.out.println(e);
        }

        RideService.selectRide(u3,"Bangalore","Mysore",1,"Most Vacant");
        RideService.selectRide(u5,"Bangalore","Mysore",1,"Activa");
        RideService.selectRide(u2,"Mumbai","Bangalore",1,"Most Vacant");
        RideService.selectRide(u1,"Hyderabad","Bangalore",1,"Baleno");
        RideService.selectRide(u2,"Hyderabad","Bangalore",1,"Polo");
        RideService.endRide(r1);
        RideService.endRide(r2);
        RideService.endRide(r3);
        RideService.endRide(r4);
        RideService.printRideStats();


    }
}
