package com.employee.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

 
import com.employee.model.EmployeeDetails;



public class Mapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDetails emp =new EmployeeDetails();
		emp.setEmployeeName(rs.getString("employee_name"));
		emp.setEmployeeCode(rs.getString("employee_code"));
		emp.setEmail(rs.getString("email"));
		emp. setAddress1(rs.getString("address1"));
		emp.setAddress2(rs.getString("address2"));
		emp.setCity(rs.getString("city"));
		emp.setState(rs.getString("state"));
		emp.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
		emp.setJoiningDate(rs.getDate("joining_date").toLocalDate());
		return emp;
	}
	

}
