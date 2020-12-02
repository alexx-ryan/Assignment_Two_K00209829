<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Account</title>
    </head>
    <body>
        <div id="main_content">
            <h1>Account Page.</h1>
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
            
            
            Hello <shiro:principal/>
            <br><br>

            <shiro:hasRole name="admin">                 
                You are an Admin!
                <br><br>
                If you would like to visit the management dashboard, click 
                <a href="management/management.jsp"> here. </a>

            </shiro:hasRole>

            <shiro:hasRole name="customer"> 
                you are a customer! 
            </shiro:hasRole>

            

        </div>
    </body>
</html>
