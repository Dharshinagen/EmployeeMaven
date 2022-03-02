package com.employee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

 
import com.employee.config.MvcConfig;
import com.employee.model. *;
 
import com.employee.model.EmployeeDetails;

public class EmployeeDetailsDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public  EmployeeDetailsDao() {
		MvcConfig mvcConfig=new MvcConfig();
		jdbcTemplate=new JdbcTemplate(mvcConfig.getDataSource());
	}
	
	public int addEmployee(final EmployeeDetails employee) {
	  return	jdbcTemplate.update("insert into employee_details (employee_name, employee_code, email, address1, address2, city, state, date_of_birth, joining_date) values(?,?,?,?,?,?,?,?,?)",
				new Object[] { employee.getEmployeeName(), employee.getEmployeeCode(),employee.getEmail(),employee.getAddress1(), employee.getAddress2(),employee.getCity(),employee.getState(),java.sql.Date.valueOf(employee.getDateOfBirth()),java.sql.Date.valueOf(employee.getJoiningDate())});

	}	
	 
//	public List<EmployeeDetails> searchEmployee( final String empCode, final String city, final String state, final LocalDate fromDate,
//			final LocalDate toDate) throws SQLException {
//
//	 
//
//		StringBuilder query = new StringBuilder();
//		query.append(" select employee_code,employee_name,email,city,state,joining_date from employee_Details ");
//		if (!empCode.equals("") && !city.equals("") && !state.equals("") && !fromDate.equals("")
//				&& !toDate.equals("")) {
//			query.append(" where employee_code= " + "'" + empCode + "'" + "and city=" + "'" + city + "'" + "and state ="
//					+ "'" + state + "'");
//			query.append(" and to_char(joining_date,'yyyy-mm-dd') between  " + "'" + fromDate + "'" + " and " + "'"
//					+ toDate + "'");
//		} else if (!empCode.equals("") || !city.equals("") || !state.equals("") || !fromDate.equals("")
//				|| !toDate.equals("")) {
//			query.append(" where ");
//
//			if (!empCode.equals("")) {
//				query.append(" employee_code= " + "'" + empCode + "'");
//			}
//
//			if (!city.equals("")) {
//				if (empCode.equals("")) {
//					query.append(" lower(city) like " + "'" + city.toLowerCase() + "%'");
//				} else {
//					query.append(" and lower(city) like " + "'" + city.toLowerCase() + "%'");
//				}
//
//			}
//			if (!state.equals("")) {
//				if (empCode.equals("") && city.equals("")) {
//					query.append(" lower(state) like " + "'" + state.toLowerCase() + "%'");
//				} else if (empCode.equals("") || city.equals("")) {
//					query.append(" and lower(state) like " + "'" + state.toLowerCase() + "%'");
//				} else {
//					query.append("and lower(state) like " + "'" + state.toLowerCase() + "%'");
//				}
//
//			}
////			if (toDate.equals("")) {
////				System.out.println("date"+date);
////				toDate = date;
////				System.out.println("to"+toDate);
////			}
//			if (fromDate != null && toDate != null) {
//
//				if (empCode.equals("") && (city.equals("")) && (state.equals(""))) {
//
//					query.append(" to_char(joining_date,'yyyy-mm-dd') between  " + "'" + fromDate + "' and '" + toDate
//							+ "'");
//				} else {
//					query.append("and to_char(joining_date,'yyyy-mm-dd') between  " + "'" + fromDate + "' and '"
//							+ toDate + "'");
//				}
//			} else if (fromDate != null) {
//
//				if (empCode.equals("") && (city.equals("")) && (state.equals(""))) {
//
//					query.append(" to_char(joining_date,'yyyy-mm-dd') =  " + "'" + fromDate + "'");
//				} else {
//					query.append("and to_char(joining_date,'yyyy-mm-dd')=  " + "'" + fromDate + "'");
//				}
//			}
//
//		}
//
//		String sql = query.toString();
//
//		try {
//	//		con = ConnectionUtil.getDbConnection();
//			prestatement = con.createStatement();
//			reset = prestatement.executeQuery(dateQuery);
//			if (reset.next()) {
//				date = reset.getDate("sysdate").toLocalDate();
//				// System.out.println("sasd"+date);
//			}
//			statement = con.createStatement();
//			rs = statement.executeQuery(sql);
//			while (rs.next()) {
//				EmployeeDetails employee = new EmployeeDetails(rs.getString("employee_name"),
//						rs.getString("employee_code"), rs.getString("email"), rs.getString("city"),
//						rs.getString("state"), rs.getDate("joining_date").toLocalDate());
//				list.add(employee);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (rs != null)
//				rs.close();
//			if (statement != null)
//				statement.close();
//			if (prestatement != null)
//				prestatement.close();
//			if (con != null)
//				con.close();
//
//		}
//		return list;
//	}

	public List<EmployeeDetails> getEmployeeDetail() {
		 
			List<EmployeeDetails> employee = jdbcTemplate.query("select  employee_name,employee_code,email,address1,address2,city,state,date_of_birth,joining_date from employee_details", new Mapper());
		 	return employee;
		// String
	}
	
	public List<EmployeeDetails> viewEmployeeDetail() throws SQLException {
		List<EmployeeDetails> list = new ArrayList<>();

		String query = "select  employee_name,employee_code,email,address1,address2,city,state,date_of_birth,joining_date from employee_details";
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
		//	con = ConnectionUtil.getDbConnection();
			statement = con.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				EmployeeDetails empDetail = new EmployeeDetails(rs.getString("Employee_Name"),
						rs.getString("employee_code"), rs.getString("email"), rs.getString("address1"),
						rs.getString("address2"), rs.getString("city"), rs.getString("state"),
						rs.getDate("date_of_birth").toLocalDate(), rs.getDate("joining_date").toLocalDate());
				list.add(empDetail);

			}
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			if (rs != null)
				rs.close();
			if (statement != null) {
				statement.close();
			}
			if (con != null) {
				con.close();
			}
		}

		return list;
	}


}
