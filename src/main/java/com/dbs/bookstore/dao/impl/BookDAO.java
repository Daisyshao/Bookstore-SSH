package com.dbs.bookstore.dao.impl;

import com.dbs.bookstore.dao.BaseDao;
import com.dbs.bookstore.dao.IBookDAO;
import com.dbs.bookstore.model.Book;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class BookDAO extends BaseDao implements IBookDAO{

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		Session session = getSession();
		String hql = "from Book";
		Query query = session.createQuery(hql);
		List list = query.list();
		List<Book> books  = list;
		return books;
		
	}
	
	public Book getBookById(int bookid) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String hql = "from Book where bookId = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0,bookid);
		List books = query.list();	
		return (Book) books.get(0);
	}

	public Book getBooksByOrderId(int orderid) {
		// TODO Auto-generated method stub
		return null;
	}

}
