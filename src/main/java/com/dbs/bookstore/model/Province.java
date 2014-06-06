package com.dbs.bookstore.model;

import java.util.HashSet;
import java.util.Set;

public class Province {
	private int provinceId;
	private String province;
	private Set addresses = new HashSet(0);	//省份为该省份的地址
	private Set cities = new HashSet(0);	//该省份的城市名

	
	public Province() {
		super();
	}
	
	/**
	 * @param provinceid
	 * @param province
	 * @param addresses
	 * @param cities
	 */
	public Province(int provinceid, String province, Set addresses, Set cities) {
		super();
		this.provinceId = provinceid;
		this.province = province;
		this.addresses = addresses;
		this.cities = cities;
	}
	
	/**
	 * @return provinceId
	 */
	public int getProvinceId(){
		return this.provinceId;
	}
	
	/**
	 * @param provinceid
	 * 				the provinceId to set
	 */
	public void setProvinceId(int provinceid) {
		this.provinceId = provinceid;
	}
	
	/**
	 * @return province
	 */
	public String getProvince() {
		return this.province;
	}
	
	/**
	 * @param province
	 * 			the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
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
	public void setAddressed(Set addresses) {
		this.addresses = addresses;
	}
	
	/**
	 * @return cities
	 */
	public Set getCities() {
		return this.cities;
	}
	
	/**
	 * @param cities
	 * 			the cities to set
	 */
	public void setCities(Set cities) {
		this.cities = cities;
	}
}
