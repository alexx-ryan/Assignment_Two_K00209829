package Classes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class FavouritesDB {

    public static List<Favourites> getFavouritesViaUsername(String username) {

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT f FROM Favourites f WHERE f.username = :username";

        TypedQuery<Favourites> tq = entityManager.createQuery(query, Favourites.class);

        //Add variable to query. 
        tq.setParameter("username", username);

        //List to Store Query Results. 
        List<Favourites> list = null;
               
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

    
   
    public static void InsertFavourite(Favourites newFavourite) {

        //Create Entity Manager. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();
        //Create Transaction with Entity Manager. 
        EntityTransaction myTransaction = entityManager.getTransaction();

        try {
            myTransaction.begin();
            entityManager.persist(newFavourite);
            myTransaction.commit();

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }

    }//End Insert.

    
    
    public static void DeleteFavourite(Favourites DeleteThisFavourite) {

        //Create Entity Manager. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();
        //Create Transaction with Entity Manager. 
        EntityTransaction myTransaction = entityManager.getTransaction();

        try {
            myTransaction.begin();
            entityManager.remove(entityManager.merge(DeleteThisFavourite));
            myTransaction.commit();

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }

    }//End Delete.
    
    
    public static Employees getFavouriteID(Integer ID){
       
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        try {
            Employees a = entityManager.find(Employees.class, ID);
            return a;
        } finally {
            entityManager.close();
        }
     
    }//End Getby.
    
    
    
}
