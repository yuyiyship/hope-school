package com.yship.service.impl;

import com.google.gson.Gson;
import com.yship.bean.Classes;
import com.yship.bean.ClassesExample;
import com.yship.bean.Grade;
import com.yship.mapper.ClassesMapper;
import com.yship.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: ClassesServiceImpl
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/14 17:15
 * @Version: 1.0.0
 */
@Service
public class ClassesServiceImpl implements ClassesService {

	@Autowired
	private ClassesMapper classesMapper;
	@Override
	public List<Classes> showAllClasses() {
		List<Classes> classes = classesMapper.selectByExample(new ClassesExample());
		return classes;
	}

	@Override
	public String findClassesByCriteria(Classes classes) {
		List<Classes> grades = showAllClasses();
		String classesData = new Gson().toJson(grades);
		return classesData;
	}

	@Override
	public int addClasses(Classes classes) {
		int insert = classesMapper.insert(classes);
		return insert;
	}

	@Override
	public boolean deleteClasses(String idss) {
		String[] split = idss.split("-");
		try {
			for (int i = 1; i < split.length-1; i++) {
				classesMapper.deleteByPrimaryKey(Integer.valueOf(split[i]));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
