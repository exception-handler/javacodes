package Question4;

public class Dish {

	private int dishId;
	private String dishName;
	private int dishPrice;
	private String dishMakeTime;
	public Dish(int dishId, String dishName, int dishPrice, String dishMakeTime) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.dishMakeTime = dishMakeTime;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}
	public String getDishMakeTime() {
		return dishMakeTime;
	}
	public void setDishMakeTime(String dishMakeTime) {
		this.dishMakeTime = dishMakeTime;
	}
	
	
	public Dish() {
		super();
	}
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", dishPrice=" + dishPrice + ", dishMakeTime="
				+ dishMakeTime + "]";
	}
	
}
