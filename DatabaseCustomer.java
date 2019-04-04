/**
 * Write a description of class DatabaseCostumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private Customer[] listCustomer;
    public static Customer customer;
      
    public DatabaseCustomer()
    {
        
    }
    
     /**
     * method ini digunakan untuk menambah costumer kedalam database
     *
     * @return boolean true
     */
    
    public static boolean addCustomer(Customer customer)
    {
        return true;
    }
       /**
     * method ini digunakan untuk menghapus costumer kedalam database
     *
     * @return boolean true
     */
   
    //untuk menambahkan item ke class Item
    
    //untuk menghapus item dari class Item

    public boolean removeCustomer(Customer customer)
    {
        return true;
    }
     /**
     * Method yang digunakan untuk mereturn nilai costumer
     * 
     * @return objek costumer
     */
    
    public static Customer getCustomer(){
     return customer;
    }
    /**
     * Method yang digunakan untuk mereturn nilai dari database costumer
     * 
     * @return list costumer
     */
    public Customer[] getListCustomer(){
     return listCustomer;
    }
    
    
}