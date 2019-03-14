/**
 * Kelas ini memodelkan informasi dari database item yang berisi daftar item 
 * dan data terkait dengan item pada kelas Item
 * Kelas ini memiliki variabel item yang mengacu pada kelas Item
 *
 * @author Djati
 * @version 2019.02.28
 */

public class DatabaseItem{
    private String[] listItem;
    public  static Item itemDB;

    public DatabaseItem(){
    }
    /**
     * Method untuk memastikan ada item baru yang ditambahkan
     * @param item informasi mengenai item itu sendiri yang mengacu pada kelas Item
     * @return nilai true
     */
    public static boolean addItem(Item item){
        itemDB=item;
        return true;
    }
    /**
     * Method untuk memastikan ada item yang dihapus
     * @param item informasi mengenai item itu sendiri yang mengacu pada kelas Item
     * @return nilai false
     */
    public boolean removeItem(Item item){
        return true;
    }
    /**
     * Method untuk mendapatkan item yang mengacu pada kelas Item
     * @return informasi mengenai item itu sendiri 
     */
    public Item getItem(){
        return itemDB;
    }
    /**
     * Method untuk melihat item yang terdapat dalam database item
     * @return daftar item yang terdapat di database item
     */
    public String[] getItemDatabase(){
        return listItem;
    }
}
