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


@WebServlet(name = "DeleteEmployee", urlPatterns = {"/DeleteEmployee"})
public class DeleteEmployee extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            //Standard Servlet components.
            response.setContentType("text/html;charset=UTF-8");
            ServletContext servletContext = this.getServletContext();

            //Get Employee namne from request. 
            String EmployeeID = request.getParameter("employeeID");
            int EmployeeIDint = Integer.parseInt(EmployeeID);

            //Get the employee details using the employeeName. 
            Employees DeleteThisEmployee = EmployeesDB.getEmployeeByID(EmployeeIDint);

            //Call Delete Method on this employee.
            EmployeesDB.DeleteEmoloyee(DeleteThisEmployee);

            //URL of next page JSP View.
            String nextpage = "index.jsp";

            //Request dispatcher sends objects/data to next document. 
            RequestDispatcher dispatcher = request.getRequestDispatcher(nextpage);

            //Dispatcher forwards data via the request object. 
            dispatcher.forward(request, response);

        } catch (Exception error) {

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
