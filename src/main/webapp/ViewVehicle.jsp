<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>    
    <head>
        <LINK REL=STYLESHEET HREF="assets/css/vehicleView.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Vehicle</title>
    </head>

    <body>
        <div id="main_content">
            
            
            <h1>Vehicle Information</h1>
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
            <hr>

                
            <div id="VehicleImages">
                <img src="assets/imgs/Stock/Large/<c:url value="${searchResults.listingNumber}"/>/<c:url value="${searchResults.listingNumber}.JPG"/>" width="180" height="200"  value="No Image Found."> 
                <img src="assets/imgs/Stock/Large/<c:url value="${searchResults.listingNumber}"/>/<c:url value="${searchResults.listingNumber}-1.JPG"/>" width="180" height="200" value="No Image Found."> 
                <img src="assets/imgs/Stock/Large/<c:url value="${searchResults.listingNumber}"/>/<c:url value="${searchResults.listingNumber}-2.JPG"/>" width="180" height="200" value="No Image Found."> 
                <img src="assets/imgs/Stock/Large/<c:url value="${searchResults.listingNumber}"/>/<c:url value="${searchResults.listingNumber}-3.JPG"/>" width="180" height="200" value="No Image Found."> 
                <img src="assets/imgs/Stock/Large/<c:url value="${searchResults.listingNumber}"/>/<c:url value="${searchResults.listingNumber}-4.JPG"/>" width="180" height="200" value="No Image Found.">       
            </div>

             
            
            <div id="VehicleDetails">
                <b>Listing Number: </b>          ${searchResults.listingNumber}<br><br>
                <b>Year: </b>                    ${searchResults.year}<br><br>
                <b>Registration: </b>            ${searchResults.reg}<br><br>
                <b>Make: </b>                    ${searchResults.make}<br><br>
                <b>Colour: </b>                  ${searchResults.colour}<br><br>
                <b>Price :  € </b>               ${searchResults.listPrice}<br><br>
                <b>Odometer: KPH </b>            ${searchResults.odometerKPH } <br> <br>         
                <b>0-60: </b>                    ${searchResults.column062kph }<br><br>
                <b>Engine Size: </b>             ${searchResults.engine }<br><br>
                <b>Fuel: </b>                    ${searchResults.fuel }<br><br>
                <b>Transmission: </b>            ${searchResults.transmission }<br><br>
                <b>Body: </b>                    ${searchResults.body }<br><br>
                <b>IsoFix: </b>                  ${searchResults.isofix }<br><br>
                <b>Motor Tax:  € </b>            ${searchResults.motorTax }<br><br>
                <b>Full Service History: </b>    ${searchResults.fullServiceHistory }<br><br>
                <b>Previous Owners: </b>         ${searchResults.previousOwners }<br><br>
            </div>

            
            <div id="VehicleDescription">
                <b>Description: </b>             ${searchResults.description}<br><br>
            </div>

            
            <div id="VehicleContact">
                <b>Sales Person: </b>           ${searchResults.salesPerson }<br><br>
                <b>Sales Person Number:</b>     ${searchResults.salesPersonPhone }<br><br>
                <b>Sales Person Email:</b>      ${searchResults.salesPersonEmail }<br><br>
                <b>Sales Person Fax:</b>        ${searchResults.salesPersonFax }<br>
            </div>
            
            
            <a class="twitter-share-button" href="https://twitter.com/intent/tweet?text=MoylishMotors.ie%20Listing:%20${searchResults.listingNumber}%20is%20a%20a%20great%20car!">  
                <img src="assets/imgs/Site/tweet.png" width="120px" heigh="120px"/>
            </a>

        </div
    </body>

</html>
