/**
 * Kelas ini memodelkan informasi dari database supplier yang berisi 
 * daftar supplier dan data terkait dengan supplier pada kelas Supplier
 * Kelas ini memiliki variabel supplier yang mengacu pada kelas supplier
 *
 * @author Djati
 * @version 2019.02.28
 */
public class DatabaseSupplier{
    private String listSupplier[];
    private Supplier supplier;

    public DatabaseSupplier(){
    }
    /**
     * Method untuk memastikan ada supplier baru yang ditambahkan
     * @param supplier informasi mengenai supplier itu sendiri yang mengacu pada kelas Supplier
     * @return nilai true
     */
    public boolean addSupplier(Supplier supplier){
        return true;
    }
    /**
     * Method untuk memastikan ada supplier yang dihapus
     * @param supplier informasi mengenai supplier itu sendiri yang mengacu pada kelas Supplier
     * @return nilai true
     */
    public boolean removeSupplier(Supplier supplier){
        return true;
    }
    /**
     * Method untuk mendapatkan supplier yang mengacu pada kelas Supplier
     * @return informasi mengenai supplier itu sendiri 
     */
    public Supplier getSupplier(){
        return supplier;
    }
    /**
     * Method untuk melihat supplier yang terdapat dalam database supplier
     * @return daftar supplier yang terdapat di database supplier
     */
    public String[] getListSupplier(){
        return listSupplier;
    }
}