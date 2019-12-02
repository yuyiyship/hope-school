package com.yship.controller;

	import com.google.gson.Gson;
	import com.yship.bean.Classes;
	import com.yship.bean.Grade;
	import com.yship.bean.Specialty;
	import com.yship.bean.Student;
	import com.yship.service.ClassesService;
	import com.yship.service.GradeService;
	import com.yship.service.SpecialtyService;
	import com.yship.service.StudentService;
	import com.yship.service.impl.StudentServiceImpl;
	import org.springframework.beans.BeanUtils;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.*;
	import org.springframework.stereotype.Controller;


	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import java.io.IOException;
	import java.io.UnsupportedEncodingException;
	import java.lang.reflect.InvocationTargetException;
	import java.util.List;
	import java.util.Map;

/**
 * @ClassName: StudentController
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/10 19:10
 * @Version: 1.0.0
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private ClassesService classesService;
	@Autowired
	private GradeService gradeService;
	@Autowired
	private SpecialtyService specialtyService;

	@GetMapping("/index")
	public String showStudnetIndex(Model model){
		List<Classes> classes = classesService.showAllClasses();
		List<Grade> grades = gradeService.showAllGrade();
		List<Specialty> specialties = specialtyService.showAllSpecialty();
		model.addAttribute("classes",classes);
		model.addAttribute("grades",grades);
		model.addAttribute("specialties",specialties);
		return "student/index";
	}

	@GetMapping("/searchStudent")
	@ResponseBody
	public void showStudent(Student student, HttpServletResponse response) {
		String studnetData = studentService.findStudentByCriteria(student);
		try {
			response.getWriter().write(studnetData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/addView")
	public String addView(Model model) {
		model.addAttribute("classes", classesService.showAllClasses());
		model.addAttribute("grades", gradeService.showAllGrade());
		model.addAttribute("specialties", specialtyService.showAllSpecialty());
		return "student/add";
	}

	@PostMapping("/addStudent")
	public String addStudent(Student student) {
		studentService.addStudent(student);
		return "forward:/index";
	}

	@GetMapping("/deleteStudent/{idss}")
	public void deleteStudnet(@PathVariable String idss, HttpServletResponse response) {
		boolean deleteStudent = studentService.deleteStudent(idss);
		try {
			response.getWriter().write(String.valueOf(deleteStudent));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/edit/{id}")
	public String editView(Model model,@PathVariable Integer id) {
		model.addAttribute("classes", classesService.showAllClasses());
		model.addAttribute("grades", gradeService.showAllGrade());
		model.addAttribute("specialty", specialtyService.showAllSpecialty());
		model.addAttribute("student",studentService.findStudentById(id));
		return "student/edit";
	}

	@PostMapping("/editStudent/id")
	public String editStudent(Student student) {
		studentService.updateStudent(student);
		return "forward:/student/index";
	}
}
