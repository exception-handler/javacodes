package p1;

public class Laptop {

	int serialNumber;
	String brandName;
	int cost;
	
	public Laptop(int serialNumber, String brandName, int cost) {
		super();
		this.serialNumber = serialNumber;
		this.brandName = brandName;
		this.cost = cost;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
