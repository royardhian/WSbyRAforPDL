package com.wsByRAforPDL.dao;

import com.wsByRAforPDL.entity.User;

public interface UserDao {

	User findByUserName(String username);

}