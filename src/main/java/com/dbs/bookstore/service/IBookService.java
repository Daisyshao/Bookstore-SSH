package com.dbs.bookstore.service;

import com.dbs.bookstore.model.Book;
import com.sun.tools.javac.util.List;

public interface IBookService {
	public List getAllBooks();
	public Book getBookById(int bookid);
}
