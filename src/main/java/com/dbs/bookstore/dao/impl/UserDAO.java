package com.dbs.bookstore.dao.impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dbs.bookstore.dao.BaseDao;
import com.dbs.bookstore.dao.IUserDAO;
import com.dbs.bookstore.model.User;

public class UserDAO extends BaseDao implements IUserDAO{
		
	public void saveUser(User user){
			// TODO Auto-generated method stub
		//Hibernate Session缓存被称为Hibernate的第一级缓存。SessionFactory的外置缓存称为Hibernate的二级缓存。
		//这两个缓存都位于持久层，它们存放的都是数据库数据的拷贝。
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			try{
				session.save(user);
				tx.commit();      //将事务提交之后，session中缓存的数据被晴空
			} catch(Exception e) {
				if(tx != null)
					tx.rollback();     //如果提交不成功，事务回滚
			}
			
			finally {
				session.close();
			}
		}

	
		public User validateUser(String username, String password) {
			Session session = getSession();
			String hql = "from User where name=? and password=?";   //hibernate的查询语句 相当于“select * from t_user where name=? and password=?”
			Query query = session.createQuery(hql);
			query.setParameter(0, username);
			query.setParameter(1, password);
			List users = query.list();   //将查询结果以列表形式返回
			if(users.size()!=0){
				User user = (User) users.get(0);
				return user;
			}
			return null;
		}

		public void exitUser(String username) {
			// TODO Auto-generated method stub
			Session session = getSession();
			session.close();
		}
}
