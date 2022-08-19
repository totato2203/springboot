package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.dao.EmpDao;
import com.example.web.vo.Emp;

@Service
public class EmpService {
	@Autowired
	private EmpDao dao;
	public List<Emp> getEmpList(Emp sch){
		return dao.getEmpList(sch);
	}
    public Emp getDetail(int empno) {
    	return dao.getDetail(empno);
    }
    public void updateEmp(Emp upt) {
    	dao.updateEmp(upt);
    }
    public void deleteEmp(int empno) {
    	dao.deleteEmp(empno);
    } 
}
