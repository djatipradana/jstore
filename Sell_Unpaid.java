import java.util.Calendar;
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

    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.customer=customer;
         this.dueDate = Calendar.getInstance();
        this.dueDate.add(Calendar.DATE, +1);
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public Customer getCustomer()
    {
        return customer;    
    }
    
    public Calendar getDueDate()
    {
        return dueDate;    
    }
    
    public void  setCustomer(Customer customer)
    {
        this.customer=customer;    
    }
    
    public void  setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;    
    }
    
    public String toString()
    {
         return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "Status: "
                + this.INVOICE_STATUS + "Due date: " + this.dueDate
                + "If payment is not received by due date, transcation will be canceled";
    }
}
