<%!
 Integer id;
 String name ;
 Integer age;
 String address;
 
  

%>
<%
id =Integer.parseInt(request.getParameter("id"));
name = request.getParameter("name")
age = Integer.parseInt(request.getParameter("age"));
address=request.getParameter("address");


%>

<jsp:useBean id ="student" class="in.ineuron.bean.Student" scope="page">
    <jsp:setProperty property ="*" name ="student"/>
   
</jsp:useBean>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<centre>
<h1> Student Details</h1>
  <table border ='1'>
    <tr>    
       <th>Id</th>
         <td>
           <jsp:getProperty property="id" name="student"/>
         </td>
    </tr>
    <tr>
         <th>Name</th>
         <td>
           <jsp:getProperty property="name" name= "student"/>
         </td>
    </tr>
    
    <tr>
         <th>Age</th>
         <td>
           <jsp:getProperty property="age" name="student"/>
         </td>
    </tr>
    <tr>
         <th>Address</th>
         <td>
           <jsp:getProperty property="address" name= "student"/>
         </td>
    </tr>
         
  </table>
  
</centre>

</body>
</html>
