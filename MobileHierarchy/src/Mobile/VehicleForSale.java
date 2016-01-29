package Mobile;

import java.util.Calendar;

import javax.xml.crypto.Data;

public abstract class VehicleForSale {
	
	private String brand;
	private String model;
	private String engineType;
	private int yearOfManifacture;
	private int price;
	private String color;
	private String category;
	private int mileage;
	private Seller seller;
	private Poster poster;
	
	public VehicleForSale(String brand, String model) {
		this.setBrand(brand);
		this.setModel(model);
	}

	String getBrand() {
		return this.brand;
	}
	
	private void setBrand(String brand){
		if(brand != null && !brand.equals("")){
			this.brand = brand;
		}
	}

	String getModel() {
		return this.model;
	}
	
	private void setModel(String model){
		if(model != null && !model.equals("")){
			this.model = model;
		}
	}

	String getEngineType() {
		return this.engineType;
	}

	void setEngineType(String engineType) {
		if (engineType != null && !engineType.equals("")) {
			this.engineType = engineType;
		}
	}

	int getYearOfManifacture() {
		return this.yearOfManifacture;
	}

	void setYearOfManifacture(int yearOfManifacture) {
		if (yearOfManifacture > 1900 && yearOfManifacture <= Calendar.getInstance().get(Calendar.YEAR)) {
			this.yearOfManifacture = yearOfManifacture;
		}
	}

	 String getColor() {
		return this.color;
	}

	 void setColor(String color) {
		if (color != null && !color.equals("")) {
			this.color = color;
		}
	}

	 String getCategory() {
		return this.category;
	}

	 void setCategory(String category) {
		if (category != null && !category.equals("")) {
			this.category = category;
		}
	}

	 int getMileage() {
		return this.mileage;
	}

	 void setMileage(int mileage) {
		if (mileage > 0) {
			this.mileage = mileage;
		}
	}

	 Seller getSeller() {
		return this.seller;
	}

	 void setSeller(Seller seller) {
		if (seller != null) {
			this.seller = seller;
		}
	}

	public Poster getPoster() {
		return this.poster;
	}

	public void setPoster(Poster poster) {
		if(poster != null){
			this.poster = poster;
		}
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		if(price>0){
			this.price = price;
		}
	}

}
