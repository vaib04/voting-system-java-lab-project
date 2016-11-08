<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Voting System</title>
    </head>

    <body>
        <!--<p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>-->
        <center>
            <div>
                <h3>Login</h3>
                <form action="/VotingSystem/loginresult.htm" method="post">
                 username: <input type="text" name="uname" /><br/>
                 password: <input type="password" name="pass" /><br/>
                 <input type="submit" value="Login" /><br/>
                 <input type="reset" value="Reset" />
                </form>
            </div>
            <hr>
            <br/>
            <div>
               <h3> or <a href="register.htm">Register</a></h3>
            </div>
            <hr>
            <div>
                ${msg}
            </div>
        </center>
    </body>
</html>
