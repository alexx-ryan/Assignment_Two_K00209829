package Classes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class EmployeesDB {

    public static List<Employees> getAllEmployees() {

        //Entity Manager, Created from Factory. - Corosponding with Persistence Unit. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        //My Query. 
        String query = "SELECT v FROM employees v";

        TypedQuery<Employees> tq = entityManager.createQuery(query, Employees.class);

        //List to Store Query Results. 
        List<Employees> list = null;

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

    
   
    public static String InsertEmployee(Employees newEmployee) {

        //Create Entity Manager. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();
        //Create Transaction with Entity Manager. 
        EntityTransaction myTransaction = entityManager.getTransaction();

        try {
            myTransaction.begin();
            entityManager.persist(newEmployee);
            myTransaction.commit();

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }
        
        String message = "added";
        return message;

    }//End Insert.

    
    
    public static String DeleteEmoloyee(Employees DeleteThisEmployee) {

        //Create Entity Manager. 
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();
        //Create Transaction with Entity Manager. 
        EntityTransaction myTransaction = entityManager.getTransaction();

        try {
            myTransaction.begin();
            entityManager.remove(entityManager.merge(DeleteThisEmployee));
            myTransaction.commit();

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            entityManager.close();
        }

         String message = "deleted";
         return message;
    }//End Delete.
    
    
    public static Employees getEmployeeByID(Integer ID){
       
        EntityManager entityManager = DBUtil.getEMF().createEntityManager();

        try {
            Employees a = entityManager.find(Employees.class, ID);
            return a;
        } finally {
            entityManager.close();
        }
     
    }//End Getby.
    
    
    
}
