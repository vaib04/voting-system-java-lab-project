<%-- 
    Document   : admin_loggedin
    Created on : 8 Nov, 2016, 5:44:31 AM
    Author     : vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login</title>
    </head>
    <body>
        <h1>Hello ${person.uname}(Admin)!</h1>
        
        <hr>
    <center>
        <form action="/VotingSystem/addParty.htm" method="post">
            Add new party: <input type="text" name="party"/>
            <input type="submit" value="Add" /><br/><br/>
        </form>
        <hr>
        <form action="/VotingSystem/addElection.htm" method="post">
            Add new election: <input type="text" name="election"/>
            <input type="submit" value="Add" /><br/><br/>
        </form>
        <hr>
        <a href="login.htm">Logout</a>
        <hr>
        <br/><br/><br/><br/><br/>
        ${msg}
    </center>
    </body>
</html>
