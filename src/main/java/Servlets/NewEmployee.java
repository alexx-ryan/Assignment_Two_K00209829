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
import Classes.EmployeesDB;


@WebServlet(name = "NewEmployee", urlPatterns = {"/NewEmployee"})
public class NewEmployee extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            
            //Standard Servlet components.
            response.setContentType("text/html;charset=UTF-8");
            ServletContext servletContext = this.getServletContext();
            
            String EmployeeID = request.getParameter("employeeID");           
            int EmployeeIDint = Integer.parseInt(EmployeeID);                      
            String EmployeeName = request.getParameter("name");
            String EmployeePhone = request.getParameter("phone");
            String EmployeeEmail = request.getParameter("email");
            String EmployeeFax = request.getParameter("fax");
            

            Employees aNewEmployee = new Employees(EmployeeIDint, EmployeeName, EmployeePhone, EmployeeEmail, EmployeeFax);
                   
            //Insert New Employee Object into Database. 
            EmployeesDB.InsertEmployee(aNewEmployee);
           
            //URL of next page JSP View.
            String nextpage = "index.jsp";
            
            //Request dispatcher sends objects/data to next document. 
            RequestDispatcher dispatcher = request.getRequestDispatcher(nextpage);
            
            //Dispatcher forwards data via the request object. 
            dispatcher.forward(request,response);
            
            
            
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
