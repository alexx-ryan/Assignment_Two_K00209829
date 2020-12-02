<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
    
    <head>
        <LINK REL=STYLESHEET HREF="../assets/css/style.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Employee</title>
    </head>
    
    <body>
        <div id="main_content">
        <h1>New Employee</h1>   
        <hr>             
        <div style="width:100%; margin-left: 83.75%;">
            <shiro:guest>
                <a href="index.jsp">Home</a>
                <a href="login.jsp">Login</a>
                <a href="register.jsp">Register</a>
            </shiro:guest>                
            <shiro:user>
                <a href="../index.jsp">Home</a>
                <a href="../account.jsp">Account</a>
                <a href="../logout">Logout</a>
            </shiro:user>
        </div>
        <hr><br>
        
        
        
        <p>Please enter the details of the new employee below </p>
       
         <form name="newEmployee" action="../NewEmployee" method="get">
            <table border="0" cellspacing="2" cellpadding="2">
                <tbody>
                    <tr>                   
                        <td><label for="Name">Employee ID: </label></td>
                        <td colspan="2"><input type="number" id="employeeID" name="employeeID" /></td>
                        <td> *Please enter value* (Will be overwritten by database) </td>
                    </tr>                                   
                    <tr>
                        <td><label for="Name">Name:</label></td>
                        <td colspan="2"><input type="text" id="name" name="name" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Phone:</label></td>
                        <td colspan="2"> <input type="number" id="phone" name="phone" /></td>
                    </tr>
                     <tr>
                        <td><label for="phone">Email:</label></td>
                        <td colspan="2"> <input type="email" id="email" name="email" /></td>
                    </tr>
                     <tr>
                        <td><label for="phone">Fax:</label></td>
                        <td colspan="2"> <input type="number" id="fax" name="fax" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Add" /></td><td><a href="management.jsp"> Back </a></td> 
                    </tr>
                </tbody>
            </table>           
        </form>
        
        
        
        </div>
    </body>
</html>
