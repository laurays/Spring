<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:requestEncoding value="UTF-8"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>

</head>
<body>

<h1>Login</h1>
<c:if test="${not empty login }">
${ login.id }님 안녕하세요
<br>
<table border="1" bgcolor="#aabbcc">
<col width="200"/>
	<tr>
		<td><a href="bbslist.do">글목록</a></td>
	</tr>
	<tr>
		<td><a href="bbswrite.do">글쓰기</a></td>
	</tr>
</table>
<br>
<a href="logout.do" >로그아웃</a>
</c:if>

<c:if test="${empty login }">

<form action="loginAf.do" method="post">
<table border="1">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id" size="20"></td>
	</tr>
	
	<tr>
		<td>패스워드</td>
		<td><input type="text" name="pwd" size="20"></td>
	</tr>
	
	<tr>
		<td colspan="2"><input type="submit" value="로그인"></td>
	</tr>
	
</table>
</form>

<a href="regi.do">회원가입</a>
</c:if>
</body>

</html>