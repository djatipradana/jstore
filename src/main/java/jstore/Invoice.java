package jstore;
import java.util.Calendar;
import java.util.ArrayList;

/**
 * Kelas ini memodelkan informasi dari suatu invoice seperti informasi mengenai
 * invoice itu sendiri dan data terkait item pada kelas Item
 * Kelas ini memiliki variabel item yang mengacu pada kelas Item
 *
 * @author Djati
 * @version 2019.02.28
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    //private Item item;
    private Calendar date;
    protected int totalPrice;
    //private int totalItem;
    private boolean isActive;
    private Customer customer;
    private ArrayList<Integer> item = new ArrayList<Integer>();
   
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.id=DatabaseInvoice.getLastInvoiceID()+1;
        this.date = Calendar.getInstance();
        this.item = item;
      
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    public boolean getIsActive()
    {
        return isActive;
    }
    /**
     * Method untuk mendapatkan id invoice
     * @return id invoice
     */
     public int getId()
    {
        return id;
    }
    /**
     * Method untuk mendapatkan item pada invoice
     * @return informasi mengenai item pada invoice
     */
      public ArrayList<Integer> getItem()
    {
        return item;
    }
    /**
     * Method untuk mendapatkan tanggal invoice
     * @return tanggal invoice
     */
      public Calendar getDate()
    {
        return date;
    }
    /**
     * Method untuk mendapatkan total price dari invoice
     * @return total price dari invoice
     */
     public int getTotalPrice()
    {
        return this.totalPrice;
    }

    public abstract InvoiceStatus getInvoiceStatus();
    public abstract InvoiceType getInvoiceType();
    
    public void setIsActive(boolean isActive)
    {
        this.isActive=isActive;   
    }
    /**
     * Method untuk mengubah id invoice
     * @param id id invoice
     */
     public void setId(int id)
    {
        this.id=id;
        
    }
    /**
     * Method untuk mengubah item pada invoice
     * @param item item pada invoice
     */
    public void setItem(ArrayList<Integer> item)
    {
        this.item=item;
    }
    /**
     * Method untuk mengubah tanggal invoice
     * @param date tanggal invoice
     */
    public void setDate(Calendar date)
    {
        this.date=date;
    }
    /**
     * Method untuk mengubah total price dari invoice
     * @param totalPrice total price dari invoice
     */
    public void setTotalPrice (int totalPrice)
    {
        for(Integer invoice : item)
        {
            this.totalPrice=this.totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
        }
    }
   
    public void setInvoiceStatus(InvoiceStatus status)
    {
      //   
    }
    
    /**
     * Method untuk mencetak total price dari invoice
     */
     public abstract String toString();
    
}
