<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>

<html>
    <head>
        <LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
    </head>
    <body>

        <div id="main_content">
            <h1>Contact Us.</h1>
            <hr>             
            <div>                
                <shiro:guest>
                    <a href="index.jsp">Home</a>
                    <a href="login.jsp">Login</a>
                    <a href="register.jsp">Register</a>
                </shiro:guest>                
                <shiro:user>
                    <a href="index.jsp"> Home </a>
                    <a href="account.jsp"> Account </a>
                    <a href="logout"> Logout </a>
                    <shiro:hasRole name="customer"> <a href="favourites"> Favourites </a></shiro:hasRole>
                </shiro:user>                            
            </div>
            <hr>
            
           <form action="mailto:info@moylishmotors.ie">
                <table border="0" cellspacing="2" cellpadding="2">
                    <tbody>
                        <tr>
                            <td><label for="fname">Name</label></td>
                            <td colspan="2"><input type="text" id="contactName" name="contactName" placeholder="Name"></td>
                        </tr>
                        <tr>
                            <td> <label for="lname">Email Address</label></td>
                            <td colspan="2"> <input type="email" id="contactEmail" name="contactEmail" placeholder="Email Adress"></td>
                        </tr>
                        <tr>
                            <td> <label for="subject">Subject</label></td>
                            <td colspan="2"><textarea id="subject" name="subject" placeholder="Your message" style="height:200px"></textarea></td>
                        </tr>           
                        <tr>
                            <td><input type="submit" value="Submit" /></td>                          
                            <td><a href="index.jsp"> Back </a></td> 
                        </tr>
                    </tbody>
                </table>
                <br/>                                             
            </form>           
    </body>
</html>
