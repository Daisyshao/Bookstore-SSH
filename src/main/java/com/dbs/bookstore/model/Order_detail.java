package com.dbs.bookstore.model;

public class Order_detail {
	private int orderDatailId;
	private int t_o_id;
	private int t_b_id;
	private float price;   //每本书的实际售价（单价＊discount）
	private int count;
	
	public Order_detail() {
		super();
	}
	
	/**
	 * @param orderdetailid
	 * @param t_o_id
	 * @param t_b_id
	 * @param price
	 * @param count
	 */
	public Order_detail(int orderdetailid, int t_o_id, int t_b_id, float price, int count) {
		super();
		this.orderDatailId = orderdetailid;
		this.t_o_id = t_o_id;
		this.t_b_id = t_b_id;
		this.price = price;
		this.count = count;
	}
	
	/**
	 * @return orderDetailId
	 */
	public int getOrderDetailId() {
		return this.orderDatailId;
	}
	
	/**
	 * @param orderdetailid
	 * 				the orderDetailId to set
	 */
	public void setOrderDetailId(int orderdetailid) {
		this.orderDatailId = orderdetailid;
	}
	
	/**
	 * @return t_o_id
	 */
	public int getTOId() {
		return this.t_o_id;
	}
	
	/**
	 * @param t_o_id	
	 * 			the t_o_id to set
	 */
	public void setTOId(int t_o_id) {
		this.t_o_id = t_o_id;
	}
	
	/**
	 * @return t_b_id
	 */
	public int getTBId() {
		return this.t_b_id;
	}
	
	/**
	 * @param t_b_id
	 * 			the t_b_id to set
	 */
	public void setTBId(int t_b_id) {
		this.t_b_id = t_b_id;
	}
	
	/**
	 * @return price
	 */
	public float getPrice(){
		return this.price;
	}
	
	/**
	 * @param price
	 * 			the price to set
	 */
	public void setPrice(float price){
		this.price = price;
	}
	
	/**
	 * @return count
	 */
	public int getCount() {
		return this.count;
	}
	
	/**
	 * @param count
	 * 			the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
}
