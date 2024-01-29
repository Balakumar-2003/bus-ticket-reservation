package busticket;
import java.util.ArrayList;
import java.util.*;
public class ticketreservation {
	public static void main(String args[]) {
		ArrayList<businfo> Buses=new ArrayList<businfo>();
		ArrayList<passengerinfo> passenger =new ArrayList<passengerinfo>();
		
		Buses.add(new businfo(1,true,true,"balabus",2,450));
		Buses.add(new businfo(2,false,false,"haribus",5,250));
		Buses.add(new businfo(3,true,true,"karthibus",5,450));
		Buses.add(new businfo(4,true,true,"gunabus",5,450));
		for(businfo b:Buses) {
		    b.displaybusinfo();
		}
		Scanner scannner=new Scanner(System.in);
		int option=1;
		while(option==1) {
			System.out.println("type 1 for booking and 2 for closing");
			option=scannner.nextInt();
			 if(option==1) {
				 passengerinfo booking=new passengerinfo();
				 if(booking.isavailable(Buses,passenger)) {
				     	 passenger.add(booking);
					     System.out.println("booking confirmed \nThank you for booking");
					 }
			        else {
				        System.out.println("Sorry,bus is full. try another bus");
			     }
		    }
	    }
    }
}