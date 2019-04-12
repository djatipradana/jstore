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

    public static boolean addInvoice(Invoice invoice){
        INVOICE_DATABASE.add(invoice);
        //LAST_INVOICE_ID=invoice.getId();
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
    
    public static Invoice getActiveOrder(Customer customer)
    {
        for(Invoice invoiceDB : INVOICE_DATABASE)
        {
        if((invoiceDB.getInvoiceStatus()==InvoiceStatus.Unpaid||invoiceDB.getInvoiceStatus()==InvoiceStatus.Installment)&&invoiceDB.getIsActive()==true)
            {
                return invoiceDB;
            }  
        }
        return null;
    }
    
    public static boolean removeInvoice(int id)
    {
        for(Invoice invoiceDB : INVOICE_DATABASE){
            if(invoiceDB.getId() == id && invoiceDB.getIsActive() == true){
                invoiceDB.setIsActive(false);
                INVOICE_DATABASE.remove(invoiceDB);
                return true;
            }
        }
        return false;
    }
}