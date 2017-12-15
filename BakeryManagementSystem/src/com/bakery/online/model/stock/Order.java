package com.bakery.online.model.stock;

import javax.persistence.*;

@Entity
@Table(name ="bms_order",catalog="bmsdb")
@PrimaryKeyJoinColumn( name ="item_id")

public class Order extends Item{
	@Id@GeneratedValue
	@Column( name = "order_id")
	int orderId;
	@Column( name = "item_id")
	int itemId;
	@Column( name = "item_quantity")
	int itemQuantity;
	@Column( name = "item_price")
	int itemPrice;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}

