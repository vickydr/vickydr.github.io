package com.bakery.online.model.stock;


import javax.persistence.*;


@Entity
@Table(name ="bms_items",catalog="bmsdb")

public class Item {
	@Id
	@Column( name = "item_id", nullable = false, length = 100)
	int itemId;
	@Column( name = "item_name", nullable = false, length = 100)
	String itemName;
	@Column( name = "item_price", nullable = false, length = 100)
	int itemPrice;
	@Column( name = "item_status")
	String itemStatus;
	@Column( name = "item_type", nullable = false, length = 100)
	String itemType;
	@Column( name = "quantity", nullable = false, length = 100)
	String quantity;
	@Column( name = "item_variety", nullable = false, length = 100)
	String itemVariety;
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
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getItemVariety() {
		return itemVariety;
	}
	public void setItemVariety(String itemVariety) {
		this.itemVariety = itemVariety;
	}
	
	
}
