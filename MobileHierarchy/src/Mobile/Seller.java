package Mobile;

import java.util.Arrays;

public abstract class Seller extends User implements ISeller {
	private String phoneNumber;
	private Poster[] posters;
	private Storage storage;

	public Seller(String userName, String password, String phoneNumber) {
		super(userName, password);
		this.setPhoneNumber(phoneNumber);
	}

	@Override
	public void addPoster(VehicleForSale vehicle) {
		if (vehicle != null) {
			if (vehicle.getPoster() != null) {
				this.storage.posters.add(vehicle.getPoster());
			}
		}
	}

	@Override
	public void removePoster(VehicleForSale vehicle) {
		if (vehicle != null && vehicle.getPoster() != null) {
			for (int index = 0; index < Storage.posters.size(); index++) {
				if (vehicle.getPoster().equals(Storage.posters.get(index))) { 
					Storage.posters.remove(vehicle.getPoster());
					break;
				}
			}
		}
	}

	@Override
	public void updatePoster(VehicleForSale vehicle) {
		if (vehicle != null && vehicle.getPoster() != null && vehicle.getPrice()>0 ) {
			int discount = (int) (Math.random() * 500);
			for (int index = 0; index < Storage.posters.size(); index++) {
				if (vehicle.getPoster().equals(Storage.posters.get(index))) {
					vehicle.setPrice(vehicle.getPrice() - discount);
					
				}
			}
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber != null && !phoneNumber.equals("")) {
			this.phoneNumber = phoneNumber;
		}
	}

	public Poster[] getPosters() {
		return Arrays.copyOf(this.posters, this.posters.length);
	}

	public void setPosters(Poster[] posters) {
		if (posters != null) {
			this.posters = Arrays.copyOf(posters, posters.length);
		}
	}

}
