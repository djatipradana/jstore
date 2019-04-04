
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    public static void orderNewItem(Item item)
    {
        Invoice invoice1 = new Buy_Paid(1, item, "30/01/2020", 10, item.getPrice());
        if (invoice1 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
        item.printData();
        invoice1.printData();
    }
    
    public static void orderSecondItem(Item item)
    {
        Invoice invoice2 = new Buy_Paid(1, item, "30/02/2020", 5, item.getPrice());
        if (invoice2 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
       
    }
    
    public static void orderRefurbishedItem (Item item)
    {
        Invoice invoice2 = new Buy_Paid(1, item, "30/03/2020", 3, item.getPrice());
        if (invoice2 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
        
    }
    
    public static void sellItemPaid (Item item, Customer customer)
    {
        Invoice invoice3 = new Sell_Paid(1, item, "30/03/2020", 3, item.getPrice());
        item.printData();
        invoice3.printData();
        

    }
    
    public static void sellItemUnpaid (Item item, Customer customer)
    {
        Invoice invoice4 = new Sell_Unpaid(1, item, "30/03/2020", 5, item.getPrice(), "30/06/2020");
        item.printData();
        invoice4.printData();
        
    }
    
    public static void sellItemInstallment (Item item, Customer customer)
    {
        Invoice invoice5 = new Sell_Installment(1, item, "30/03/2020", 5, item.getPrice(), 10);
        item.printData();
        invoice5.printData();
        
    }
}
