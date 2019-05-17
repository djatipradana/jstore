package jstore;

import java.util.*;

/**
 * Merupakan Class DatabaseInvoice.
 *
 * @author Djati
 * @version 28/02/2019
 */
public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID=0;
    
    public DatabaseInvoice()
    {
    
    }
    
    /**
     * Method of class DatabaseInvoice
     * @return true
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;

    }

    public static int getLastInvoiceID(){
        return LAST_INVOICE_ID;
    }

    public static boolean addInvoice(Invoice invoice)
            throws InvoiceAlreadyExistsException
    {
        for(Invoice invoiceDB : INVOICE_DATABASE)
        {
            if(invoiceDB.getItem().equals(invoice.getItem()))
            {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }
    
    public static Invoice getInvoice(int id)
    {
       for (Invoice invoiceDB : INVOICE_DATABASE){
            if (invoiceDB.getId() == id)
            {
                return invoiceDB;
            }
       }
       return null;
    }
    
    public static ArrayList<Invoice> getActiveOrder(Customer customer)
            throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> tmp = new ArrayList<Invoice>();
        for(Invoice invoiceDB : INVOICE_DATABASE)
        {
        if((invoiceDB.getInvoiceStatus()==InvoiceStatus.Unpaid||invoiceDB.getInvoiceStatus()==InvoiceStatus.Installment) && invoiceDB.getCustomer() == customer)
            {
                tmp.add(invoiceDB);
                
            }  
        }
        if (tmp != null)
        {
           return tmp; 
        }
        else 
        {
            throw new CustomerDoesntHaveActiveException(customer);
            //return null;
        }
    }
    
    public static boolean removeInvoice(int id)
            throws InvoiceNotFoundException
    {
        for(Invoice invoiceDB : INVOICE_DATABASE){
            if(invoiceDB.getId() == id && invoiceDB.getIsActive() == true){
                invoiceDB.setIsActive(false);
                INVOICE_DATABASE.remove(invoiceDB);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
        //return false;
    }
}