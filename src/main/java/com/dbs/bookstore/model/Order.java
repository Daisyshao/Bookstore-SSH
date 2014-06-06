package com.dbs.bookstore.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
	private int orderId;
	private Date time;
	private float total_price;
	private int user_id;
	private int status;
	private int payment;
	private int address_id;
	private Set order_details = new HashSet(0);  //该订单的所有商品
	
	public Order() {
		super();
	}
	
	/**
	 * @param orderid
	 * @param time
	 * @param total_price
	 * @param user_id
	 * @param status
	 * @param payment
	 * @param address_id
	 * @param order_details
	 */
	public Order(int orderid, Date time, float total_price, int user_id, int status, int payment, int address_id, Set order_details) {
		super();
		this.orderId = orderid;
		this.time = time;
		this.total_price = total_price;
		this.user_id = user_id;
		this.status = status;
		this.payment = payment;
		this.address_id = address_id;
		this.order_details = order_details;
	}
	
	/**
	 * @return orderId
	 */
	public int getOrderId() {
		return this.orderId;
	}
	
	/**
	 * @param orderid
	 * 			the orderId to set
	 */
	public void setOrderId(int orderid) {
		this.orderId = orderid;
	}
	
	/**
	 * @return time
	 */
	public Date getTime() {
		return this.time;
	}
	
	/**
	 * @param time
	 * 			the time to set
	 */
	public void setTiem(Date time) {
		this.time = time;
	}
	
	/**
	 * @return total_price
	 */
	public float getTotalPrice() {
		return this.total_price;
	}
	
	/**
	 * @param total_price
	 * 				the total_price to set
	 */
	public void setTotalPrice(float total_price) {
		this.total_price = total_price;
	}
	
	/**
	 * @return user_id
	 */
	public int getUserId() {
		return this.user_id;
	}
	
	/**
	 * @param user_id
	 * 				the user_id to set
	 */
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}
	
	/**
	 * @return status
	 */
	public int getStatus() {
		return this.status;
	}
	
	/**
	 * @param status
	 * 			the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	/**
	 * @return payment
	 */
	public int getPayment() {
		return this.payment;
	}
	
	/**
	 * @param payment
	 * 			the payment to set
	 */
	public void setPayment(int payment) {
		this.payment = payment;
	}
	
	/**
	 * @return address_id
	 */
	public int getAddressId() {
		return this.address_id;
	}
	
	/**
	 * @param address_id
	 * 				the address_id to set
	 */
	public void setAddressId(int address_id) {
		this.address_id = address_id;
	}
	
	/**
	 * @return order_details
	 */
	public Set getOrderDetails() {
		return this.order_details;
	}
	
	/**
	 * @param order_details
	 * 				the order_details to set
	 */
	public void setOrderDetails(Set order_details) {
		this.order_details = order_details;
	}
}


