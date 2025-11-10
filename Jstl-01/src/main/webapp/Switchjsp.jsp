<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Select any Number</h1>
<form action="./Switchjsp.jsp">
<select name ="Combo">

<option value ="1">1</option>
<option value ="2">2</option>
<option value ="3">3</option>
</select>
<input type="submit"/>
</form>
<c:set var ='day'  value= "${param.Combo}"/>
<c:choose>
  <c:when test ="${day==1}">
    SUNDAY
   </c:when>
  <c:when test ="${day==2}">
    Monday
   </c:when>
  <c:when test ="${day==3}">
    Tuesday
   </c:when>
   <c:otherwise>
    Choose any Number between 1to 7
   </c:otherwise>
</c:choose>
  
  









</body>
</html>