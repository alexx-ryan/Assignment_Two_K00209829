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
import Classes.VehiclesPublic;
import Classes.VehiclesPublicDB;


@WebServlet(name = "SearchViaMake", urlPatterns = {"/SearchViaMake"})
public class SearchViaMake extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            
            //Standard Servlet components.
            response.setContentType("text/html;charset=UTF-8");
            ServletContext servletContext = this.getServletContext();

            String Make = request.getParameter("searchTerm");
            
            
            //Make a List of Vehicles from the Database. 
            List<VehiclesPublic> SearchResults = VehiclesPublicDB.getAllPublicVehiclesViaMake(Make);
            
            
            
            //URL of next page JSP View.
            String nextpage = "/SearchForVehicles.jsp";
            
            
            
            //Set an attribute of my vehicle list. To the Request Object.
            request.setAttribute("searchResults", SearchResults);

            
            
            //Request dispatcher sends objects/data to next document. 
            RequestDispatcher dispatcher = request.getRequestDispatcher(nextpage);
            
            
            
            //Dispatcher forwards data via the request object. 
            dispatcher.forward(request,response);
            
            
        } catch (Exception error) {

            
        }
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
