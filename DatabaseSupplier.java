import java.util.*;
/**
 * Kelas ini memodelkan informasi dari database supplier yang berisi 
 * daftar supplier dan data terkait dengan supplier pada kelas Supplier
 * Kelas ini memiliki variabel supplier yang mengacu pada kelas supplier
 *
 * @author Djati
 * @version 2019.02.28
 */

public class DatabaseSupplier{
    
    /**
    * List Array dari Supplier yang dibuat
    */
   
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID=0;
   
    
    /**
    * Method DatabaseSupplier merupakan Constructor dari DatabaseSupplier Class
    * Method ini dapat berisi nilai default dari variabel dalam DatabaseSupplier Class
    */
    public DatabaseSupplier()
    {
    
    }
    
    /**
    * Method ini merupakan method yang menambahkan Supplier baru
    * Kedalam Database Supplier
    * @param supplier Supplier yang ingin dimasukan kedalam database
    * @return nilai boolean apakah pemasukan supplier berhasil atau gagal
    */
    public static ArrayList<Supplier> getSupplierDatabase(){
        return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID(){
        return LAST_SUPPLIER_ID;
    }
    
    public static boolean addSupplier(Supplier supplier)
    {
        for (Supplier supplierDB : SUPPLIER_DATABASE ) {
            if((supplierDB.getName() == supplier.getName()) && (supplierDB.getEmail() == supplier.getEmail()) &&
             (supplierDB.getPhoneNumber() == supplier.getPhoneNumber())){
                return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        return true;
    }
    
    public static Supplier getSupplier(int id)
    {
       for (Supplier supplierDB : SUPPLIER_DATABASE){
            if (supplierDB.getId() == id)
            {
                return supplierDB;
            }
       }
       return null;
    }
    
    public static boolean removeSupplier(int id)
    {
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {      
            if(supplierDB.getId() == id)
            {
                DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(supplierDB));
                SUPPLIER_DATABASE.remove(supplierDB);
                return true;
            }  
        }
        return false;
    }   
}