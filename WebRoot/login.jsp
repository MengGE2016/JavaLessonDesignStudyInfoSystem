<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
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
    <h1>登录</h1>
   
    <t:form action="userLoginAct.action">
    <t:textfield name="username" label="用户名" size="30" maxlength="10"/>
    <t:password name="password" label="密码" size="30" maxlength="10"/>
    <table>
   <tr>
   <th>
   <t:submit value="确定" theme="simple"/>
   </th>
    <th>
    <t:reset value="取消" theme="simple"/>
    </th>
    </tr>
    </table>
    </t:form>
    </center>
  </body>
</html>
