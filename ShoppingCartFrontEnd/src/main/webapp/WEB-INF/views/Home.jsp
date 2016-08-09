<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>


<title>Home Page</title>


</head>
<header></header>
<body>


	<div data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>Welcome to Shopping Cart</h1>
			<table width="100%">
				<tr>
					<c:choose>
						<c:when test="${empty nameofloggedinuser}">
							<td align="left">Existing user<a href="justlogin"> Login
									here</a></td>
							<td align="center">New user<a href="getregistered">
									Register here</a></td>
						</c:when>
						<c:when test="${not empty nameofloggedinuser}">
							<td>Welcome ${nameofloggedinuser},</td>
							<td align="right"><a href="logout"> logout</a></td>
						</c:when>

					</c:choose>
				</tr>
				<tr>
					<c:if test="${loggedOut==true}">
						<td>${logoutMessage}</td>
					</c:if>
				</tr>
				
			</table>
		</div>

		

			
			

			<div id="getregistered">
				<c:if test="${ifclickedregister==true}">
					<%@ include file="/WEB-INF/views/register.jsp"%>

				</c:if>
			</div>

			<div id="justlogin">
				<c:if test="${ifclickedlogin==true || invalidCredentials==true}">
				  <div id = "error">  ${errorMessage} </div>
					<%@ include file="/WEB-INF/views/login.jsp"%>

				</c:if>
			</div>

			
			
		</div>
		<div data-role="footer" data-position="fixed">
			<h1>&copy; 2016 - Shopping Cart</h1>
		</div>
	</div>
</body>
</html>