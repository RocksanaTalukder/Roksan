package constructor;

public class Home {
	public String address;
	public int num;
	
	public Home() {};
	
	public Home(String address) {
		this.address = address;
		System.out.println(address);
	}
	public Home(int address) {
		this.num = address;
		System.out.println(address);
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void displayAddress() {
		System.out.println(this.address);
	}
	
	
	
	
	
	
	

		
		
}
	


