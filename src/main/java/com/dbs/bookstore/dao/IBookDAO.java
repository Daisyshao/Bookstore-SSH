package com.dbs.bookstore.dao;

import com.dbs.bookstore.model.Book;
import java.util.List;

public interface IBookDAO {
	public List getAllBooks();
	public Book getBookById(int bookid);
	public Book getBooksByOrderId(int orderid);
}
