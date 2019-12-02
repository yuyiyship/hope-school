package com.yship.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yship.bean.Grade;
import com.yship.bean.Specialty;
import com.yship.service.GradeService;
import com.yship.service.SpecialtyService;
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
import java.util.List;
import java.util.Map;

/**
 * @ClassName: SpecialtyController
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/15 17:07
 * @Version: 1.0.0
 */
@RequestMapping("/specialty")
@Controller
public class SpecialtyController {
	@Autowired
	public SpecialtyService specialtyService;
	@Autowired
	private GradeService gradeService;
	@GetMapping("/index")
	public String specialtyView(Model model) {
		List<Grade> grades = gradeService.showAllGrade();
		model.addAttribute("grades",grades);
		return "specialty/index";
	}

	@PostMapping("/searchSpecialty")
	public void showStudent(Specialty specialty, HttpServletResponse response) {
		String studnetData = specialtyService.showSpecialtyByCriteria(specialty);
		try {
			response.getWriter().write(studnetData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/addSpecialty")
	public void addSpecialty(Specialty specialty,Model model) {
		specialtyService.addSpecialty(specialty);
	}

	@GetMapping("/deleteSpecialty/{idss}")
	public void deleteSpecialty(@PathVariable String idss, HttpServletResponse response) {
		boolean deleteSpecialty = specialtyService.deleteSpecialty(idss);
		try {
			response.getWriter().write(String.valueOf(deleteSpecialty));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
