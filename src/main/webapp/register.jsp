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
            <h1>Moylish Motors Register. </h1>
            <hr>                                  
            <div>
                <a href="index.jsp">Home</a>
                <a href="login.jsp">Login</a>
                <a href="register.jsp">Register</a>
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
                                    <td> <label for="username">Username:</label></td>
                                    <td colspan="2"><input type="text" id="username" name="username" /></td>
                                </tr>
                                <tr>
                                    <td> <label for="password">Email:</label></td>
                                    <td colspan="2"> <input type="email" id="email" name="email" /></td>
                                </tr>
                                <tr>
                                    <td> <label for="name">Name:</label></td>
                                    <td colspan="2"> <input type="text" id="name" name="name" /></td>
                                </tr>
                                <tr>
                                    <td> <label for="name">Phone:</label></td>
                                    <td colspan="2"> <input type="text" id="phone" name="phone" /></td>
                                </tr>
                                <tr>
                                    <td> <label for="name">Address:</label></td>
                                    <td colspan="2"> <input type="text" id="address" name="address" /></td>
                                </tr>
                                <tr>
                                    <td> <label for="name">Password:</label></td>
                                    <td colspan="2"> <input type="text" id="phone" name="phone" /></td>
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
</html>
