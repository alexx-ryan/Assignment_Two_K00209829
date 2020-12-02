package Classes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
     
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Vehicles_PU");
     
    public static EntityManagerFactory getEMF() { 
        return EMF; 
    }
}