package com.example.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.service.EmpService;
import com.example.web.vo.Emp;

@RestController
public class EmpRestController {
	@Autowired(required = false)
	private EmpService service;
	
	// http://localhost:5080/emplistData.do
	@RequestMapping("emplistData.do")
	public List<Emp> getEmpList(Emp sch){
		
		return service.getEmpList(sch);
	}
	
	
	
}
