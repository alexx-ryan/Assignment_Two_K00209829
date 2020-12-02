<%@page import="java.util.List"%>
<%@page import="Classes.VehiclesPublic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
    <head><title>All Vehicles</title></head>
    <LINK REL=STYLESHEET HREF="assets/css/style.css" TYPE="text/css">
    <body>
        <div id="main_content">
        <h1>All Vehicles</h1>
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

        <table width='100%' border='1'>
            <tr>
                <td>Listing Number</td>
                <td>Year</td>
                <td>Registration</td>
                <td>Make</td>
                <td>Model</td>
                <td>Color</td>
                <td>Price</td>
                <td>Image</td>
            </tr>
               <c:forEach items="${vehiclelist}" var="aVehicle">
                <tr>
                    <td>${aVehicle.listingNumber}</td>
                    <td>${aVehicle.year}</td>
                    <td>${aVehicle.reg}</td>
                    <td>${aVehicle.make}</td>
                    <td>${aVehicle.model}</td>
                    <td>${aVehicle.colour}</td>
                    <td>${aVehicle.listPrice}</td>                    
                                 
                    <td><form name="viewVehicle" action="ViewVehicle" method="post"> 
                           <input type="image" src="assets/imgs/Stock/Thumbs/<c:url value="${aVehicle.listingNumber}.JPG"/>" name="image" value="No Image"/>                          
                           <input type="hidden" name="searchTerm" value="${aVehicle.listingNumber}">
                       </form>
                    </td>
                                              
                </tr>
            </c:forEach>      
             
        </table>

        </div>
    </body>
</html>
