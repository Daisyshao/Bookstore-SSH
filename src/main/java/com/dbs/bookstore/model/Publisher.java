package com.dbs.bookstore.model;

import java.util.HashSet;
import java.util.Set;

public class Publisher {
	private int publisherId;
	private String name;
	private Set books = new HashSet(0);//该出版社出版的图书
	
	public Publisher() {
		super();
	}
	
	/**
	 * @param publisherid
	 * @param name
	 */
	public Publisher(int publisherid, String name) {
		super();
		this.publisherId = publisherid;
		this.name = name;
	}
	
	/**
	 * @return publisherId
	 */
	public int getPublisherId() {
		return this.publisherId;
	}
	
	/**
	 * @param publisherid
	 * 				the publierId to set
	 */
	public void setPublisherId(int publisherid) {
		this.publisherId = publisherid;
	}
	
	/**
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * @param name
	 * 			the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return books
	 */
	public Set getBooks() {
		return this.books;
	}
	
	/**
	 * @param books
	 * 		the books to set
	 */
	public void setBooks(Set books) {
		this.books = books;
	}

}
