package com.yship.controller;

import com.yship.bean.Role;
import com.yship.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName: RoleController
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/15 17:08
 * @Version: 1.0.0
 */
@RequestMapping("/role")
@Controller
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping("/index")
	public String roleView(Model model) {
		return "role/index";
	}

	@GetMapping("/searchRole")
	public void showRole(Role role, HttpServletResponse response) {
		String roleData = roleService.showRoleByCriteria(role);
		try {
			response.getWriter().write(roleData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
