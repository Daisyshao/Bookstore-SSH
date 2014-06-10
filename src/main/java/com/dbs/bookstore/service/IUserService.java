package com.dbs.bookstore.service;

import com.dbs.bookstore.model.User;

public interface IUserService {
	public void saveUser(User user);
	public User validateUser(String username,String password);
	public void exitUser(String username);

}
