package com.dbs.bookstore.model;

import java.util.HashSet;
import java.util.Set;

public class Author {
	private int authorId;
	private String name;
	private Set books = new HashSet(0);	//该作者写的图书
	
	public Author() {
		super();
	}
	
	/**
	 * @param authorid
	 * @param name
	 * @param books
	 */
	public Author(int authorid, String name, Set books) {
		super();
		this.authorId = authorid;
		this.name = name;
		this.books = books;
	}
	
	/**
	 * @return authorId
	 */
	public int getAuthorId(){
		return this.authorId;
	}
	
	/**
	 * @param authorid
	 * 		the authorId to set
	 */
	public void setAuthorId(int authorid) {
		this.authorId = authorid;
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
	public void setName(String name){
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

