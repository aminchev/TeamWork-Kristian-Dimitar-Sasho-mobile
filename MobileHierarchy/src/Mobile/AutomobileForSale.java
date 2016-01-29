package Mobile;

public class AutomobileForSale extends VehicleForSale {

	private boolean hasAirconditioner;
	private boolean hasElectricGlasses;
	private boolean hasElecticMirrors;
	private boolean hasParktronic;

	public AutomobileForSale(String brand, String model) {
		super(brand, model);
	}

	boolean getHasAirconditioner() {
		return this.hasAirconditioner;
	}

	void setHasAirconditioner(boolean hasAirconditioner) {
		this.hasAirconditioner = hasAirconditioner;
	}

	boolean getHasElectricGlasses() {
		return this.hasElectricGlasses;
	}

	void setHasElectricGlasses(boolean hasElectricGlasses) {
		this.hasElectricGlasses = hasElectricGlasses;
	}

	boolean getHasElecticMirrors() {
		return this.hasElecticMirrors;
	}

	void setHasElecticMirrors(boolean hasElecticMirrors) {
		this.hasElecticMirrors = hasElecticMirrors;
	}

	boolean getHasParktronic() {
		return this.hasParktronic;
	}

	void setHasParktronic(boolean hasParktronic) {
		this.hasParktronic = hasParktronic;
	}

}
