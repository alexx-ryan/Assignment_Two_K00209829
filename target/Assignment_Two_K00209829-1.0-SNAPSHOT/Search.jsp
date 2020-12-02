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
            <h1>Search Vehicles</h1>
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

            
            <p> Please enter a search term and select a search criteria.</p>            
            <form>               
                Search:
                <input type="text" id="searchTerm" name="searchTerm"/>              
                Search Via:                 
                <button type="submit" formaction="SearchViaListingNumber">Listing Number</button>   
                <button type="submit" formaction="SearchViaMake">Make</button>
                <button type="submit" formaction="SearchViaModel">Model</button>
                <button type="submit" formaction="SearchViaYear">Year</button>
                <button type="submit" formaction="SearchViaPrice">Price</button>                                                       
                <button type="submit" formaction="SearchViaColour">Colour</button>   
                
                
            </form>
            
            
        </div>
    </body>
</html>
