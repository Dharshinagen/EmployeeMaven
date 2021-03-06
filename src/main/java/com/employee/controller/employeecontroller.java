package com.employee.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 
import com.employee.handler.EmployeeHandler;
import com.employee.model.EmployeeDetails;

@Controller
public class employeecontroller {
	
	@Autowired
	private EmployeeHandler empHandler;
	
	@RequestMapping(value = "/")
	public ModelAndView handler(HttpServletResponse response) throws IOException {
		return new ModelAndView("employee");
	}
	
	@RequestMapping(value = "/EmployeeServ")
	public ModelAndView handler1(HttpServletRequest request,HttpServletResponse response) throws IOException {
		  EmployeeHandler empHandler=new EmployeeHandler();
	        int i= empHandler.insertEmployee(request);

	        	if(i == 1)
	    		{
	        	//     System.out.println("serv"+i);
	        		 return new ModelAndView("searchList");
	    		}else {
	    			HttpSession session = request.getSession();
	    			session.setAttribute("add", "Not Inserted");
	    		//	 System.out.println("serv"+i);
	    			 return new ModelAndView("employee");
	    		}

	}
	@RequestMapping(value = "/EmployeeList")
	public String getList(ModelMap empList) {
		List<EmployeeDetails> list = empHandler.listDetails();
		empList.addAttribute("employeeList", list);
		return ("employeeList");
	}

}
