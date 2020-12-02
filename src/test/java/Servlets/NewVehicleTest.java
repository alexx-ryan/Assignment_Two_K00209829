
package Servlets;

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
public class NewVehicleTest {
    
    public NewVehicleTest() {
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
        
        String result = testVehiclesPublicDB.InsertVehicle(testVehicle);      
        assertEquals("Test has failed.", "added", result);
    }
}
