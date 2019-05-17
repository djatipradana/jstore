package jstore;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        super.setIsActive(false);
        super.setTotalPrice(0);
    }
   
    public Customer getCustomer(){
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public String toString()
    {
       setTotalPrice(0);
       /*for (int tmp : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(tmp).toString());
       }*/
       SimpleDateFormat sdf = new SimpleDateFormat ("dd MM yyyy");

       return "\n========INVOICE========" + 
              "\nID: " +  getId() + 
              //"\nItem: " + getItem().getName() +
              //"\nAmount: "  + getTotalItem() +
              "\nBuy date: " + sdf.format(getDate().getTime()) +
              //"\nPrice: " + getItem().getPrice() +
               "\nTotal price: " + getTotalPrice() +
              //"\nSupplier ID: " + getItem().getSupplier().getId() +
              //"\nSupplier name: " + getItem().getSupplier().getName() +
              "\nCustomer ID: " + customer.getId() +
              "\nCustomer Name: " + customer.getName() +
              "\nStatus: " + InvoiceStatus.Paid + 
              "\nSell Success\n";
    }
}
