package com.bdi.sp.service;

import java.util.List;

import com.bdi.sp.vo.Exam;

public interface ExService {
	public List<Exam> getExamList();
	public Exam getExam(int exnum);
	public int insertExam(Exam ex);
	public int deleteExam(int exnum);
	public int updateExam(Exam ex);

}
