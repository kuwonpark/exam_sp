package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.ExDAO;
import com.bdi.sp.service.ExService;
import com.bdi.sp.vo.Exam;

@Service
public class ExServiceImpl implements ExService {

	@Autowired
	private ExDAO exdao;
	
	@Override
	public List<Exam> getExamList() {
		// TODO Auto-generated method stub
		return exdao.getExamList();
	}

	@Override
	public Exam getExam(int exnum) {
		// TODO Auto-generated method stub
		return exdao.getExam(exnum);
	}

	@Override
	public int insertExam(Exam ex) {
		// TODO Auto-generated method stub
		return exdao.insertExam(ex);
	}


	@Override
	public int deleteExam(int exnum) {
		// TODO Auto-generated method stub
		return exdao.deleteExam(exnum);
	}

	@Override
	public int updateExam(Exam ex) {
		// TODO Auto-generated method stub
		return exdao.updateExam(ex);
	}

}
