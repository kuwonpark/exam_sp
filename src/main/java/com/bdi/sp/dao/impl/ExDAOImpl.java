package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.ExDAO;
import com.bdi.sp.vo.Exam;


@Repository
public class ExDAOImpl implements ExDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Exam> getExamList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.bdi.sp.EXAM.selectEXAM");
	}

	@Override
	public Exam getExam(int exnum) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.bdi.sp.EXAM.selectONEEXAM",exnum);
	}

	@Override
	public int insertExam(Exam ex) {
		// TODO Auto-generated method stub
		return ss.insert("com.bdi.sp.EXAM.insertEXAM",ex);
	}

	@Override
	public int deleteExam(int exnum) {
		// TODO Auto-generated method stub
		return ss.delete("com.bdi.sp.EXAM.deleteEXAM",exnum);
	}

	@Override
	public int updateExam(Exam ex) {
		// TODO Auto-generated method stub
		return ss.update("com.bdi.sp.EXAM.updateEXAM",ex);
	}

}
