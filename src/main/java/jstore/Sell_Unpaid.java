package jstore;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;

    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        super.setIsActive(true);
        super.setTotalPrice(0);
        this.dueDate=(Calendar)getDate().clone();
        dueDate.add(Calendar.DATE, +14);
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public Calendar getDueDate(){
        return dueDate;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;
    }
    
    // public void setInvoiceStatus(InvoiceStatus status)
    // {
        
    // }
    
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
              "\nStatus: " + InvoiceStatus.Unpaid + 
              "\nSell Success\n";
	}
}
