package com.dbs.bookstore.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Book {
	private int bookId;
	private String ISBN;
	private String title;
	private int author_id;
	private float price;
	private int category_id;
	private int stock;
	private float discount;
	private int publisher_id;
	private Date publish_time;
	private Date add_time;
	private Set descriptions = new HashSet(0);	//该图书的描述
	private Set pictures = new HashSet(0);	//该图书的图片
	private Set order_details = new HashSet(0);  //该图书对应的所有订单项
	
	public Book() {
		super();
	}
	
	/**
	 * @param bookId
	 * @param ISBN
	 * @param title
	 * @param author_id
	 * @param price
	 * @param category_id
	 * @param stock
	 * @param discount
	 * @param publisher_id
	 * @param publish_time
	 * @param add_time
	 * @param descriptions
	 * @param pictures
	 * @param order_details
	 */
	public Book(int bookId, String ISBN, String title, int author_id, float price, int category_id, int stock, float discount, 
				int publisher_id, Date publish_time, Date add_time, Set descriptions, Set pictures, Set order_details){
		super();
		this.bookId = bookId;
		this.title = title;
		this.author_id = author_id;
		this.price = price;
		this.category_id = category_id;
		this.stock = stock;
		this.discount = discount;
		this.publisher_id = publisher_id;
		this.publish_time = publish_time;
		this.add_time = add_time;
		this.descriptions = descriptions;
		this.pictures = pictures;
		this.order_details = order_details;
	}
	
	/**
	 * @return bookId
	 */
	public int getBookId()
	{
		return this.bookId;
	}
	
	/**
	 * @param bookId
	 * 			the bookId to set
	 */
	public void setBookId(int bookId){
		this.bookId = bookId;
	}
	
	/**
	 * @return ISBN
	 */
	public String getISBN(){
		return this.ISBN;
	}
	
	/**
	 * @param isbn
	 * 			the ISBN to set
	 */
	public void setISBN(String isbn){
		this.ISBN = isbn;
	}
	
	/**
	 * @return title
	 */
	public String getTitle(){
		return this.title;
	}
	
	/**
	 * @param title
	 * 			the title to set
	 */			
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 * @return author
	 */
	public int getAuthorId(){
		return this.author_id;
	}
	
	/**
	 * @param author
	 * 			the author to set
	 */
	public void setAuthorId(int author_id){
		this.author_id = author_id;
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
	 * @return category
	 */
	public int getCategoryId(){
		return this.category_id;
	}
	
	/**
	 * @param category
	 * 			the category to set
	 */
	public void setCategoryId(int category_id){
		this.category_id = category_id;
	}
	
	/**
	 * @return stock
	 */
	public int getStock(){
		return this.stock;
	}
	
	/**
	 * @param stock
	 * 			the stock to set
	 */
	public void setStock(int stock){
		this.stock=stock;
	}
	
	/**
	 * @return discount
	 */
	public float getDiscount() {
		return this.discount;
	}
	
	/**
	 * @param discount
	 * 			the discount to set
	 */
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	/**
	 * @return publisher
	 */
	public int getPublisherId() {
		return this.publisher_id;
	}
	
	/**
	 * @param publisher
	 * 				the publisher to set
	 */
	public void setPublisherId(int publisher_id){
		this.publisher_id = publisher_id;
	}
	
	/**
	 * @return publish_time
	 */
	public Date getPublishTime() {
		return this.publish_time;
	}
	
	/**
	 * @param publish_time
	 * 				the publish_time to set
	 */
	public void setPublishTime(Date publish_time) {
		this.publish_time = publish_time;
	}
	
	/**
	 * @return add_time
	 */
	public Date getAddTime() {
		return this.add_time;
	}
	
	/**
	 * @param add_time
	 * 			the add_time to set
	 */
	public void seetAddTime(Date add_time) {
		this.add_time = add_time;
	}
	
	/**
	 * @return descriptions
	 */
	public Set getDescriptions() {
		return this.descriptions;
	}
	
	/**
	 * @param descriptions
	 * 				the descriptions to set
	 */
	public void setDescriptions(Set descriptions) {
		this.descriptions = descriptions;
	}
	
	/**
	 * @return order_details
	 */
	public Set getOrderDetails() {
		return this.order_details;
	}
	
	/**
	 * @param orderDetails
	 * 				the ordet_details to set
	 */
	public void setOrderDetails(Set orderDetails) {
		this.order_details = order_details;
	}
}



