package Mobile;

public class BusForSale extends VehicleForSale {

	private boolean hasTachograph;
	private int countOfSeats;
	private int countOfDoors;

	public BusForSale(String brand, String model) {
		super(brand, model);
	}

	boolean getHasTachograph() {
		return this.hasTachograph;
	}

	void setHasTachograph(boolean hasTachograph) {
		this.hasTachograph = hasTachograph;
	}

	int getCountOfSeats() {
		return this.countOfSeats;
	}

	void setCountOfSeats(int countOfSeats) {
		if (countOfSeats > 10) {
			this.countOfSeats = countOfSeats;
		}
	}

	int getCountOfDoors() {
		return this.countOfDoors;
	}

	void setCountOfDoors(int countOfDoors) {
		if (countOfDoors > 2) {
			this.countOfDoors = countOfDoors;
		}
	}

}
