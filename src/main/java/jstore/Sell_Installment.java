package jstore;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
     public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        this.isActive=true;
    }
    
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setInstallmentPrice()
    {
      
    }
    
    public void setTotalPrice()
    {
      
    }
        
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    
    public String toString() {
       setTotalPrice(0);
       for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }
        
       SimpleDateFormat sdf = new SimpleDateFormat ("dd MM yyyy");
       return  "\n========INVOICE========" + 
               "\nID: " +  getId() + 
               //"\nItem: " + getItem().getName() +
               //"\nAmount: "  + getTotalItem() +
               "\nBuy date: " + sdf.format(getDate().getTime()) +
               //"\nPrice: " + getItem().getPrice() +
               "\nTotal price: " + getTotalPrice() +
               "\nInstallment price: " + installmentPrice +
               //"\nSupplier ID: " + getItem().getSupplier().getId() +
               //"\nSupplier name: " + getItem().getSupplier().getName() +
               "\nCustomer ID: " + customer.getId() +
               "\nCustomer Name: " + customer.getName() +
               "\nStatus: " + InvoiceStatus.Installment + 
               "\nInstallment period: " + installmentPeriod +
               "\nSell Success\n";
    }
}