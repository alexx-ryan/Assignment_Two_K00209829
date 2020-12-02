/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Classes.Employees;
import Classes.EmployeesDB;
import Classes.VehiclesPublic;
import Classes.VehiclesPublicDB;
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
public class DeleteVehicleTest {
    
    public DeleteVehicleTest() {
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
    public void testDeleteVehicle() {
        
        int x = 4294200;
        
        VehiclesPublic testVehicle = new VehiclesPublic(x);
        VehiclesPublicDB testVehiclesPublicDB = new VehiclesPublicDB();
        
        Employees testEmployee = new Employees(x);
        EmployeesDB testEmployeeDB = new EmployeesDB();          
       
        String result = testVehiclesPublicDB.DeleteVehicle(testVehicle);      
        assertEquals("Test has failed.", "deleted", result);
    }
   
}
