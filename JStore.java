
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
        Location location1 = new Location("Jawa Barat", "Kota Belimbing", "Depok");
        Supplier supplier1 = new Supplier(1, "Djati", "djatipradana@gmail.com", "085724003192", location1);
        Item item1 = new Item(4, "Komputer", 5, 10000000, ItemCategory.Electronics, ItemStatus.New, supplier1);
   
        Transaction.orderNewItem(item1);
        //Transaction.orderSecondItem(item1);
        //Transaction.orderRefurbishedItem(item1);
        Transaction.sellItemPaid(item1);
        Transaction.sellItemUnpaid(item1);
        Transaction.sellItemInstallment(item1);
        
        
    }
  
   
        
   
}
