package jstore;
import java.util.ArrayList;
/**
 * Write a description of class DatabaseCostumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();;
    private static int LAST_CUSTOMER_ID=0;
      
    public DatabaseCustomer()
    {
        
    }
    
     /**
     * method ini digunakan untuk menambah costumer kedalam database
     *
     * @return boolean true
     */
    
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer customer)
            throws CustomerAlreadyExistsException
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName()==customerDB.getName()||customer.getEmail()==customerDB.getEmail())
            {
                throw new CustomerAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID++;
        return true;
    }
    
    public static Customer getCustomer(int id)
    {
        for (Customer customerDB : CUSTOMER_DATABASE){
            if (customerDB.getId() == id ){
                return customerDB;
            }
        }
        return null;
    }
    
    public static boolean removeCustomer(int id)
            throws CustomerNotFoundException
    {
        for (Customer customerDB : CUSTOMER_DATABASE){
            if (customerDB.getId() == id ){
                CUSTOMER_DATABASE.remove(customerDB);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
        //return false;
    }

    public static Customer getCustomerLogin(String email, String
            password) {
        for (Customer customerDB : CUSTOMER_DATABASE){
            if (customerDB.getEmail() == email && customerDB.getPassword() == password  ){
                return customerDB;
            }
        }
        return null;

    }
    
}