package busticket;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class passengerinfo {
	String passengername;
	boolean gender;
	boolean type;
	int busnumber;
	Date date=null;
	Scanner scanner=new Scanner(System.in);
	
	
	passengerinfo(){
		System.out.println("Please enter your name");
		this.passengername=scanner.nextLine();
		System.out.println("What is your gender? \"m/f\"");
		char b =scanner.next().charAt(0);
        if(b=='m') {
        	this.gender=true;
        }
        else {
        	this.gender=false;
        }
	    System.out.println("Enter which type of bus \"Sleeper\"type \"S\" or \"Sitting\"type \"s\" :");
	    char a=scanner.next().charAt(0);
	    if(a=='S') {
	    	this.type=true;
	    }
	    else {
	    	this.type=false;
	    }
	    System.out.println("Enter the bus number");
	    this.busnumber=scanner.nextInt();
	    scanner.nextLine();
	    System.out.println("enter the date in dd-mm-yyyy");
	    String d=scanner.nextLine();
	    SimpleDateFormat dateformat =new SimpleDateFormat("dd-MM-yyyy");
	    
	    try {
	    date=dateformat.parse(d);
	    }catch(ParseException e) {
	    	e.printStackTrace();
	    }
	}
	    public boolean isavailable(ArrayList<businfo> Buses,ArrayList<passengerinfo> passenger) {
	    	int capacity=0;
	    	for(businfo b:Buses) {
	    		if(b.getbusNumber()==busnumber) {
	    			capacity=b.getcapacity();
	    		}
	    	}
	    	int book=0;
	    	for(passengerinfo c:passenger) {
	    		if(c.busnumber==busnumber && c.date.equals(date)) {
	    			book++;
	    		}
	    	}
	    	return book<capacity?true:false;
	    }
	
}
