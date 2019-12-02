package com.yship.controller;

import com.yship.bean.Menu;
import com.yship.bean.MenuExample;
import com.yship.bean.User;
import com.yship.service.MenuService;
import com.yship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @ClassName: LoginControl
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/17 14:22
 * @Version: 1.0.0
 */
@Controller
@RequestMapping("/login")
public class LoginControler {

	@Autowired
	private UserService userService;

	@GetMapping("")
	public String LoginView() {
		return "login";
	}

	@PostMapping("/login")
	public String Login(Model model,HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Cookie[] cookies = request.getCookies();
		String remberValue = request.getParameter("remember");
		String usernameValue = request.getParameter("username");
		String passwordValue = request.getParameter("password");
		String remberNumber = "1";
		//记住用户名
		if (remberNumber.equals(remberValue)) {
			Cookie cookie = creatCookie(cookies, "username", usernameValue);
			response.addCookie(cookie);
		} else {
			deleteCOokie(cookies, "username");
		}
		try {
			User user = userService.loginUser(usernameValue, passwordValue);
			session.setAttribute("userInfo", user);
			return "redirect:/index";
		} catch (NullPointerException e) {
			model.addAttribute("login", false);
			return "/login";
		}
	}

	@GetMapping("/logout")
	public String Logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	/**
	 * 创建一个名为name,值为value的cookie
	 * @param cookies
	 * @param name
	 * @param value
	 * @return
	 */
	public Cookie creatCookie(Cookie[] cookies,String name,String value) {
		boolean flag = false;
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (name.equals(cookie.getName())) {
					flag = true;
					cookie.setValue(value);
					cookie.setMaxAge(60 * 60 * 60);
					return cookie;
				}
			}
			if (!flag) {
				Cookie cookie = new Cookie(name, value);
				cookie.setMaxAge(60 * 60 * 60);
				return cookie;
			}
		} else {
			Cookie cookie = new Cookie(name, value);
			cookie.setMaxAge(60 * 60 * 60);
			return cookie;
		}
		return null;
	}

	/**
	 * 删除名为name的cook
	 * @param cookies
	 * @param name
	 * @return
	 */
	public Cookie deleteCOokie(Cookie[] cookies,String name) {
		for (Cookie cookie : cookies) {
			if (name.equals(cookie.getName())) {
				cookie.setMaxAge(0);
				return cookie;
			}
		}
		return null;
	}

}
