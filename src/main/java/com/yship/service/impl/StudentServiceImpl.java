package com.yship.service.impl;

import com.google.gson.Gson;
import com.yship.bean.Student;
import com.yship.bean.StudentExample;
import com.yship.mapper.StudentMapper;
import com.yship.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: StudentServiceImpl
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/10 16:50
 * @Version: 1.0.0
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public String findStudentByCriteria(Student student) {
		StudentExample studentExample = new StudentExample();
		StudentExample.Criteria criteria = studentExample.createCriteria();
		if (student.getGradeId() != -1) {
			criteria.andGradeIdEqualTo(student.getGradeId());
		}
		if (student.getSpecialtyId() != -1) {
			criteria.andSpecialtyIdEqualTo(student.getSpecialtyId());
		}
		if (student.getClassId() != -1) {
			criteria.andClassIdEqualTo(student.getClassId());
		}
		if (!student.getAcademy().equals("")) {
			criteria.andAcademyEqualTo(student.getAcademy());
		}
		if (!student.getName().equals("")) {
			criteria.andNameEqualTo(student.getName());
		}
		if (!student.getPhone().equals("")){
			criteria.andPhoneEqualTo(student.getPhone());
		}
		List<Student> students = studentMapper.selectByExample(studentExample);
		String studentData = new Gson().toJson(students);
		return studentData;
	}

	@Override
	public Student findStudentById(Integer id) {
		Student student = studentMapper.selectByPrimaryKey(id);
		return student;
	}

	@Override
	public int addStudent(Student student) {
		int insert = studentMapper.insert(student);
		return insert;
	}

	@Override
	public boolean deleteStudent(String ids) {
		String[] split = ids.split("-");
		try {
			for (int i = 1; i < split.length-1; i++) {
				studentMapper.deleteByPrimaryKey(Integer.valueOf(split[i]));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int updateStudent(Student student){
		int i = studentMapper.updateByPrimaryKey(student);
		return i;
	}
}
