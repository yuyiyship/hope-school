package com.yship.service.impl;

import com.google.gson.Gson;
import com.yship.bean.Grade;
import com.yship.bean.Specialty;
import com.yship.bean.SpecialtyExample;
import com.yship.mapper.SpecialtyMapper;
import com.yship.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: SpecialtyServiceImpl
 * @Description: TODO
 * @Author: Yship
 * @Date: 2019/11/14 17:15
 * @Version: 1.0.0
 */
@Service
public class SpecialtyServiceImpl implements SpecialtyService {

	@Autowired
	private SpecialtyMapper specialtyMapper;
	@Override
	public List<Specialty> showAllSpecialty() {
		List<Specialty> specialties = specialtyMapper.selectByExample(new SpecialtyExample());
		return specialties;
	}

	@Override
	public String showSpecialtyByCriteria(Specialty specialty) {
		List<Specialty> specialties = showAllSpecialty();
		String gradeData = new Gson().toJson(specialties);
		return gradeData;
	}

	@Override
	public int addSpecialty(Specialty specialty) {
		int insert = specialtyMapper.insert(specialty);
		return insert;
	}

	@Override
	public boolean deleteSpecialty(String idss) {
		String[] split = idss.split("-");
		try {
			for (int i = 1; i < split.length-1; i++) {
				specialtyMapper.deleteByPrimaryKey(Integer.valueOf(split[i]));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
