<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="./second.jsp">
  <jsp:param value="Java" name="sub1"/>
  <jsp:param value="Java2" name="sub2"/>
  <jsp:param value="Java3" name="sub3"/>
  </jsp:include>

</body>
</html>