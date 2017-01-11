<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教研信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <center>
   <h3>教师教研信息管理系统</h3>
   <hr>
   <h4><t:property value="#session.user_name"/></h4><br>
   <a href="http://localhost:8080/TeacherStudyInfoManagerSystem/studyInfoDeploy.jsp">发布信息</a>
   <br><br><br><br>
   <t:form action="TeacherLogoutAct.action">
   <t:submit value="退出登录" theme="simple"></t:submit>
   </t:form>
   </center>
  </body>
</html>
