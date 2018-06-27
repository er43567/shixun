<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <table>
	   <tr><td>用户名</td><td>密码</td></tr>
	   <s:iterator value="userLists" var="user">
	   <tr><td><s:property value="#user.userName"/><td><td><s:property value="#user.password"/></td></tr>
	   </s:iterator>
    <table>
</body>
</html>