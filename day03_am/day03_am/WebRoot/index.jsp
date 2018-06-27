<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>首页</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript">
       $(function(){
    	   alert($("username"));
    	   $("username").keydown(function(){
    		    alert(event.keyCode);
    	   });   
       })
    </script>
	</head>
  <body>
     <form  action="${pageContext.request.contextPath}/user/userAction_isExistUser.action" method="post">
       用户:<input type="text" name="userName" id="username"/><br>
       密码:<input type="password" name="password"></br><s:fielderror name="errors"/>
        <input type="submit" value="提交"/>
     </form>
  </body>
</html>
