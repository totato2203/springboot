package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	// http://localhost:5080/empList.do
	@RequestMapping("empList.do")
	public String empList() {
		return "a01_empList";
	}
	
}
