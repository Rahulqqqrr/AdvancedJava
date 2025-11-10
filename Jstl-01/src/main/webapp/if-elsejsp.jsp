<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>If-Else</title>
</head>
<body>
  <c:set var ="x" value="10"/>
  <c:set var ="y" value="20"/>
  <c:if test="${x<y}" var="result">
    X is ::${x}</br>
    Result is ::${result}</br>
  </c:if>
   <c:if test="${x eq y }" var="result">
    X is result::${x}</br>
   </c:if>
 
</body>
</html>