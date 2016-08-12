<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bbswrite</title>
</head>
<body>

<h1>글쓰기</h1>
<form action="bbswriteAf.do" method="get">
<table border="1" >

<tr>
<td>제목</td>
<td><input type="text"  name="title" size="20" style='width:100%'></td>
</tr>


<tr>
<td>작성자</td>
 <td>${ login.id }</td>
<!-- <td><input type="text"  name="id" size="20" style='width:100%'></td> -->
</tr>


<tr>
<td>내용</td>
<td><textarea rows="20" cols="50"  name="content" ></textarea></td>
</tr>


</table>
<input type="hidden" name="id" value="${ login.id }"/>
<input type="submit" value="저장" >
</form>
</body>
</html>