package com.yship.controller;

import com.yship.bean.Grade;
import com.yship.bean.Menu;
import com.yship.bean.User;
import com.yship.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName: MenuController
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/15 17:07
 * @Version: 1.0.0
 */
@RequestMapping("/menu")
@Controller
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping("/index")
	public String menuView(Model model) {
		return "menu/index";
	}

	@PostMapping("/searchMenu")
	public void showMenu(HttpSession session, HttpServletResponse response) {
		User userInfo =(User) session.getAttribute("userInfo");
		String menuData = menuService.showMenuByCriteria(userInfo);
		try {
			response.getWriter().write(menuData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/addMenu")
	public void addMenu(Menu menu) {
		menuService.addMenu(menu);
	}

	@GetMapping("/deleteMenu/{idss}")
	public void deleteGrade(@PathVariable String idss, HttpServletResponse response) {
		boolean deleteMenu = menuService.deleteMenu(idss);
		try {
			response.getWriter().write(String.valueOf(deleteMenu));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
