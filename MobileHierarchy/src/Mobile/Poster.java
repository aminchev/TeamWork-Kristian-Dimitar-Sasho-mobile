package Mobile;

public class Poster {
	private int periodDays;
	private boolean isPaid;
	private Seller seller;
	private VehicleForSale vehicle;
	
	public Poster(int periodDays, boolean isPaid) {
		this.setPeriodDays(periodDays);
		this.setIsPaid(isPaid);
	}

	public int getPeriodDays() {
		return this.periodDays;
	}

	public void setPeriodDays(int periodDays) {
		if(periodDays>0){
			this.periodDays = periodDays;
		}
	}

	public boolean getIsPaid() {
		return this.isPaid;
	}

	public void setIsPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		if(seller != null){
			this.seller = seller;
		}
	}

	public VehicleForSale getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(VehicleForSale vehicle) {
		if(vehicle != null){
			this.vehicle = vehicle;
		}
	}
}