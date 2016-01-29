package Mobile;

public class PrivateSeller extends Seller {

	private String town;
	
	public PrivateSeller(String userName, String password, String phoneNumber) {
		super(userName, password, phoneNumber);
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		if(town !=null && !town.equals("")){
			this.town = town;
		}
	}

}
