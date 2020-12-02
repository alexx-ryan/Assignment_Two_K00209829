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
       
         <form name="newEmployee" action="../NewVehicle" method="get">
            <table border="0" cellspacing="2" cellpadding="2">
                <tbody>
                    
                    <tr>                   
                        <td><label for="Name">Vehicle ID: </label></td>
                        <td colspan="2"><input type="number" name="vehicleid" /></td>
                        <td> *Please enter value* (Will be overwritten by database) </td>
                    </tr>                                   
                    <tr>
                        <td><label for="Name">Listing Number:</label></td>
                        <td colspan="2"><input type="text"  name="listingnumber" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Year:</label></td>
                        <td colspan="2"> <input type="text"  name="year" /></td>
                    </tr>
                     <tr>
                        <td><label for="phone">Reg:</label></td>
                        <td colspan="2"> <input type="text"  name="reg" /></td>
                    </tr>
                     <tr>
                        <td><label for="phone">Make:</label></td>
                        <td colspan="2"> <input type="text"  name="make" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Model:</label></td>
                        <td colspan="2"> <input type="text"  name="model" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Colour:</label></td>
                        <td colspan="2"> <input type="text"  name="colour" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">List Price:</label></td>
                        <td colspan="2"> <input type="number" name="listprice" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Odometer:</label></td>
                        <td colspan="2"> <input type="number" name="odometer" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">0 - 60:</label></td>
                        <td colspan="2"> <input type="text" name="tosixty" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Engine:</label></td>
                        <td colspan="2"> <input type="text" name="engine" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Fuel:</label></td>
                        <td colspan="2"> <input type="text" name="fuel" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Transmission:</label></td>
                        <td colspan="2"> <input type="text" name="transmission" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Body:</label></td>
                        <td colspan="2"> <input type="text" name="body" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">IsoFix:</label></td>
                        <td colspan="2"> <input type="text" name="isofix" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Motor Tax:</label></td>
                        <td colspan="2"> <input type="text" name="motortax" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Full Service History:</label></td>
                        <td colspan="2"> <input type="text" name="fullservicehistory" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Previous Owners:</label></td>
                        <td colspan="2"> <input type="number" name="previousowners" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Description:</label></td>
                        <td colspan="2"> <input type="text"  name="description" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Sales Person:</label></td>
                        <td colspan="2"> <input type="text"  name="salesperson" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Sales Person Phone:</label></td>
                        <td colspan="2"> <input type="text"  name="salespersonphone" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Sales Person Email</label></td>
                        <td colspan="2"> <input type="text" name="salespersonemail" /></td>
                    </tr>
                    <tr>
                        <td><label for="phone">Sales Person Fax</label></td>
                        <td colspan="2"> <input type="text"  name="salepersonfax" /></td>
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
