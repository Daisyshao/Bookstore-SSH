/**
 * 
 */
package com.dbs.bookstore.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User  {
	private int userId;
	private String email;
	private String password;
	private String name;
	private int gender;
	private String phone;
	private int level;
	private Date regTime;
	private Set orders = new HashSet(0);	//该用户的所有订单
	private Set addresses = new HashSet(0);  //该用户所有收获地址

	public User() {
		super();
	}
	
	/**
	 * @param userId
	 * @param email
	 * @param password
	 * @param name
	 * @param gender
	 * @param phone
	 * @param level
	 * @param regTime
	 * @param orders
	 * @param addresses
	 */
	public User(int userId, String email, String password, String name, int gender, String phone, int level,
				Date regTime, Set orders, Set addresses) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.level = level;
		this.regTime = regTime;
		this.orders = orders;
		this.addresses = addresses;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return this.userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return this.gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return level
	 */
	public int getLevel() {
		return this.level;
	}
	
	/**
	 * @param level
	 * 			the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * @return the regTime
	 */
	public Date getRegTime() {
		return this.regTime;
	}
	
	/**
	 * @param regTime
	 * 				the regTime to set
	 */
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	 
	/**
	 * @return orders
	 */
	public Set getOrders() {
		return this.orders;
	}
	
	/**
	 * @param orders
	 * 			the orders to set
	 */
	public void setOrders(Set orders) {
		this.orders = orders;
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
