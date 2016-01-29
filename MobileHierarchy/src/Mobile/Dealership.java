package Mobile;

public class Dealership extends Seller {

	private String address;
	
	public Dealership(String userName, String password, String phoneNumber) {
		super(userName, password, phoneNumber);
		
	}


	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		if(address != null && !address.equals("")){
			this.address = address;
		}
	}

}
