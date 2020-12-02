/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DeleteEmployeeTest {
    
    public DeleteEmployeeTest() {
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
    public void testDeleteEmployee() {
        
        int x = 4;
        Employees testEmployee = new Employees(x);
        EmployeesDB testEmployeeDB = new EmployeesDB();          
       
        String result = testEmployeeDB.DeleteEmoloyee(testEmployee);      
        assertEquals("Test has failed.", "deleted", result);
    }
   
}
