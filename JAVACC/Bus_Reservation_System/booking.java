package Bus_Reservation_System;
import java.util.Date;
public class booking {
    private String passenger_name;
    private int bus_no;
    private Date date;
    booking(String passenger_name, int bus_no){
        this.bus_no=bus_no;
        this.date=new Date();
        this.passenger_name=passenger_name;
    }
    //Displaying the Passenger detail
    void showpassenger(){
        System.out.println("Passenger name : " + passenger_name);
        System.out.println("Preferrred Bus No. : " + bus_no);
        System.out.println("Data of booking : " + date);
    }
}
