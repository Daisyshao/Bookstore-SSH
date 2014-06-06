package com.dbs.bookstore.model;

import java.util.HashSet;
import java.util.Set;

public class City {
	private int cityId;
	private int province_id;
	private String city;
	private Set addresses = new HashSet(0);	//城市为该城市的地址
	
	public City() {
		super();
	}
	
	/**
	 * @param cityid
	 * @param province_id
	 * @param city
	 * @param addresses
	 */
	public City(int cityid, int province_id, String city, Set addresses) {
		super();
		this.cityId = cityid;
		this.province_id = province_id;
		this.city = city;
		this.addresses = addresses;
	}
	
	/**
	 * @return cityId
	 */
	public int getCityId() {
		return this.cityId;
	}
	
	/**
	 * @param cityid
	 * 			the cityId to set
	 */
	public void setCityId(int cityid) {
		this.cityId = cityid;
	}
	
	/**
	 * @return province_id
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
	 * @return city
	 */
	public String getCity() {
		return this.city;
	}
	
	/**
	 * @param city
	 * 		the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * @return addresses
	 */
	public Set getAddresses() {
		return this.addresses;
	}
	
	/**
	 * @param addresses
	 * 			the addresses to set
	 */
	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}
}
