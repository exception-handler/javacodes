package ans4;

public class Item {

	int itemId;
	String itemName;
	int itemPrepTime;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrepTime() {
		return itemPrepTime;
	}
	public void setItemPrepTime(int itemPrepTime) {
		this.itemPrepTime = itemPrepTime;
	}
	public Item(int itemId, String itemName, int itemPrepTime) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrepTime = itemPrepTime;
	}
	public Item() {
		super();
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrepTime=" + itemPrepTime + "]";
	}
	
	
}
