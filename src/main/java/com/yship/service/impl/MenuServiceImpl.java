package com.yship.service.impl;

import com.google.gson.Gson;
import com.yship.bean.*;
import com.yship.mapper.MenuMapper;
import com.yship.mapper.RolemenuMapper;
import com.yship.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName: MenuServiceImpl
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/10 16:25
 * @Version: 1.0.0
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuMapper menuMapper;
	@Autowired
	private RolemenuMapper rolemenuMapper;

	@Override
	public List<Menu> showParentMenuByRoleToList(User userInfo) {
		List<Menu> menus = getMenuByCriteria(userInfo);
		List<Menu> menus1 = new ArrayList<>();
		for (Menu menu : menus) {
			if (menu.getParentid() == null) {
				menus1.add(menu);
			}
		}
		return menus1;
	}

	@Override
	public String showMenuByRole(User userInfo) {
		List<Menu> menus = getMenuByCriteria(userInfo);
		StringBuffer menuJson = new StringBuffer();
		menuJson.append("[");
		for (Menu menu : menus) {
			if (menu.getParentid() == null) {
				menuJson.append(
						"{" +
								"id:"+"'"+ menu.getMark()+"'"+ ","+
								"menu:["
				);
				for (Menu smenu : menus) {
					if (Objects.equals(smenu.getParentid(), menu.getId())) {
						menuJson.append(
								"{"+
										"text:"+"'"+smenu.getMenuname()+"'"+","+
										"items:["
						);
						boolean flag = false;
						for (Menu ssmenu : menus) {
							if (Objects.equals(ssmenu.getParentid(), smenu.getId())) {
								flag = true;
								menuJson.append(
										"{"+
												"id:"+"'"+ssmenu.getMark()+"'"+","+
												"text:"+"'"+ssmenu.getMenuname()+"'"+","+
												"href:"+"'"+ssmenu.getHref()+"'"+
												"},"
								);
							}
						}
						if (flag == true) {
							menuJson.setLength(menuJson.length()-1);
						}
						menuJson.append("]},");
					}
				}
				menuJson.setLength(menuJson.length()-1);
				menuJson.append("]},");
			}
		}
		menuJson.setLength(menuJson.length()-1);
		menuJson.append("]");
		return String.valueOf(menuJson);
	}

	@Override
	public String showMenuByCriteria(User userInfo) {
		List<Menu> menus = getMenuByCriteria(userInfo);
		String menuData = new Gson().toJson(menus);
		return menuData;
	}

	@Override
	public int addMenu(Menu menu) {
		int insert = menuMapper.insert(menu);
		return insert;
	}

	@Override
	public boolean deleteMenu(String idss) {
		String[] split = idss.split("-");
		try {
			for (int i = 1; i < split.length-1; i++) {
				menuMapper.deleteByPrimaryKey(Integer.valueOf(split[i]));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private List<Menu> getMenuByCriteria(User userInfo) {
		MenuExample menuExample = new MenuExample();
		MenuExample.Criteria menuExampleCriteria = menuExample.createCriteria();
		Integer roleid = userInfo.getRoleid();
		if (roleid != 1) {
			RolemenuExample rolemenuExample = new RolemenuExample();
			RolemenuExample.Criteria rolemenuExampleCriteria = rolemenuExample.createCriteria();
			rolemenuExampleCriteria.andRoleidEqualTo(roleid);
			List<Rolemenu> rolemenus = rolemenuMapper.selectByExample(rolemenuExample);
			List<Integer> menuids = new ArrayList<>();
			for (Rolemenu rolemenu : rolemenus) {
				Integer menuid = rolemenu.getMenuid();
				menuids.add(menuid);
			}
			menuExampleCriteria.andIdIn(menuids);
		}
		List<Menu> menus = menuMapper.selectByExample(menuExample);
		return menus;
	}
}
