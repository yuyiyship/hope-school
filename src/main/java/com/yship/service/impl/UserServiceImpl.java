package com.yship.service.impl;

import com.google.gson.Gson;
import com.yship.bean.Role;
import com.yship.bean.RoleExample;
import com.yship.bean.User;
import com.yship.bean.UserExample;
import com.yship.mapper.UserMapper;
import com.yship.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/16 21:29
 * @Version: 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public String showUserByCriteria(User user) {
		List<User> users = userMapper.selectByExample(new UserExample());
		String userData = new Gson().toJson(users);
		return userData;
	}

	@Override
	public User loginUser(String userName, String password) throws NullPointerException {
		UserExample userExample = new UserExample();
		Date date = new Date();//获得系统时间.
		User user = new User();
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		String nowTime = sdf.format(date);
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andAccountEqualTo(userName);
		criteria.andPasswordEqualTo(password);
		List<User> users = userMapper.selectByExample(userExample);
		if (users.isEmpty()) {
			throw new NullPointerException();
		}
		BeanUtils.copyProperties(users.get(0),user);
		try {
			Date time = sdf.parse( nowTime );
			user.setLastlogindate(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user.setLogintime(user.getLogintime()+1);
		userMapper.updateByExample(user, userExample);
		return users.get(0);
	}

	@Override
	public int addUser(User user) {
		int insert = userMapper.insert(user);
		return insert;
	}

	@Override
	public boolean deleteUser(String idss) {
		String[] split = idss.split("-");
		try {
			for (int i = 1; i < split.length-1; i++) {
				userMapper.deleteByPrimaryKey(Integer.valueOf(split[i]));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
