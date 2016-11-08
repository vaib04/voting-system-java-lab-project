<%-- 
    Document   : user_loggedin
    Created on : 31 Oct, 2016, 11:39:16 AM
    Author     : vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${person.uname}: logged in</title>
    </head>
    <body>
        <h1>Hello</h1><br/>
        <p> Username: ${person.uname} </p>
        
        <a href="login.htm">Go to Login page</a>
    </body>
</html>
