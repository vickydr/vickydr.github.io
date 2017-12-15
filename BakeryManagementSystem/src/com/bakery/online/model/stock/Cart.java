package com.bakery.online.model.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="bms_cart",catalog="bmsdb")
@PrimaryKeyJoinColumn( name ="item_id")
public class Cart extends Item {
	@Column( name = "item_id")
	int itemId;
	@Column( name = "user_id")
	int userId;
	@Column( name = "item_quantity")
	int itemQuantity;
	@Column( name = "item_price")
	int itemPrice;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
}
	