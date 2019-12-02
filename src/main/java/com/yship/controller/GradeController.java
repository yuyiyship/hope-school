package com.yship.controller;

import com.yship.bean.Grade;
import com.yship.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName: GradeController
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/15 17:05
 * @Version: 1.0.0
 */
@RequestMapping("/grade")
@Controller
public class GradeController {

	@Autowired
	private GradeService gradeService;

	@GetMapping("/index")
	public String gradeView() {
//		response.setContentType("text/html;charset=UTF-8");
//		Map<String, String[]> parameterMap = request.getParameterMap();
//		String gradeData = gradeService.showGradeByByCriteria(parameterMap);
//		try {
//			response.getWriter().write(gradeData);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return "grade/index";
	}

	@PostMapping("/searchGrade")
	public void showGrade(Grade grade, HttpServletResponse response) {
		String studnetData = gradeService.showGradeByByCriteria(grade);
		try {
			response.getWriter().write(studnetData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/addGrade")
	public void addGrade(Grade grade) {
		gradeService.addGrade(grade);
	}

	@GetMapping("/deleteGrade/{idss}")
	public void deleteGrade(@PathVariable String idss, HttpServletResponse response) {
		boolean deleteStudent = gradeService.deleteGrade(idss);
		try {
			response.getWriter().write(String.valueOf(deleteStudent));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
