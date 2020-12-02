package Classes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class VehiclesPublicDB {

    public static List<VehiclesPublic> getAllPublicVehicles() {

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM VehiclesPublic v";

        TypedQuery<VehiclesPublic> tq = entityManager.createQuery(query, VehiclesPublic.class);

        //List to Store Query Results. 
        List<VehiclesPublic> list = null;

        try {
            list = tq.getResultList();
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        return list;
    }
    
    public static List<VehiclesPublic> getAllPublicVehiclesViaMake(String make) {

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM VehiclesPublic v WHERE v.make = :make";

        //Use entity manager to create query. 
        TypedQuery<VehiclesPublic> tq = entityManager.createQuery(query, VehiclesPublic.class);

        //Add variable to query. 
        tq.setParameter("make", make);

        //List to Store Query Results. 
        List<VehiclesPublic> list = null;

        try {
            list = tq.getResultList();
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        return list;
    }

    public static List<VehiclesPublic> getAllPublicVehiclesViaModel(String model) {

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM VehiclesPublic v WHERE v.model = :model";

        //Use entity manager to create query. 
        TypedQuery<VehiclesPublic> tq = entityManager.createQuery(query, VehiclesPublic.class);

        //Add variable to query. 
        tq.setParameter("model", model);

        //List to Store Query Results. 
        List<VehiclesPublic> list = null;

        try {
            list = tq.getResultList();
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        return list;
    }

    public static List<VehiclesPublic> getAllPublicVehiclesViaPrice(String price) {

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM VehiclesPublic v WHERE v.price = :price";

        //Use entity manager to create query. 
        TypedQuery<VehiclesPublic> tq = entityManager.createQuery(query, VehiclesPublic.class);

        //Add variable to query. 
        tq.setParameter("price", price);

        //List to Store Query Results. 
        List<VehiclesPublic> list = null;

        try {
            list = tq.getResultList();
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        return list;
    }

    public static List<VehiclesPublic> getAllPublicVehiclesViaYear(String year) {

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM VehiclesPublic v WHERE v.year = :year";

        //Use entity manager to create query. 
        TypedQuery<VehiclesPublic> tq = entityManager.createQuery(query, VehiclesPublic.class);

        //Add variable to query. 
        tq.setParameter("year", year);

        //List to Store Query Results. 
        List<VehiclesPublic> list = null;

        try {
            list = tq.getResultList();
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        return list;
    }
  
    public static List<VehiclesPublic> getAllPublicVehiclesViaColour(String Colour){

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM VehiclesPublic v WHERE v.colour = :colour";

        //Use entity manager to create query. 
        TypedQuery<VehiclesPublic> tq = entityManager.createQuery(query, VehiclesPublic.class);

        //Add variable to query. 
        tq.setParameter("colour", Colour);

        //List to Store Query Results. 
        List<VehiclesPublic> list = null;

        try {
            list = tq.getResultList();
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        return list;
    }
    
    public static List<VehiclesPublic> getAllPublicVehiclesViaListingNumber(String ListingNumber){

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM VehiclesPublic v WHERE v.listingNumber = :listingNumber";

        //Use entity manager to create query. 
        TypedQuery<VehiclesPublic> tq = entityManager.createQuery(query, VehiclesPublic.class);

        //Add variable to query. 
        tq.setParameter("listingNumber", ListingNumber);

        //List to Store Query Results. 
        List<VehiclesPublic> list = null;

        try {
            list = tq.getResultList();
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        return list;
    }
     
    public static VehiclesPublic getPublicVehicleViaListingNumber(String ListingNumber){

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM VehiclesPublic v WHERE v.listingNumber = :listingNumber";

        //Use entity manager to create query. 
        TypedQuery<VehiclesPublic> tq = entityManager.createQuery(query, VehiclesPublic.class);

        //Add variable to query. 
        tq.setParameter("listingNumber", ListingNumber);

        //List to Store Query Results. 
        VehiclesPublic result = null;

        try {
            result = tq.getSingleResult();
           
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        return result;
    }
    
    public static String DeleteVehicle(VehiclesPublic DeleteThisVehicle) {

        //Create Entity Manager. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();
        //Create Transaction with Entity Manager. 
        EntityTransaction myTransaction = entityManager.getTransaction();

        try {
            myTransaction.begin();
            entityManager.remove(entityManager.merge(DeleteThisVehicle));
            myTransaction.commit();

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        
        String message = "deleted";
        return message;

    }//End Delete.       
            
    public static String InsertVehicle(VehiclesPublic newVehicle) {

        //Create Entity Manager. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();
        //Create Transaction with Entity Manager. 
        EntityTransaction myTransaction = entityManager.getTransaction();

        try {
            myTransaction.begin();
            entityManager.persist(newVehicle);
            myTransaction.commit();

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        
        String message = "added";
        return message;

    }//End Insert.       
            
       
    public static VehiclesPublic getVehicleByID(int vehicleID) {
        EntityManager em = DBUtil.getEMF().createEntityManager();

        VehiclesPublic vehicle = null;
        try {
            vehicle = em.find(VehiclesPublic.class, vehicleID);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }

        return vehicle;
    }

}
