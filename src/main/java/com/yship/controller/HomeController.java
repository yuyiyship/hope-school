package com.yship.controller;

import com.yship.bean.Menu;
import com.yship.bean.MenuExample;
import com.yship.bean.User;
import com.yship.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName: HomeController
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/12 16:45
 * @Version: 1.0.0
 */
@Controller
public class HomeController {
	@Autowired
	private MenuService menuService;

	@RequestMapping("/index")
	public String index(HttpSession session,Model model) {
		User userInfo =(User) session.getAttribute("userInfo");
		String menus = menuService.showMenuByRole(userInfo);
		List<Menu> menus1 = menuService.showParentMenuByRoleToList(userInfo);
		model.addAttribute("menusl",menus1);
		model.addAttribute("menus",menus);
		model.addAttribute("user", userInfo);
		return "index";
	}
}
