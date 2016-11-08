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
    <center>
        <h3>Hello ${person.uname}</h3><br/>
        <form:form action="/VotingSystem/chooseElection.htm" method="post">
            Choose Election: 
            <form:select>
                <form:options items="${elections}"/>
            </form:select>
        </form:form>
        
        <hr>
        <a href="login.htm">Go to Login page</a>
    </center>
    </body>
</html>
