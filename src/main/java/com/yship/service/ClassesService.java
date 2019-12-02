package com.yship.service;

import com.yship.bean.Classes;
import com.yship.bean.Specialty;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: ClassesService
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/14 17:12
 * @Version: 1.0.0
 */
public interface ClassesService {
	List<Classes> showAllClasses();

	String findClassesByCriteria(Classes classes);

	int addClasses(Classes classes);

	boolean deleteClasses(String idss);
}
