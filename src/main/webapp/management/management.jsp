<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK REL=STYLESHEET HREF="../assets/css/style.css" TYPE="text/css">

        <title>Management</title>
    </head>
    <body>
        <div id="main_content">
            <h1>Management Dashboard</h1>
            <hr>             
            <div style="width:100%; margin-left: 83.75%;">
                
                <shiro:guest>
                    <a href="index.jsp">Home</a>
                    <a href="login.jsp">Login</a>
                    <a href="register.jsp">Register</a>
                </shiro:guest>                
                <shiro:user>
                    <a href="../index.jsp">Home</a>
                    <a href="account.jsp">Account</a>
                    <a href="logout">Logout</a>
                </shiro:user>
                             
            </div>
            <hr><br>


            Hello <shiro:principal/>
            <br><br>

            Welcome to the moylish motors management dashboard. 
            Please select an operation below. 
            <br><br>           
            <table border="0" cellspacing="2" cellpadding="2">
                <tbody>
                    <tr>
                        <td> <form name="NewEmployee"    action="NewEmployee.jsp">    <input type="submit" value="New Employee"    name="newEmp" class="Block"/></form></td>
                    </tr>
                    <tr>
                        <td> <form name="RemoveEmployee" action="DeleteEmployee.jsp">  <input type="submit" value="Remove Employee" name="RemEmp"  class="Block"/></form></td>
                    </tr>
                    <tr>
                        <td><form name="NewVehicle"     action="NewVehicle.jsp">        <input type="submit" value="New Vehicle"     name="newVeh"  class="Block"/></form></td>
                    </tr>
                    <tr>
                        <td> <form name="RemoveVehicle"  action="DeleteVehicle.jsp">     <input type="submit" value="Remove Vehicle" name="RemVeh"  class="Block"/></form></td>
                    </tr>                                    
                </tbody>
            </table>
            
         
        </div>  
    </body>
</html>
