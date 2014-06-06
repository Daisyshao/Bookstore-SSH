package com.dbs.bookstore.model;

public class Picture {
	private int pictureId;
	private int book_id;
	private String title;
	private String filename;
	
	public Picture() {
		super();
	}
	
	/**
	 * @param pictureid
	 * @param book_id
	 * @param title
	 * @param filename
	 */
	public Picture(int pictureid, int book_id, String title, String filename) {
		super();
		this.pictureId = pictureid;
		this.book_id = book_id;
		this.title = title;
		this.filename = filename;
	}
	
	/**
	 * @return pictureId
	 */
	public int getPictureId() {
		return this.pictureId;
	}
	
	/**
	 * @param pictureid
	 * 			the pictureId to set
	 */
	public void setPictureId(int pictureid) {
		this.pictureId = pictureid;
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
	 * @return filename
	 */
	public String getFileName() {
		return this.filename;
	}
	
	/**
	 * @param filename
	 * 			the filename to set
	 */
	public void setFileName(String filename) {
		this.filename = filename;
	}
}

