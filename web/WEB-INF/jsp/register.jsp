<%-- 
    Document   : newjsp
    Created on : 30 Oct, 2016, 2:45:42 AM
    Author     : vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Voter? Register</title>
    </head>
    <body>
        <center>
            <div>
                <h3>Sign up</h3>
                <form action="/VotingSystem/registerVoter.htm" method="post">
                 username: <input type="text" name="uname" /><br/>
                 password: <input type="password" name="pass" /><br/>
                 <input type="submit" value="Sign up" /><br/>
                 <input type="reset" value="Reset" />
                </form>
            </div>
            <hr>
            <br/>
            <div>
               <h3> or <a href="login.htm">Go to Login page</a></h3>
            </div>
            <div>
                ${msg}
            </div>
        </center>
    
    </body>
</html>
