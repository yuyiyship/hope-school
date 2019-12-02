package com.yship.service;

import com.yship.bean.Grade;
import com.yship.bean.User;

import java.util.Map;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/16 21:29
 * @Version: 1.0.0
 */
public interface UserService {

	String showUserByCriteria(User user);

	User loginUser(String userName, String password);

	int addUser(User user);

	boolean deleteUser(String idss);
}
