package Mobile;

public class TruckForSale extends VehicleForSale {

	private static final int MAX_COUNT_OF_AXIS = 8;
	private boolean hasTachograph;
	private boolean hasBoard;
	private int axisCount;
	private int maxCarry;

	public TruckForSale(String brand, String model) {
		super(brand, model);
	}

	boolean getHasTachograph() {
		return this.hasTachograph;
	}

	void setHasTachograph(boolean hasTachograph) {
		this.hasTachograph = hasTachograph;
	}

	boolean getHasBoard() {
		return this.hasBoard;
	}

	void setHasBoard(boolean hasBoard) {
		this.hasBoard = hasBoard;
	}

	int getAxisCount() {
		return this.axisCount;
	}

	void setAxisCount(int axisCount) {
		if (axisCount > 0 && axisCount <= MAX_COUNT_OF_AXIS) {
			this.axisCount = axisCount;
		}
	}

	int getMaxCarry() {
		return this.maxCarry;
	}

	void setMaxCarry(int maxCarry) {
		if (maxCarry > 0) {
			this.maxCarry = maxCarry;
		}
	}

}
