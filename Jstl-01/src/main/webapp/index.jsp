<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OutPut Page</title>
</head>
<body>
<c:out  value ="Welcome to Jstl Coding"/>
<c:set  var ="x" value="10" scope="request"/>
<c:set  var ="y" value="12" scope="request"/>
<c:set  var ="sum" value="${x+y}" scope="session"/>
<h1 style='color:red ;text-aligin: centre;'>
  The Result is:: <c:out value="${sum} "/>

</h1>
<h1>
<c:remove var="x"/>
<c:remove var="y"/>
<c:remove var="sum"/>
<h1 style ='color:green; text-align:centre;'/>
The result is::<c:out value="${sum}" default="10000"/>
</h1>

</body>
</html>