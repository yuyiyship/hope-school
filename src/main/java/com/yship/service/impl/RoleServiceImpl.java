package com.yship.service.impl;

import com.google.gson.Gson;
import com.yship.bean.Role;
import com.yship.bean.RoleExample;
import com.yship.mapper.RoleMapper;
import com.yship.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: RoleServiceImpl
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/16 21:21
 * @Version: 1.0.0
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public String showRoleByCriteria(Role role) {
		List<Role> roles = roleMapper.selectByExample(new RoleExample());
		String roleData = new Gson().toJson(roles);
		return roleData;
	}
}
