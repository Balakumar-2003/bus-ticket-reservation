package busticket;

public class businfo {
	private int busNumber;
	private boolean Ac;
	private String busName;
	private boolean type;
	private int capacity;
	private int ticketprice;
	businfo (int busno, boolean ac, boolean type,String name,int capacity,int ticketprice ){
		this.busNumber=busno;
		this.Ac=ac;
		this.type=type;
		this.busName=name;
		this.capacity=capacity;
		this.ticketprice=ticketprice;
	}
	public int getbusNumber() {
		return busNumber;
	}
	public void changebusNumber(int busno) {
		this.busNumber=busno;
	}
	public boolean getAc() {
		return Ac;
	}
	public void changeAc(boolean ac) {
		this.Ac =ac;
	}
	public String getname() {
		return busName;
	}
	public void changename(String name) {
		this.busName=name;
	}
	public int getcapacity() {
		return capacity;
	}
	public void changecapacity(int capacity) {
		this.capacity=capacity;
	}
	public int getticketPrice() {
		return ticketprice;
	}
	public void changeticketprice(int ticketprice) {
		this.ticketprice=ticketprice;
	}
	public void displaybusinfo() {
		System.out.println("bus number :"+ busNumber +"\n ac  "+ Ac +"\n bus name  "+ busName +"\n Sleeper "+ type +"\n capacity "+ capacity +"\n ticketprice " + ticketprice ); 
	}

}
