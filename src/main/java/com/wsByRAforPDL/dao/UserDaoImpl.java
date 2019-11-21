package com.wsByRAforPDL.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wsByRAforPDL.entity.User;

@Repository
@Transactional 
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public User findByUserName(String username) {

		List<User> users = new ArrayList<User>();

		users = sessionFactory.getCurrentSession().createQuery("from User where username=?").setParameter(0, username)
				.list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}

	}

}