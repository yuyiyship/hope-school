package com.yship.service.impl;

import com.google.gson.Gson;
import com.yship.bean.Grade;
import com.yship.bean.GradeExample;
import com.yship.mapper.GradeMapper;
import com.yship.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: GradeServiceImpl
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/14 17:16
 * @Version: 1.0.0
 */
@Service
public class GradeServiceImpl implements GradeService {
	@Autowired
	private GradeMapper gradeMapper;
	@Override
	public List<Grade> showAllGrade() {
		List<Grade> grades = gradeMapper.selectByExample(new GradeExample());
		return grades;
	}

	@Override
	public String showGradeByByCriteria(Grade grade) {
		List<Grade> grades = showAllGrade();
		String gradeData = new Gson().toJson(grades);
		return gradeData;
	}

	@Override
	public int addGrade(Grade grade) {
		int insert = gradeMapper.insert(grade);
		return insert;
	}

	@Override
	public boolean deleteGrade(String ids) {
		String[] split = ids.split("-");
		try {
			for (int i = 1; i < split.length-1; i++) {
				gradeMapper.deleteByPrimaryKey(Integer.valueOf(split[i]));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
