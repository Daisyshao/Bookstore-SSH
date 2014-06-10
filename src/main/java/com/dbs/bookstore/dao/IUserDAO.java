package com.dbs.bookstore.dao;

import com.dbs.bookstore.model.User;

public interface IUserDAO {
	public void saveUser(User user);
	public User validateUser(String username,String password);
	public void exitUser(String username);
}
