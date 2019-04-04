/**
 * Kelas ini memodelkan informasi dari item secara detail seperti informasi 
 * mengenai item itu sendiri dan data terkait dengan supplier pada kelas Supplier
 * Kelas ini memiliki variabel supplier yang mengacu pada kelas Supplier
 *
 * @author Djati
 * @version 2019.02.28
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    /**
     * Constructor for objects of class Item
     */
    public Item(int id, String name, int stock, int price,ItemCategory category, ItemStatus status, Supplier supplier)
    {
       this.id=id;
       this.name=name;
       this.stock=stock;
       this.price=price;
       this.category=category;
       this.status=status;
       this.supplier=supplier;
        // initialise instance variables
    }
    
    
    
     /**
     * Method untuk mendapatkan id item
     * @return id item
     */
    public int getId()
    {
        return id;
    }
    /**
     * Method untuk mendapatkan nama item
     * @return nama item
     */
    public String getName()
    {
        return name;
    }
    /**
     * Method untuk mendapatkan jumlah stok item
     * @return jumlah stok item
     */
    public int getStock()
    {
        return stock;
    }
    /**
     * Method untuk mendapatkan harga item
     * @return harga item
     */
    public int getPrice()
    {
        return price;
    }
    /**
     * Method untuk mendapatkan kategori dari item
     * @return kategori dari item
     */
     public ItemCategory getCategory()
     {
        return category;
    }
    
     public ItemStatus getStatus()
     {
        return status;
    }
    /**
     * Method untuk mendapatkan supplier dari suatu item
     * @return supplier dari suatu item
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    /**
     * Method untuk mengubah id item
     * @param id id item
     */
    public void setId(int id)
    {
       this.id=id;
    }
    /**
     * Method untuk mengubah nama item
     * @param name nama item
     */
    public void setName(String name)
    {
        this.name=name;
    }
    /**
     * Method untuk jumlah stok dari suatu item
     * @param stock jumlah stok dari suatu item
     */
    public void setStock(int stock)
    {
         this.stock=stock;
    }
    /**
     * Method untuk mengubah harga item
     * @param price harga item
     */
    public void setPrice(int price)
    {
         this.price=price;
    }
    /**
     * Method untuk mengubah kategori dari suatu item
     * @param category kategori dari suatu item
     */
     public void setCategory(ItemCategory category)
    {
        this.category=category;
    }
    
     public void setStatus(ItemStatus status)
    {
        this.status=status;
    }
 
    /**
     * Method untuk mengubah supplier dari suatu item
     * @param supplier supplier dari suatu item
     */
     public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    /**
     * Method untuk mencetak nama dari suatu item     
     */
    public String toString()
    {
         return "======ITEM=======\nId: "+id+"\nName: "+name+"\nStock: "+stock+"\nCategory: "+category+"\nStatus: "+status+"\nSupplier: "+supplier.getName();
    }
}
