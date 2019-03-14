
/**
 * Write a description of class JStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JStore
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JStore
     */
    
    public JStore()
    {
        // initialise instance variables
    }

    
    public static void main(String[] args)
    {
        Location location1 = new Location("Depok", "Jawa Barat", "Kota Belimbing");
        Supplier supplier1 = new Supplier(1, "Samsung", "djatipradana@gmail.com", "012345", location1);
        location1.printData();
        supplier1.printData();
        Transaction.orderNewItem(supplier1);
        Transaction.orderSecondItem(supplier1);
        Transaction.orderRefurbishedItem(supplier1);
        Transaction.sellItemPaid(DatabaseItem.itemDB);
        Transaction.sellItemUnpaid(DatabaseItem.itemDB);
        Transaction.sellItemInstallment(DatabaseItem.itemDB);
        
        
    }
  
   
        
   
}
