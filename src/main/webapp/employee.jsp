<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>employee</title>
<style>
.t1 {
	margin-right: 370px;
	font-size: 18px;
}

.cls {
	border-radius: 3px;
	padding: 5px 5px 5px 5px;
	Background-color: transparent;
}

a {
	text-decoration: none;
	color:white;
}

.div1 {
	padding-left: 460px;
}

.btn2 {
	padding: 5px;
	color: white;
	background-color: green;
	margin-right: 30px;
	border: 0;
	border-radius: 3px;
}

.btn3 {
	margin-left: 90px;
}

body {
	background-color: rgba(198, 208, 214, .9);
}

td {
	padding-left: 20px;
	text-align: justify;
	padding-bottom: 8px;
}

th {
	text-align: justify;
	padding-left: 30px;
	padding-bottom: 8px;
}
</style>
</head>
<body>
	<h1>Employee Details</h1>
	<div class="div1">
	<form action="EmployeeServ" method="post">
		<div class="t1">
			<table>
				<tr>
					<th><label for="empname">Employee Name</label></th>
					<td><input type="text" class="cls" id="empname" name="empname"
						value="" pattern="[A-Za-z]{5,}" placeholder="NAME" required></td>
				</tr>

				<tr>
					<th><label for="empcode">Employee Code</label></th>
					<td><input type="text" class="cls" name="empcode" placeholder="EMPLOYEE CODE" id="empcode"
						required></td>
				</tr>
				<tr>
					<th><label for="email">Email Address</label></th>
					<td><input type="email" class="cls" name="email" placeholder="EMAIL ID" id="email"
						required></td>
				</tr>
				<tr>
					<th><label for="address1">Address Line1</label></th>
					<td><input type="text" class="cls" name="address1" placeholder="ADDRESS"
						id="address1" required></td>
				</tr>
				<tr>
					<th><label for="address2">Address Line2</label></th>
					<td><input type="text" class="cls" name="address2" placeholder="ADDRESS"
						id="address2" ></td>
				</tr>
				<tr>
					<th><label for="city">City</label></th>
					<td><input type="text" class="cls" name="city" id="city" placeholder="CITY"
						required></td>
				</tr>
				<tr>
					<th><label for="state">State</label></th>
					<td><input type="text" class="cls" name="state" id="state" placeholder="STATE"
						required></td>
				</tr>
				<tr>
					<th><label for="date">Date Of Birth</label></th>
					<td><input type="date" class="cls" name="date" id="date"
						required></td>
				</tr>
				<tr>
					<th><label for="doj">Date Of Joining</label></th>
					<td><input type="date" class="cls" name="doj" id="doj"
						required></td>
				</tr>
			</table><br>
		</div>
		<div class="btn3">
			<button class="btn2">Submit</button>
			<button class="btn2">
				<a href="EmployeeList">Employee List</a>
			</button>
			<button class="btn2">
				<a href="searchList.jsp">Search</a>
			</button>
		</div>
		<c:if test="${sessionScope.add!=null}">
			<h4>${sessionScope.add}</h4>
		</c:if>

		<c:remove var="add" scope="session" />

	</form>
	</div>
</body>
</html>