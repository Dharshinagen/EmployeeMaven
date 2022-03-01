<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>All Details</title>
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
	<br>
