<%@ page import = "sist.co.model.SistBBSDTO" %>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:requestEncoding value="UTF-8"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bbslist</title>
</head>
<body>
<%
List<SistBBSDTO> bbslist = (List<SistBBSDTO>)request.getAttribute("bbslist");
%>

<h1>게시판</h1>
<jsp:useBean id="ubbs" class="sist.co.Help.BBSHelp"/>
<%/*  BBSHelp ubbs= new BBSHelp(); 위와 같다!!!!!!!!!*/ %>

<table border="1" style="width: 85%">
<colgroup>
<col style="width:20%">
<col style="width:60%">
<col style="width:20%">
</colgroup>
<tr>
<th>순서</th><th>제목</th><th>작성자</th>
</tr>

<%

if(bbslist==null||bbslist.size()==0){
%>
<tr>
<td colspan="3">작성된 글이 없습니다.</td>
</tr>
<%}else{

for(int i=0; i<bbslist.size();i++){
	SistBBSDTO bbs = bbslist.get(i);
%>
	<jsp:setProperty property="depth" name="ubbs" value="<%=bbs.getDepth()%>"/>
	<tr>
		<td><%=i+1%></td>
		<td>
		<jsp:getProperty property="arrow" name="ubbs"/>
		<a href="bbsdetail.do?seq=<%=bbs.getSeq()%>"><%=bbs.getTitle()%></a>
		</td>
		<td>
		<%=bbs.getId()%>
		</td>
	</tr>
<%} }%>
</table>

<a href="login.do">글 목록과 글쓰기</a>

</body>
</html>