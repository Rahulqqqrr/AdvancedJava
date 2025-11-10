<%@ page import="java.sql.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Process</title>
</head>
<body>
 <%!
  
     String name;
     Integer age ;
     String  address;
     
     
     // Resources for   Jdbc
      static Connection connection =null;
      static Statement stmt =null;
      ResultSet res =null;
      
      static{
    	  try{
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		  String url ="jdbc:mysql://localhost:3306/enterpricejavabatch";
    		  String username ="root";
    	      String password="6398267712";
    	      
    	      connection = DriverManager.getConnection(url,username,password);
    	      stmt = connection.createStatement();
   
    	  }catch(ClassNotFoundException e){
    		 e.printStackTrace();
    		  
    	  }catch(Exception se){
    		  se.printStackTrace();
    	  }
        
}%>
<%
   name =request.getParameter("name");
   age =Integer.parseInt(request.getParameter("age"));
   address=request.getParameter("address");
   res = stmt.executeQuery("select * from student where name ='" +name +"'");
   boolean available =res.next();
   if(available ==true){
	      
%>
 <jsp:forward page="./Exisited.jsp"/>
 <%
  }else{
	  String query ="insert into student values('"+name+"','"+age+"','"+address+"')";
	  int rowAffected = stmt.executeUpdate(query);
	     if(rowAffected==1){
  %>
 <jsp:forward page  ="./success.jsp"/>
 <% 
 }    
	     else{
 %>
        <jsp:forward page ="./failure.jsp"/>
<%
 }
%>
<%
 }
%>

</body>
</html>