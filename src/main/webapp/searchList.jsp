<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>search</title>
</head>
<body>
     <h1>Search Detail</h1>
	<form action="SearchServ" method="post">
		<table>
			<tr>
				<th><label for="empcode">Employee Code</label></th>
				<td><input type="text" name="empcode" id="empcode" ></td>
			</tr>
			<tr>
			 	<th><label for="city">City</label></th>
				<td><input type="text" name="city" id="city" ></td>
			</tr>
			<tr>
				<th><label for="state">State</label></th>
				<td><input type="text" name="state" id="state" ></td>
			</tr>
			<tr>
				<th><label for="joiningDateFrom">Joining Date From</label></th>
				<td><input type="date" name="joiningDateFrom" id="joiningDateFrom" ></td>
			 
				<th><label for="joiningDateTo">  To</label></th>
				<td><input type="date" name="joiningDateTo" id="joiningDateTo" >
				</td>
			</tr>
		</table><br>
		<button>Search</button>
	</form>
<table>
		<caption>
			<thead>
				<tr>
					<th>S.no</th>
					<th>Employee name</th>
					<th>Employee code</th>
					<th>Email Id</th>
					<th>city</th>
					<th>state</th>
					<th>Joining Date</th>
				</tr>
			</thead>

			<tbody>

				<c:set var="i" value="0" />
				<c:forEach items="${searchlist}" var="viewEmployee">
					<c:set var="i" value="${i+1}" />
					<tr>

						<td>${i}</td>
						<td><a href="UpdateServ?empName=${viewEmployee.employeeName}">${viewEmployee.employeeName}</a></td>
						<td><a href="UpdateServ?empcode=${viewEmployee.employeeCode}">${viewEmployee.employeeCode}</a></td>
						<td>${viewEmployee.email}</td>
				 		<td>${viewEmployee.city}</td>
						<td>${viewEmployee.state}</td>
						<td>${viewEmployee.joiningDate}</td>
					</tr>

				</c:forEach>
			</tbody>
		</caption>
	</table>
</body>
</html>

