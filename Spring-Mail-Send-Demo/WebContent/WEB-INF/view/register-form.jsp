<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title> Spring-Mail-Send-Demo </title>

<style type="text/css">

.msg
{
	padding: 10px;
	color: green;
}

</style>

</head>

<body>

	<h3 class="msg"> ${message} </h3>

	<h2> Registration Form </h2> <hr>
	
	<form:form action="${pageContext.request.contextPath}/register" modelAttribute="register" method="post">
	
		<table>
		
			<tr>
				<td> Name: </td>
				<td> <form:input path="name"/> </td>
			</tr>
			
			<tr>
				<td> Email-ID: </td>
				<td> <form:input path="email"/> </td>
			</tr>
			
			<tr>
				<td> Phone No: </td>
				<td> <form:input path="phone"/> </td>
			</tr>
			
			<tr>
				<td> Address: </td>
				<td> <form:input path="address"/> </td>
			</tr>
			
			<tr>
				<td> Subject: </td>
				<td> <form:input path="subject"/> </td>
			</tr>
			
			<tr>
				<td> Content: </td>
				<td> <form:textarea cols="20" rows="5" path="content" /> </td>
			</tr>
			
			<tr>
				<td> <input type="submit" value="Submit"> </td>
			</tr>
		
		</table>
	
	</form:form>

</body>

</html>