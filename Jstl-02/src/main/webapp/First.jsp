<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Output Page</title>
</head>
<body>
<h1>the Uri for  video is :::</h1>
 <c:import url ="Second.jsp">
 <c:param name ="Java" value ="Hyder"/>
 <c:param name ="JEE" value ="Hyder1"/>
 <c:param name ="JDBC" value ="Hyder3"/>
 


</c:import>


</body>
</html>