package jstore;
import java.util.ArrayList;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    public static void orderNewItem (ArrayList<Integer> item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void orderSecondItem (ArrayList<Integer> item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void orderRefurbishedItem (ArrayList<Integer> item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void sellItemPaid (ArrayList<Integer> item, Customer customer)
    {
        Invoice invoice=new Sell_Paid(item,customer);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void sellItemUnpaid (ArrayList<Integer> item, Customer customer)
    {
        Invoice invoice=new Sell_Unpaid(item,customer);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }

    public static void sellItemInstallment (ArrayList<Integer> item, Customer customer, int installmentPeriod)
    {
        Invoice invoice=new Sell_Installment(item,installmentPeriod,customer);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }catch (InvoiceAlreadyExistsException err){
            System.out.println(err.getExMessage());
        }
    }


    public static boolean finishTransaction (Invoice invoice){
        Invoice invoiceDB = DatabaseInvoice.getInvoice(invoice.getId());
        if ( (invoiceDB.getInvoiceStatus() == InvoiceStatus.Unpaid) || (invoiceDB.getInvoiceStatus() == InvoiceStatus.Installment)){
            invoice.setIsActive(false);
            System.out.println("Invoice isActive: " + invoice.getIsActive());
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean cancelTransaction (Invoice invoice){
        Invoice bon = DatabaseInvoice.getInvoice(invoice.getId());
        if ( (bon.getInvoiceStatus() == InvoiceStatus.Unpaid) || (bon.getInvoiceStatus() == InvoiceStatus.Installment)){
            try {
                DatabaseInvoice.removeInvoice(bon.getId());
                return true;
            }catch (InvoiceNotFoundException err){
                return false;
            }

        }
        else{
            return false;
        }
    }
}
