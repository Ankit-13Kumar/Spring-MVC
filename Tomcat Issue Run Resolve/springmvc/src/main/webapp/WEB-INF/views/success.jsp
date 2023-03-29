<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success Page</title>
</head>
<body>

<h1>${Header}</h1>
<p>${Desc}</p>
<hr>

<%-- <h1>Name of user ${name }</h1>
<h1>Email Address ${email }</h1>
<h1>User Password ${password }</h1>  --%>
<%-- Form data and name--%>
<h1>Name of user ${user.userName}</h1>
<h1>Email Address ${user.email }</h1>
<h1>User Password ${user.password }</h1>






</body>
</html>