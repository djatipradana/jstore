package jstore;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Write a description of class JStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JStore {
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JStore
     */

    public JStore() {
        // initialise instance variables
    }


    public static void main(String[] args)
    {
        SpringApplication.run(JStore.class, args);

       Location location1 = new Location("Jawa Barat","Kota Belimbing","Depok");
        try {
            DatabaseSupplier.addSupplier(new Supplier("Tak","tak@gmail.com", "0853243532", location1));
            DatabaseSupplier.addSupplier(new Supplier("Tik","tik@gmail.com", "0854354351", location1));
            DatabaseSupplier.addSupplier(new Supplier("Tuk","tuk@gmail.com", "0854353123", location1));
            //DatabaseSupplier.addSupplier(new Supplier("Tak","tak@gmail.com", "0853243532", location1));

        } catch (SupplierAlreadyExistsException err){
            System.out.println("==Supplier Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//DEMO
        /*try {
            DatabaseCustomer.addCustomer(new Customer("Djati","Djati@gmail.com","djati10","1234", 2019, 9, 10));
            DatabaseCustomer.addCustomer(new Customer("Luthfi","Luthfi@gmail.com","upi10","5678", 2019, 8, 7));
            DatabaseCustomer.addCustomer(new Customer("Irsyad","Irsyad@gmail.com","icad10","9908", 2019, 3, 3));
            DatabaseCustomer.addCustomer(new Customer("Djati","Djati@gmail.com","djati10","1234", 2019, 9, 10));
        }catch (CustomerAlreadyExistsException err){
            System.out.println("===Customer Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }*/

        try {
            DatabaseItem.addItem(new Item("Djati", 2000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Luthfi", 3000, ItemCategory.Furniture,ItemStatus.New, DatabaseSupplier.getSupplier(2)));
            DatabaseItem.addItem(new Item("Irsyad", 4000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
            DatabaseItem.addItem(new Item("Gemma", 1000, ItemCategory.Furniture, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException err){
            System.out.println("===Item Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//item
      /*ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(1);
        item.add(2);

        ArrayList<Integer> item1 = new ArrayList<Integer>();
        item1.add(2);
        item1.add(3);

        //ArrayList<Integer> item2 = new ArrayList<Integer>();
        //item2.add(1);
        //item2.add(3);

        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
            //DatabaseInvoice.addInvoice(new Sell_Installment(item2, 10, DatabaseCustomer.getCustomer(2)));
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item1, DatabaseCustomer.getCustomer(3)));
            DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
        } catch (InvoiceAlreadyExistsException err){
            System.out.println("===Invoice Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

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
        ArrayList<Invoice> InvDB = DatabaseInvoice.getInvoiceDatabase();
        ArrayList<Supplier> SupDB = DatabaseSupplier.getSupplierDatabase();
        ArrayList<Customer> CustDB = DatabaseCustomer.getCustomerDatabase();
        ArrayList<Item> ItemmDB = DatabaseItem.getItemDatabase();

        System.out.println("====Supplier====\n" + SupDB);
        System.out.println("====Customer====\n" + CustDB);
        System.out.println("====Item====\n" + ItemmDB);
        System.out.println(InvDB);
     */
    }
}