package com.yship.service;

import com.yship.bean.Menu;
import com.yship.bean.MenuExample;
import com.yship.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: MenuService
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/10 14:10
 * @Version: 1.0.0
 */
public interface MenuService {

	List<Menu> showParentMenuByRoleToList(User userInfo);

	String showMenuByRole(User userInfo);

	String showMenuByCriteria(User userInfo);

	int addMenu(Menu menu);

	boolean deleteMenu(String idss);

}
