<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body> 
        <div id="main_content">
            <h1>Moylish Motors Login </h1>
            <hr>             
            <div>
                
                <shiro:guest>
                    <a href="index.jsp">Home</a>
                    <a href="login.jsp">Login</a>
                    <a href="register.jsp">Register</a>
                </shiro:guest>                
                <shiro:user>
                    <a href="index.jsp">Home</a>
                    <a href="account.jsp">Account</a>
                    <a href="logout">Logout</a>
                    <shiro:hasRole name="customer"> <a href="favourites">Favourites</a></shiro:hasRole>
                </shiro:user>
                             
            </div>
            <hr><br>


            <shiro:guest>       
                <c:if test="${shiroLoginFailure != null}">
                    Username or password incorrect
                </c:if>

                <div id='login_form'>
                    <form name="loginform" method="post">
                        <table border="0" cellspacing="2" cellpadding="2">
                            <tbody>
                                <tr>
                                    <td><label for="username">Username:</label></td>
                                    <td colspan="2"><input type="text" id="username" name="username" /></td>
                                </tr>
                                <tr>
                                    <td> <label for="password">Password:</label></td>
                                    <td colspan="2"> <input type="password" id="password" name="password" /></td>
                                </tr>
                                <tr>
                                    <td><input type="submit" value="Login" /></td>
                                    <td><input type="reset" value="Reset" /></td>
                                    <td><a href="index.jsp"> Back </a></td> 
                                </tr>
                            </tbody>
                        </table>
                        <br/>
                        <label for="rememberMe">Remember me:</label>
                        <input type="checkbox" id="rememberMe" name="rememberMe" value="true" />
                        <br/>
                        <br/>
                    </form>
                </shiro:guest>
                <shiro:user>
                    You are already logged in!
                    <br>Visit your account page <a href="account.jsp">here</a>
                    <br><br><a href="logout">Logout</a>        
                </shiro:user>
            </div>
        </div>
        
        
        <shi
</html>
