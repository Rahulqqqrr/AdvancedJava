<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   
   Page Scope attribute::<%=pageContext.getAttribute("p",1) %><br/>
   Request Scope attribute::<%=pageContext.getAttribute("r",2) %><br/>
   Session Scope Attribute::<%=pageContext.getAttribute("s",3) %><br/>
   Application Scope Attribute::<%=pageContext.getAttribute("a",4) %><br/>
   
   
</body>
</html>