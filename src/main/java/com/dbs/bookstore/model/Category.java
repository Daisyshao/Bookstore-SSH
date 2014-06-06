package com.dbs.bookstore.model;

import java.util.HashSet;
import java.util.Set;

public class Category {
	private int categoryId;
	private String title;
	private Set books = new HashSet(0);	//该分类下的所有图书
	
	public Category() {
		super();
	}
	
	/**
	 * @param categoryid
	 * @param title
	 * @param books
	 */
	public Category(int categoryid, String title, Set books) {
		super();
		this.categoryId = categoryid;
		this.title = title;
		this.books = books;
	}
	
	/**
	 * @return categoryId
	 */
	public int getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * @param categoryid
	 * 		the categoryId to set
	 */
	public void setCategoryId(int categoryid) {
		this.categoryId = categoryid;
	}
	
	/**
	 * @return title
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * @param title
	 * 			the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
