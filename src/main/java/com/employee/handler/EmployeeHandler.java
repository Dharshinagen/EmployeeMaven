package com.employee.handler;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

 
import com.employee.dao.impl.EmployeeDetailsDao;
import com.employee.model.EmployeeDetails;

public class EmployeeHandler {

	@Autowired
	private EmployeeDetailsDao empDao;
	
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
	 
		public List<EmployeeDetails> listDetails() {
			return empDao.getEmployeeDetail();
	}
}

//	public void searchEmployee(HttpServletRequest request) {
//		try {
//		String empcode = request.getParameter("empcode");
//		String city = request.getParameter("city");
//		String state = request.getParameter("state");
//		String localDate=request.getParameter("joiningDateFrom");
//		LocalDate fromDate = null;
//		if (!localDate.equals(""))
//		{
//			fromDate=LocalDate.parse(request.getParameter("joiningDateFrom"));
//		}
//		String localDateTo= request.getParameter("joiningDateTo");
//		LocalDate toDate =null;
//		if(!localDateTo.equals(""))
//				{
//		           toDate= LocalDate.parse(request.getParameter("joiningDateTo"));
//				}
//		//System.out.println(fromDate);
//		EmployeeDetailsDao employeedetails = new EmployeeDetailsDao();
		
	//	List<EmployeeDetails> employeelist= employeedetails.searchEmployee(empcode, city, state, fromDate, toDate);
		
	//	System.out.println(employeelist);
//		request.setAttribute("searchlist", employeelist);
//		} catch (SQLException e) {
//		 
//			e.printStackTrace();
//		}
//	}

//}
