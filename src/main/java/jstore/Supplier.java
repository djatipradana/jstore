package jstore;
/**
 * Kelas ini memodelkan identitas dari supplier berupa informasi mengenai 
 * supplier tu sendiri dan data terkait lokasi pada kelas Location
 * Kelas ini memiliki variabel location yang mengacu pada kelas Location
 *
 * @author Djati
 * @version 2019.02.28
 */
public class Supplier
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /**
     * Konstruktor dari kelas Supplier
     * @param id Sebagai ID dari supplier
     * @param name Sebagai nama dari supplier
     * @param email Sebagai email dari supplier
     * @param phoneNumber Sebagai nomor telepon supplier
     * @param location Sebagai lokasi dari supplier
     */
    public Supplier(String name, String email, String phoneNumber, Location location)
    {
       this.id=DatabaseSupplier.getLastSupplierID()+1;
       this.name=name;
       this.email=email;
       this.phoneNumber=phoneNumber;
       this.location=location;
    }
    
    /**
     * Metode ini akan menampilkan Id dari supplier yang di set oleh konstruktor atau mutator
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Metode ini akan menampilkan nama dari supplier yang di set oleh konstruktor atau mutator
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Metode ini akan menampilkan email dari supplier yang di set oleh konstruktor atau mutator
     * @return email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Metode ini akan menampilkan nomor telepon dari supplier yang di set oleh konstruktor atau mutator
     * @return phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Metode ini akan menampilkan lokasi dari supplier yang di set oleh konstruktor atau mutator
     * @return phoneNumber
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Metode ini akan meminta Id yang akan ditampilkan di aksesor
     * @param id Id dari supplier yang ingin di-set
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Metode ini akan meminta nama yang akan ditampilkan di aksesor
     * @param name Nama dari supplier yang ingin di-set
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * Metode ini akan meminta email supplier yang akan ditampilkan di aksesor
     * @param email Email dari supplier yang ingin di-set
     */
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    /**
     * Metode ini akan meminta no. HP supplier yang akan ditampilkan di aksesor
     * @param phoneNumber Nomor HP dari supplier yang ingin di-set
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
    /**
     * Metode ini akan meminta lokasi supplier yang akan ditampilkan di aksesor
     * @param location Location dari supplier yang ingin di-set
     */
    public void setLocation(Location location)
    {
        this.location=location;
    }
    
    /**
     * Metode ini dijalankan untuk mencetak nama dari supplier pada layar
     */

    public String toString()
    {
        return "\nId: " + id+
                "Name: " + name+
                "Email: " + email+
                "Phone Number: " + phoneNumber+
                "Location: "+location.getCity()+", "+location.getProvince();
        /*
        return "===SUPPLIER==="+
        "\nId: " + id+
        "\nName: " + name+
        "\nEmail: " + email+
        "\nPhone Number: " + phoneNumber+
        "\nLocation: "+location.getCity()+", "+location.getProvince();
        */
    }

}
