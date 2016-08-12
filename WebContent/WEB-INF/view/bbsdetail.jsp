<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:requestEncoding value="UTF-8"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글보기</title>
</head>
<body>
<h1>상세글보기</h1>

<table border="1">
<col width="200"><col width="500">
<tr><td>작성자</td><td>${bbs.id}</td></tr>

<tr><td>제목</td><td>${bbs.title}</td></tr>

<tr><td>조회수</td><td>${bbs.readcount}</td></tr>
<tr><td>정보</td><td>${bbs.ref}-${bbs.step}-${bbs.depth}</td></tr>
<tr><td>내용</td><td>${bbs.content}</td></tr>
</table>
<a href="bbslist.do">목록</a>

</body>
</html>