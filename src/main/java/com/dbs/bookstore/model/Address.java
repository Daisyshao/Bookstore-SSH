package com.dbs.bookstore.model;

public class Address {
	private int addressId;
	private int province_id;
	private int city_id;
	private String other;
	private String reciever;
	private String phone;
	private String zipcode;
	private int user_id;
	
	public Address() {
		super();
	}
	
	/**
	 * @param addressid
	 * @param province_id
	 * @param city_id
	 * @param other
	 * @param reciever
	 * @param phone
	 * @param zipcode
	 * @param user_id
	 */
	public Address(int addressid, int province_id, int city_id, String other, String reciever, String phone, String zipcode, int user_id) {
		super();
		this.addressId = addressid;
		this.province_id = province_id;
		this.city_id = city_id;
		this.other = other;
		this.reciever = reciever;
		this.phone = phone;
		this.zipcode = zipcode;
		this.user_id = user_id;
	}
	
	/**
	 * @return addressId
	 */
	public int getAddressId() {
		return this.addressId;
	}
	
	/**
	 * @param addressid
	 * 				the addressId to set
	 */
	public void setAddressId(int addressid) {
		this.addressId = addressid;
	}
	
	/**
	 * @return provinceId
	 */
	public int getProvinceId() {
		return this.province_id;
	}
	
	/**
	 * @param province_id
	 * 				the province_id to set
	 */
	public void setProvinceId(int province_id) {
		this.province_id = province_id;
	}
	
	/**
	 * @return city_id
	 */
	public int getCityId() {
		return this.city_id;
	}
	
	/**
	 * @param city_id
	 * 			the city_id to set
	 */
	public void setCityId(int city_id) {
		this.city_id = city_id;
	}
	
	/**
	 * @return other
	 */
	public String getOther() {
		return this.other;
	}
	
	/**
	 * @param other
	 * 			the other to set
	 */
	public void setOther(String other) {
		this.other = other;
	}
	
	/**
	 * @return reciever
	 */
	public String getReciever() {
		return this.reciever;
	}
	
	/**
	 * @param reciever
	 * 			the reciever to set
	 */
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	
	/**
	 * @return phone
	 */
	public String getPhone() {
		return this.phone;
	}
	
	/**
	 * @param phone
	 * 			the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * @return zipcode
	 */
	public String getZipcode() {
		return this.zipcode;
	}
	
	/**
	 * @param zipcode
	 * 			the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	/**
	 * @return user_id
	 */
	public int getUserId() {
		return this.user_id;
	}
	
	/**
	 * @param user_id
	 * 			the user_id to set
	 */
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}
}
