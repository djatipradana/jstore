import java.util.ArrayList;
/**
 * Kelas ini memodelkan informasi dari database item yang berisi daftar item 
 * dan data terkait dengan item pada kelas Item
 * Kelas ini memiliki variabel item yang mengacu pada kelas Item
 *
 * @author Djati
 * @version 2019.02.28
 */

public class DatabaseItem{
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID=0;

    public DatabaseItem()
    {
    
    }
    /**
     * Method untuk memastikan ada item baru yang ditambahkan
     * @param item informasi mengenai item itu sendiri yang mengacu pada kelas Item
     * @return nilai true
     */
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }

    public static boolean addItem(Item item) throws ItemAlreadyExistsException
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(item.getName()==itemDB.getName()&&item.getCategory()==itemDB.getCategory()&&item.getStatus()==itemDB.getStatus()&&item.getSupplier()==itemDB.getSupplier())
            {
                throw new ItemAlreadyExistsException(item);
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID++);
        return true;
    }
    
    public static Item getItemFromID(int id)
    {
       for (Item itemDB : ITEM_DATABASE){
            if (itemDB.getId() == id)
            {
                return itemDB;
            }
       }
       return null;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> itemDB = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getSupplier() == supplier ){
                itemDB.add(item);
            }
        }
        if (itemDB != null){
            return itemDB;
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> itemDB = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getCategory() == category ){
                itemDB.add(item);
            }
        }
        if (itemDB != null){
            return itemDB;
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> itemDB = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getStatus() == status ){
                itemDB.add(item);
            }
        }
        if (itemDB != null){
            return itemDB;
        }
        return null;
    }
    
    public static boolean removeItem(int id)
    {
        for(Item item : ITEM_DATABASE){
            if(item.getId() == id){
                ITEM_DATABASE.remove(item);
                return true;
            }
        }
        return false;
    }
}
