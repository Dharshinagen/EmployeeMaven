<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
   <h1> Update Details</h1>
      <form action ="" method = "post">
      <div class="t1">
      <table>
        <tr>
          <th><label for="empname">Employee Name</label></th>
          <td><input type="text" id="empname" name="empname" value='<c:out value="${employeename}"></c:out>' pattern="[A-Za-z]{5,}" required></td>
        </tr>
       
        <tr> 
          <th><label for="empcode">Employee Code</label></th>
          <td> <input type="text" name="empcode" id="empcode" required></td>
        </tr>
        <tr>
         <th><label for="email">Email Address</label></th>
         <td> <input type="email" name="email" id="email" required></td>
        </tr>
        <tr>
          <th> <label for="address1">Address Line1</label></th>
          <td> <input type="text" name="address1" id="address1" required></td>
         </tr>
       <tr>
         <th><label for="address2">Address Line2</label></th>
         <td><input type="text" name="address2" id="address2" required></td>
        </tr>
        <tr>
         <th> <label for="city">City</label></th>
         <td><input type="text" name="city" id="city" required></td>
        </tr>
        <tr>
           <th><label for="state">State</label></th>
           <td><input type="text" name="state" id="state" required></td>
        </tr>
        <tr>
           <th><label for="date">Date Of Birth</label></th>
           <td><input type="date" name="date" id="date" required></td>
        </tr>
        <tr>
           <th> <label for="doj">Date Of Joining</label></th>
           <td> <input type="date" name="doj" id="doj" required></td>
        </tr>
       </table>
       </div>
        <button>Submit</button>
</body>
</html>