import java.util.*;
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
       Location location1 = new Location("Jawa Barat","Kota Belimbing","Depok");
        try {
            DatabaseSupplier.addSupplier(new Supplier("imelda sanjaya", "imelda.sanjaya@gmail.com", "08576590000", location1));
            DatabaseSupplier.addSupplier(new Supplier("vivian sanjaya", "vivian.sanjaya@gmail.com", "08576592222", location1));
            DatabaseSupplier.addSupplier(new Supplier("valencia sanjaya", "valencia.sanjaya@gmail.com", "08576593333", location1));
            DatabaseSupplier.addSupplier(new Supplier("valencia sanjaya", "valencia.sanjaya@gmail.com", "08576593333", location1));
        } catch (SupplierAlreadyExistsException err){
            System.out.println("==Supplier Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//DEMO
        try {
            DatabaseCustomer.addCustomer(new Customer("Vincent Sanjaya", "vincent.sanjaya@ui.ac.id", "vincent.sanjaya", "gabolehtau", 1998, 12, 06));
            DatabaseCustomer.addCustomer(new Customer("Vincent Sans", "vincent.sanjaya@gmail.com", "vincent.sanjaya", "gabolehtau", 1998, 12, 06));
            DatabaseCustomer.addCustomer(new Customer("Sanjaya Vincent", "sanjaya.vincent@gmail.com", "vincent.sanjaya", "gabolehtau", 1998, 12, 06));
            DatabaseCustomer.addCustomer(new Customer("Vincent Sanjaya", "vincent.sanjaya@ui.ac.id", "vincent.sanjaya", "gabolehtau", 1998, 12, 06));
        }catch (CustomerAlreadyExistsException err){
            System.out.println("===Customer Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

        try {
            DatabaseItem.addItem(new Item("Water Heater", ItemStatus.NEW, 500000, DatabaseSupplier.getSupplier(1), ItemCategory.ELECTRONICS));
            DatabaseItem.addItem(new Item("Water Dispenser",  ItemStatus.NEW, 500000, DatabaseSupplier.getSupplier(1), ItemCategory.ELECTRONICS));
            DatabaseItem.addItem(new Item("Meja",  ItemStatus.NEW, 500000, DatabaseSupplier.getSupplier(2), ItemCategory.FURNITURE));
            DatabaseItem.addItem(new Item("Meja",  ItemStatus.NEW, 500000, DatabaseSupplier.getSupplier(2), ItemCategory.FURNITURE));
        } catch (ItemAlreadyExistsException err){
            System.out.println("===Item Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//item
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(1);
        Transaction.sellItemPaid(itemID, DatabaseCustomer.getCustomer(1));
        Transaction.sellItemPaid(itemID, DatabaseCustomer.getCustomer(1));

        itemID.clear();
        itemID.add(2);
        Transaction.sellItemUnpaid(itemID, DatabaseCustomer.getCustomer(2));
        Transaction.sellItemUnpaid(itemID, DatabaseCustomer.getCustomer(2));

//REMOVE
        try {
            DatabaseItem.removeItem(4);
        } catch (ItemNotFoundException e) {
            System.out.println("===Item Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try{
            DatabaseInvoice.removeInvoice(4);
        } catch (InvoiceNotFoundException e) {
            System.out.println("===Invoice Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try{
            DatabaseCustomer.removeCustomer(4);
        } catch (CustomerNotFoundException e) {
            System.out.println("===Customer Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try {
            DatabaseSupplier.removeSupplier(4);
        }catch (SupplierNotFoundException e) {
            System.out.println("===Supllier Not Found===");
            System.out.println(e.getExMessage());
            System.out.println();
        }

        try {
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(3));
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println("===Don't Have Active===");
            System.out.println(e.getExMessage());
            System.out.println();
        }
        ArrayList<Invoice> tempInv = DatabaseInvoice.getInvoiceDatabase();
        ArrayList<Supplier> tempSup = DatabaseSupplier.getSupplierDatabase();
        ArrayList<Customer> tempCust = DatabaseCustomer.getCustomerDatabase();
        ArrayList<Item> tempItem = DatabaseItem.getItemDatabase();

        System.out.println(tempSup);
        System.out.println(tempCust);
        System.out.println(tempItem);
        System.out.println(tempInv);
        
    }
    
        
        
}