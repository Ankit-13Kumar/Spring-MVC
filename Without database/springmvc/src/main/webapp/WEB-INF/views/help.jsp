<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- for enabling expressions--%>
    <%@ page isELIgnored="false" %>




<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Help Page</title>
</head>
<body>a
    <%--<h1>help page controller</h1>
<%
String name=(String) request.getAttribute("name");

%>
--%>
   <%--<h1><%=time.toString()%></h1>
  <h1><%=name%></h1>--%>

  ${name}
  ${roll}
  <hr><h1>marks print</h1>
  ${marks}

  <%--<c:forEach var="item" items="${marks}">
   <%-- <h1>${item}</h1> --$>
  <c:out value="item"></c:out>
  </c:forEach>--$>


  <%-- Integer roll=(Integer)request.getAttribute("roll");
 LocalDateTime time=(LocalDateTime)request.getAttribute("time");
   <h1><%=roll%></h1> --%>

</body>
</html>