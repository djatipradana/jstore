import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
     public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        isActive=false;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    
    
    public String toString()
    {
       setTotalPrice(0);
       for (int tmp : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(tmp).toString());
       }
        
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
                "\nStatus: " + InvoiceStatus.Paid + 
                "\nSell Success\n";
    }
}
