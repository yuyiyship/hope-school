package com.yship.service;

import com.yship.bean.Student;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: StudentService
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/10 14:09
 * @Version: 1.0.0
 */
public interface StudentService {
	String findStudentByCriteria(Student student);

	Student findStudentById(Integer id);

	int addStudent(Student student);

	boolean deleteStudent(String ids);

	int updateStudent(Student student);
}
