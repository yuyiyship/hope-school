package com.yship.service;

import com.yship.bean.Grade;
import com.yship.bean.Specialty;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: SpecialtyService
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/14 17:13
 * @Version: 1.0.0
 */
public interface SpecialtyService {
	List<Specialty> showAllSpecialty();

	String showSpecialtyByCriteria(Specialty specialty);

	int addSpecialty(Specialty specialty);

	boolean deleteSpecialty(String idss);
}
