package com.yship.controller;

import com.yship.bean.Grade;
import com.yship.bean.User;
import com.yship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/15 17:08
 * @Version: 1.0.0
 */
@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/index")
	public String userView(Model model) {
		return "user/index";
	}

	@PostMapping("/searchUser")
	public void showUser(User user, HttpServletResponse response) {
		String userData = userService.showUserByCriteria(user);
		try {
			response.getWriter().write(userData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@PostMapping("/addUser")
	public void addGrade(User user) {
		userService.addUser(user);
	}

	@GetMapping("/deleteUser/{idss}")
	public void deleteUser(@PathVariable String idss, HttpServletResponse response) {
		boolean deleteUser = userService.deleteUser(idss);
		try {
			response.getWriter().write(String.valueOf(deleteUser));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
