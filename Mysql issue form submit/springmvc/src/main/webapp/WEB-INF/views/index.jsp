<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
</head>
<body>

<h1>My This is home page</h1>
<h1>called by home controller</h1>
<h1>url /home<h1>

<%-- Comments Dynamic Page --%>
    <%
    String name=(String) request.getAttribute("name");
    Integer id=(Integer)request.getAttribute("id");
    %>
   <h1>Name is <%=name %></h1>
   <h1>ID is  <%=id %></h1>



</body>
</html>

        <%-- list List<String> friends=(List<String>)request.getAttribute("f"); --%>
  <%-- <% for(String s:friends){
    out.println(s);}%>  --%>