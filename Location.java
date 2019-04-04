/**
 * Kelas ini memodelkan lokasi suatu tempat secara detail
 *
 * @author Djati
 * @version 2019.02.28
 */
public class Location{

    private String province;
    private String description;
    private String city;

    public Location(String province, String description, String city)
    {
        this.province=province;
        this.city=city;
        this.description=description;
    }
    /**
     * Method untuk mendapatkan provinsi dari suatu lokasi
     * @return provinsi dari suatu lokasi
     */
    public String getProvince()
    {
        return province;
    }
    /**
     * Method untuk mendapatkan deskripsi dari lokasi
     * @return deskripsi dari lokasi
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * Method untuk mendapatkan kota dari suatu lokasi
     * @return kota dari suatu lokasi
     */
    public String getCity()
    {
        return city;
    }
    /**
     * Method untuk mengubah provinsi dari suatu lokasi
     * @param province provinsi dari suatu lokasi
     */
    public void setProvince(String province)
    {
        this.province=province;
    }
    /**
     * Method untuk mengubah deskripsi dari suatu lokasi
     * @param description deskripsi dari suatu lokasi
     */
    public void setDescription(String description)
    {
        this.description=description;
    }
    /**
     * Method untuk mengubah kota dari suatu lokasi
     * @param city kota dari suatu lokasi
     */
    public void setCity(String city)
    {
        this.city=city;
    }
     /**
     * Method untuk mencetak provinsi dari suatu lokasi
     */
    public String toString()
    {
         return "========LOCATION========\nprovinsi:"+province+"\nkota:"+city+"\ndeskripsi:"+description;
    }
}

