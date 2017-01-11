<%@ page language="java" import="java.util.*,action.*,hib.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教研信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- <form id="GetSyudyInfoList" name="GetSyudyInfoList" action="GetSyudyInfoListAct.action" method="post"></form>
  <script language="JavaScript">document.form.GetSyudyInfoList.submit();</script> -->
  </head>
  
  <body>
  
  
  
   <center>
   <h1>教研信息</h1>
   <hr>
   <br>
   <table border="1">
   <tr><th>教师</th><th>信息</th><th>发布时间</th></tr>
   <%
   StudyinfoDAO studyinfoDAO = new StudyinfoDAO();
		System.out.println(studyinfoDAO.findAll().size());
		Iterator iteratorq = studyinfoDAO.findAll().iterator();
		while (iteratorq.hasNext()) {
			Studyinfo Studyinfo = (Studyinfo) iteratorq.next();
			StudyinfoId id = Studyinfo.getId();%>
		<tr><th><%=id.getTeacherUnme()%></th><th><%=id.getContent()%></th><th><%=id.getTime()%></th></tr>
	<%	} %>
   </table>
   </center>
  </body>
</html>
