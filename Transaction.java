
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    public static void orderNewItem (Supplier supplier)
    {
        ItemCategory category1 = ItemCategory.Electronics;
        Item barang1 = new Item(2, "Handphone", 10, 1000000, category1, ItemStatus.New, supplier);
        DatabaseItem.addItem(barang1);
        Invoice pesan1 = new Invoice(3, barang1, "14 Maret 2019", barang1.getPrice(), InvoiceStatus.Paid);
        barang1.setStatus(ItemStatus.New);
        pesan1.setStatus(InvoiceStatus.Paid);
        barang1.printData();
        pesan1.printData();
    }
    
    public static void orderSecondItem (Supplier supplier)
    {
        ItemCategory category2 = ItemCategory.Electronics;
        Item barang2 = new Item(4, "Televisi", 5, 5000000, category2, ItemStatus.Second, supplier);
        DatabaseItem.addItem(barang2);
        Invoice pesan2 = new Invoice(5, barang2, "14 Maret 2019", barang2.getPrice(), InvoiceStatus.Paid);
        barang2.setStatus(ItemStatus.Second);
        pesan2.setStatus(InvoiceStatus.Paid);
        barang2.printData();
        pesan2.printData();
    }
    
    public static void orderRefurbishedItem (Supplier supplier)
    {
        ItemCategory category3 = ItemCategory.Electronics;
        Item barang3 = new Item(4, "Televisi", 5, 5000000, category3, ItemStatus.Refurbished, supplier);
        DatabaseItem.addItem(barang3);
        Invoice pesan3 = new Invoice(5, barang3, "14 Maret 2019", barang3.getPrice(), InvoiceStatus.Paid);
        barang3.setStatus(ItemStatus.Refurbished);
        pesan3.setStatus(InvoiceStatus.Paid);
        barang3.printData();
        pesan3.printData();
    }
    
    public static void sellItemPaid (Item item)
    {
        Invoice pesan4 = new Invoice(6, item, "14 Maret 2019", item.getPrice(), InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        pesan4.setStatus(InvoiceStatus.Paid);
        pesan4.printData();

    }
    
    public static void sellItemUnpaid (Item item)
    {
        Invoice pesan5 = new Invoice(7, item, "14 Maret 2019", item.getPrice(), InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        pesan5.setStatus(InvoiceStatus.Unpaid);
        pesan5.printData();
    }
    
    public static void sellItemInstallment (Item item)
    {
        Invoice pesan6 = new Invoice(8, item, "14 Maret 2019", item.getPrice(), InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        pesan6.setStatus(InvoiceStatus.Installment);
        pesan6.printData();
    }
}
