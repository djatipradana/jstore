/**
 * Kelas ini memodelkan informasi dari suatu invoice seperti informasi mengenai
 * invoice itu sendiri dan data terkait item pada kelas Item
 * Kelas ini memiliki variabel item yang mengacu pada kelas Item
 *
 * @author Djati
 * @version 2019.02.28
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice, InvoiceStatus status)
    {
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
        //this.totalItem=totalItem;
        this.status=status;
        // initialise instance variables
      
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
      public Item getItem()
    {
        return item;
    }
    /**
     * Method untuk mendapatkan tanggal invoice
     * @return tanggal invoice
     */
      public String getDate()
    {
        return date;
    }
    /**
     * Method untuk mendapatkan total price dari invoice
     * @return total price dari invoice
     */
     public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public int getTotalItem()
    {
        return totalItem;
    }
    
    public InvoiceStatus getStatus()
    {
        return status;
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
    public void setItem(Item item)
    {
        this.item=item;
    }
    /**
     * Method untuk mengubah tanggal invoice
     * @param date tanggal invoice
     */
    public void setDate(String date)
    {
        this.date=date;
    }
    /**
     * Method untuk mengubah total price dari invoice
     * @param totalPrice total price dari invoice
     */
    public void setTotalPrice (int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
    public void setTotalItem(int totalItem)
    {
        this.totalItem=totalItem;
    }
    
    public void setStatus(InvoiceStatus status)
    {
         this.status=status;
    }
    
    /**
     * Method untuk mencetak total price dari invoice
     */
     public void printData()
    {
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + id);
        System.out.println("Date :" + date);
        System.out.println("Item yang terdapat :" + item.getName());
        System.out.println("Total Item :" + totalItem);
        System.out.println("Total harga :" + totalPrice);
        System.out.println("Status :" + status);
    }
}
