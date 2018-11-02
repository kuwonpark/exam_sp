package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.service.ExService;
import com.bdi.sp.vo.Exam;


@Controller
public class ExController {
	
	@Autowired
	private ExService exs;
	
	@GetMapping(value="/exam")
	public @ResponseBody List<Exam> getExamList(){
		return exs.getExamList();
		
	}
	
	@GetMapping(value="/exam/{exnum}")
	public @ResponseBody Exam getExam(@PathVariable Integer exnum) {
		return exs.getExam(exnum);
	}
	
	@PostMapping(value="/exam/{exnum}")
	public @ResponseBody int insertExam(@RequestBody Exam ex){
		return exs.insertExam(ex);
	}
	
	@PutMapping(value="/exam/{exnum}")
	public @ResponseBody int updateExam(@RequestBody Exam ex){
		return exs.updateExam(ex);
	}
	
	@DeleteMapping(value="/exam/{exnum}")
	public @ResponseBody int deleteExam(@PathVariable Integer exnum){
		return exs.deleteExam(exnum);
	}

}
