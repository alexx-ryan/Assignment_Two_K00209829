package Servlets;

import Classes.Employees;
import Classes.EmployeesDB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexander
 */
public class NewEmployeeTest {
    
    public NewEmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testNewEmployee() {
        
        int x = 20;
        Employees testEmployee = new Employees(x);
        EmployeesDB testEmployeeDB = new EmployeesDB();          
       
        String result = testEmployeeDB.InsertEmployee(testEmployee);      
        assertEquals("Test has failed.", "added", result);
    }
    
}
