package com.bakery.online.model.stock;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name ="bms_deliver",catalog="bmsdb")
@PrimaryKeyJoinColumn( name ="order_id")
public class Delivery {
	@Column( name = "order_id")
	int orderId;
	@Column(name = "date", nullable = false, length = 100)
	@Temporal(TemporalType.DATE)
	private Date date;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	}


