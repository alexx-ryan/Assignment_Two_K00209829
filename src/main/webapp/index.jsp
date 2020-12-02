<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>

<html>
    <head>
        <LINK REL=STYLESHEET HREF="assets/css/indexView.css" TYPE="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Moylish Motors</title>
    </head>
    <body>
        <div id="main_content">
            <h1>Welcome to Moylish Motors!</h1>
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
                    
                    
                    
                    <shiro:hasRole name="customer"> <a href="favourites">Favourites</a>
                    
                    
                    
                    </shiro:hasRole>
                    
                </shiro:user>                            
            </div>
            <hr>

            <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
                Nulla at volutpat diam ut. Erat nam at lectus urna duis convallis convallis. Nibh cras pulvinar mattis nunc sed blandit. 
                Dignissim cras tincidunt lobortis feugiat vivamus. Vitae nunc sed velit dignissim sodales ut. Sed sed risus pretium quam. 
                Velit laoreet id donec ultrices tincidunt arcu non. Ornare lectus sit amet est placerat in egestas erat imperdiet. 
                Ut pharetra sit amet aliquam id diam maecenas ultricies. Ut tellus elementum sagittis vitae et.               
                Porta nibh venenatis cras sed felis eget velit aliquet sagittis<p>

            <div id="IndexMenu"> 
            <form name="viewall" action="ViewAllVehicles"><input type="submit" value="View All Vehicles" name="vav" class="indexButtons"/></form>            
            <form name="search"  action="Search.jsp"><input type="submit" value="Search For Vehicles" name="sfv" class="indexButtons"/></form>           
            <form name="contact" action="ContactUs.jsp"><input type="submit" value="Contact Us" name="cntct" class="indexButtons"/></form>
            </div>
            
            <div style="width: 80%" id="indexMap">
                <iframe scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com/maps?width=320&amp;height=200&amp;hl=en&amp;q=V94%20EC5T+(Moylish%20Motors)&amp;t=&amp;z=14&amp;ie=UTF8&amp;iwloc=B&amp;output=embed" width="400" height="400" frameborder="0">
            </iframe></div>


        </div
    </body>
</html>
