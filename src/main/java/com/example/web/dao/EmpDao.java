package com.example.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.web.vo.Emp;
// com.example.web.dao.EmpDao.getEmpList
@Mapper
public interface EmpDao {
	public List<Emp> getEmpList(Emp sch);
    public Emp getDetail(int empno);
    public void updateEmp(Emp upt);
    public void deleteEmp(int empno); 
}
