package com.yship.service;

import com.yship.bean.Grade;
import com.yship.bean.Student;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: GradeService
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/14 17:11
 * @Version: 1.0.0
 */
public interface GradeService {
	List<Grade> showAllGrade();

	String showGradeByByCriteria(Grade grade);

	int addGrade(Grade grade);

	boolean deleteGrade(String idss);
}
