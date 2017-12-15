package com.bakery.online.model.stock;

import javax.persistence.*;

@Entity
@Table(name ="bms_deliver",catalog="bmsdb")
@PrimaryKeyJoinColumn( name ="order_id")
public class Delivery {
	@Column( name = "order_id")
	int orderId;
	@Column(name = "date", nullable = false, length = 100)
	private String date;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
