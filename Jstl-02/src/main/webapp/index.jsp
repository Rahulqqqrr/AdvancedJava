<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var ="ds" url="jdbc:mysql:///enterpricejavabatch" driver ="com.mysql.cj.jdbc.Driver" user ="root" password="6398267712"/>
<sql:query var ="result" dataSource="${ds}">
select*from student
</sql:query>
<h1>
   <c:forEach items ="${result.rows}" var ="row">
   ${row.name}||${row.age }||${row.address}</br>
  </c:forEach> 

</h1>










</body>
</html>