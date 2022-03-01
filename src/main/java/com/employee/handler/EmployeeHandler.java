package com.employee.handler;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import com.employee.dao.impl.EmployeeDetailsDao;
import com.employee.model.EmployeeDetails;

public class EmployeeHandler {


	public int insertEmployee(HttpServletRequest request) {
		   String empname = request.getParameter("empname");
			String empcode = request.getParameter("empcode");
			String emailid = request.getParameter("email");
			String address1 = request.getParameter("address1");
			String address2 = request.getParameter("address2");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			LocalDate dob = LocalDate.parse(request.getParameter("date"));
			LocalDate doj = LocalDate.parse(request.getParameter("doj"));
			EmployeeDetails employee = new EmployeeDetails(empname, empcode, emailid, address1, address2, city, state, dob,doj);
			EmployeeDetailsDao empdao=new EmployeeDetailsDao();
            int i= empdao.addEmployee(employee);
            System.out.println("hand"+i);
			return i;


	}

}
