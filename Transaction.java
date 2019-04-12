import java.util.ArrayList;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
     public static void orderNewItem(Item item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }

    public static void orderSecondItem(Item item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }

    public static void orderRefurbishedItem(Item item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }

    public static void sellItemPaid(Item item, Customer customer){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Paid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
    }

    public static void sellItemUnpaid(Item item, Customer customer){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Unpaid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
    }

    public static void sellItemInstallment(Item item, Customer customer, int installmentPeriod){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Installment(itemID,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public boolean finishTransaction(Invoice invoice)
    {
        Invoice invoiceDB = DatabaseInvoice.getInvoice(invoice.getId());
        if (invoiceDB != null){
            invoice.setIsActive(false);
            System.out.println("Invoice isActive: " + invoice.getIsActive());
            return true;            
        }
        else{
            return false;
        }
    }
    
    public boolean cancelTransaction(Invoice invoice)
    {
        Invoice invoiceDB = DatabaseInvoice.getInvoice(invoice.getId());
        if (invoiceDB != null){
            DatabaseInvoice.removeInvoice(invoiceDB.getId());
            return true;            
        }
        else{
            return false;
        }     
    }
}
