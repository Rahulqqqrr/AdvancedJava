<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    ArrayList<String>al = new ArrayList<String>();
    al.add("Rahul");
    al.add("Saini");
    pageContext.setAttribute("names",al);
    
  

%>
 
   <c:forTokens items ="one ,Two,Three"delims="," var ="data" begin="2" end="3" step=1>
   <h1>The result is::${data}</h1>
   </c:forTokens>
   <c:forEach items ="${names}" var ="name">
   <h1>${name }</h1>
   </c:forEach>
   




</body>
</html>