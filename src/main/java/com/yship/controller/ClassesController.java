package com.yship.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yship.bean.Classes;
import com.yship.bean.Grade;
import com.yship.bean.Specialty;
import com.yship.service.ClassesService;
import com.yship.service.GradeService;
import com.yship.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: ClassesController
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/15 17:06
 * @Version: 1.0.0
 */
@RequestMapping("/classes")
@Controller
public class ClassesController {
	@Autowired
	private ClassesService classesService;
	@Autowired
	private GradeService gradeService;
	@Autowired
	private SpecialtyService specialtyService;
	@GetMapping("/index")
	public String classesView(Model model) {
		List<Grade> grades = gradeService.showAllGrade();
		List<Specialty> specialties = specialtyService.showAllSpecialty();
		model.addAttribute("grades", grades);
		model.addAttribute("specialties",specialties);
		return "classes/index";
	}

	@PostMapping("/searchClasses")
	public void showClasses(Classes classes, HttpServletResponse response) {
		String studnetData = classesService.findClassesByCriteria(classes);
		try {
			response.getWriter().write(studnetData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/addClasses")
	public void addClasses(Classes classes, Model model) {
		classesService.addClasses(classes);
	}

	@GetMapping("/deleteClasses/{idss}")
	public void deleteClasses(@PathVariable String idss, HttpServletResponse response) {
		boolean deleteClasses = classesService.deleteClasses(idss);
		try {
			response.getWriter().write(String.valueOf(deleteClasses));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
