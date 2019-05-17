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

       Location location1 = new Location("Jawa Barat","Kota Belimbing","Depok");
        try {
            DatabaseSupplier.addSupplier(new Supplier("Tak","tak@gmail.com", "0853243532", location1));
            //DatabaseSupplier.addSupplier(new Supplier("Tik","tik@gmail.com", "0854354351", location1));
            //DatabaseSupplier.addSupplier(new Supplier("Tuk","tuk@gmail.com", "0854353123", location1));
            //DatabaseSupplier.addSupplier(new Supplier("Tak","tak@gmail.com", "0853243532", location1));

        } catch (SupplierAlreadyExistsException err){
            System.out.println("==Supplier Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

//DEMO
        /*try {
            DatabaseCustomer.addCustomer(new Customer("Djati","Djati@gmail.com","djati10","1234", 2019, 9, 10));
        }catch (CustomerAlreadyExistsException err){
            System.out.println("===Customer Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }*/

        try {
            DatabaseItem.addItem(new Item("Djati", 2000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Luthfi", 3000, ItemCategory.Furniture,ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Irsyad", 4000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            //DatabaseItem.addItem(new Item("Gemma", 1000, ItemCategory.Furniture, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException err){
            System.out.println("===Item Already Exists===");
            System.out.println(err.getExMessage());
            System.out.println();
        }

        SpringApplication.run(JStore.class, args);


    }
}