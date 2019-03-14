
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
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
        
        // initialise instance variables

    }
    
    /**
     * Method untuk mendapatkan id supplier
     * @return id supplier
     */
    public int getId()
    {
        return id;
    }
    /**
     * Method untuk mendapatkan nama supplier
     * @return nama supplier
     */
    public String getName()
    {
        return name;
    }
    /**
     * Method untuk mendapatkan email supplier
     * @return email supplier
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * Method untuk mendapatkan phone number supplier
     * @return phone number supplier
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * Method untuk mendapatkan lokasi supplier yang mengacu pada kelas Location
     * @return lokasi supplier
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Method untuk mengubah id supplier
     * @param id id supplier
     */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
     * Method untuk mengubah nama supplier
     * @param name nama supplier
     */
    public void setName(String name)
    {
        this.name=name;
    }
    /**
     * Method untuk mengubah phone number supplier
     * @param phoneNumber phone number supplier
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    /**
     * Method untuk mengubah lokasi supplier
     * @param location lokasi supplier
     */
    public void setLocation(Location location)
    {
        this.location=location;
    }
    /**
     * Method untuk mencetak nama supplier
     */
    public void printData()
    {
        System.out.println("==========SUPPLIER=======");
        System.out.println("ID :" + id);
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("No telpon :" + phoneNumber);
        System.out.println("Lokasi Supplier :" + location.getCity());
    }
}
