<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<h1>Counter App</h1>
	<p> 
		The current count is: <c:out value="${count}"></c:out>
	</p>
	<a href="/clear">empty your count!</a>
</body>
</html>