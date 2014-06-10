package com.dbs.bookstore.service.impl;

import com.dbs.bookstore.dao.IUserDAO;
import com.dbs.bookstore.model.User;

public class UserService {
	private IUserDAO userDAO;
	public void setUserDAO(IUserDAO userDAO){
		this.userDAO=userDAO;
	}
	public void saveUser(User user) throws Exception{
		this.userDAO.saveUser(user);
		}
	public User validateUser(String username,String password) throws Exception{
		return userDAO.validateUser(username, password);
}
	public void exitUser(String username) throws Exception{
		userDAO.exitUser(username);
	}

}
