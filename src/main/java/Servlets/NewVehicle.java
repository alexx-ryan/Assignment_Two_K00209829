package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Classes.Employees;
import Classes.VehiclesPublicDB;
import Classes.VehiclesPublic;


@WebServlet(name = "NewVehicle", urlPatterns = {"/NewVehicle"})
public class NewVehicle extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
         try {
            
            //Standard Servlet components.
            response.setContentType("text/html;charset=UTF-8");
            ServletContext servletContext = this.getServletContext();

            String id = request.getParameter("vehicleid");  
            int idint = Integer.parseInt(id);
            
            String listingnumber = request.getParameter("listingnumber");
            String year = request.getParameter("year");
            String reg = request.getParameter("reg");
            String make = request.getParameter("make");
            String model = request.getParameter("model");
            String colour = request.getParameter("colour");
            
            String listprice = request.getParameter("listprice");
            int listPriceint = Integer.parseInt(listprice);
            
            String odometer = request.getParameter("odometer");
            int odometerInt = Integer.parseInt(odometer);
            
            String zerotosixty = request.getParameter("tosixty");
            String Engine = request.getParameter("engine");
            String Fuel = request.getParameter("fuel");
            String transmission = request.getParameter("transmission");
            String body = request.getParameter("body");
            String isofix = request.getParameter("isofix");
            String motortax = request.getParameter("motortax");
            String fullserviceHistory = request.getParameter("fullservicehistory");
            
            String previousOwners = request.getParameter("previousowners");
            int previousOwnersInt = Integer.parseInt(previousOwners);
            
            String Description = request.getParameter("description");
            String SalesPerson = request.getParameter("salesperson");
            String SalesPersonPhone = request.getParameter("salespersonphone");
            String SalesPersonEmail = request.getParameter("salespersonemail");
            String SalesPersonFax = request.getParameter("salespersonfax");
         
            
            VehiclesPublic newVehicle = new VehiclesPublic(idint, listingnumber, year, reg, make, model, colour, listPriceint, odometerInt, zerotosixty, Engine, Fuel, transmission, body, isofix, motortax, fullserviceHistory, previousOwnersInt, Description, SalesPerson, SalesPersonPhone, SalesPersonEmail, SalesPersonFax);
                    
            
            VehiclesPublicDB.InsertVehicle(newVehicle);
                
            //URL of next page JSP View.
            String nextpage = "index.jsp";
            
            //Request dispatcher sends objects/data to next document. 
            RequestDispatcher dispatcher = request.getRequestDispatcher(nextpage);
            
            //Dispatcher forwards data via the request object. 
            dispatcher.forward(request,response);
            
            
            
        } catch (Exception error) {

        }
        
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
