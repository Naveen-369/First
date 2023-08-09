package Bus_Reservation_System;


//Declaratoin of the bus class
public class bus {
    private int bus_no;
    private String driver_name;
    private String Starting_point;
    private String Destination;
    private boolean AC;
    private int capacity;
    bus(int bus_no, String driver_name, String starting_point, String destinatation, boolean AC, int capacity){
        this.bus_no = bus_no;
        this.driver_name=driver_name;
        this.Starting_point = starting_point;
        this.Destination = destinatation;
        this.AC = AC;
        this.capacity=capacity;
    }
    void printBusdata(){
        System.out.println("Bus Number : "+bus_no);
        System.out.println("Driver Name : "+driver_name);
        System.out.println("Travel : "+Starting_point+"  ->TO->  "+Destination);
        System.out.println("Capacity : "+capacity);
        if(AC == true)System.out.println("Air Conditioned");
    }
    //Get the bus capacity and ac status : 
    int getcapacity(){
        return capacity;
    }
    int getACcondition(){
        if(AC==true)
            return 1;
        return 0;
    }
    //Set the bus capacity
    void ReserveASeat(){
        capacity--;
    }
}
