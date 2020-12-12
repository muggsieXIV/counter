<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is the form</h1>
	<form action="/survey" method="POST">
		<br>
		username: <input type="text" name="username" placeholder="leave your name!" />
		<br>
		password: <input type="text" name="password" placeholder="leave your password" />
		<input type="submit" value="Login!" />
	</form>
</body>
</html>