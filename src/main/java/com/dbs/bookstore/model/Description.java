package com.dbs.bookstore.model;

public class Description {
	private int descriptionId;
	private int type;
	private int book_id;
	private String content;
	
	public Description() {
		super();
	}
	
	/**
	 * @param descriptionid
	 * @param type
	 * @param book_id
	 * @param content
	 */
	public Description(int descriptionid, int type, int book_id, String content) {
		super();
		this.descriptionId = descriptionid;
		this.type = type;
		this.book_id = book_id;
		this.content = content;
	}
	
	/**
	 * @return descriptionId
	 */
	public int getDescriptionId() {
		return this.descriptionId;
	}
	
	/**
	 * @param descriptionid
	 * 				the descriptionId to set
	 */
	public void setDescriptionId(int descriptionid) {
		this.descriptionId = descriptionid;
	}
	
	/**
	 * @return type
	 */
	public int getType() {
		return this.type;
	}
	
	/**
	 * @param type
	 * 		the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	/**
	 * @return book_id
	 */
	public int getBookId() {
		return this.book_id;
	}
	
	/**
	 * @param book_id
	 * 			the book_id to set
	 */
	public void setBookId(int book_id) {
		this.book_id = book_id;
	}
	
	/**
	 * @return content
	 */
	public String getContent() {
		return this.content;
	}
	
	/**
	 * @param content
	 * 			the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
