package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.Exam;

public interface ExDAO {
	public List<Exam> getExamList();
	public Exam getExam(int exnum);
	public int insertExam(Exam ex);
	public int deleteExam(int exnum);
	public int updateExam(Exam ex);

}
