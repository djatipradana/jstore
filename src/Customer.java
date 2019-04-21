import java.util.*;
import java.text.SimpleDateFormat;
import java.util.regex.*;

/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name,String email,String username,String password,Calendar birthDate)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=DatabaseCustomer.getLastCustomerID()+1;
        this.birthDate=birthDate;
        this.birthDate.add(Calendar.MONTH,-1);
    }
    
    public Customer(String name,String email,String username,String password,int year,int month,int dayOfMonth)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=DatabaseCustomer.getLastCustomerID()+1;
        this.birthDate=new GregorianCalendar(year,month-1,dayOfMonth);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getId()
    {
        return id;
    }
    
    public Calendar getbirthDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println("Birth date: "+sdf.format(birthDate.getTime()));
        return birthDate;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setEmail(String email)
    {
        String pattern =  "^([a-zA-Z0-9(&*_~)]+([.])?)+[a-zA-Z0-9(&*_~)]+@([a-zA-Z0-9]+[-]?[a-zA-Z0-9]+)+([.]([a-zA-Z0-9]+))+$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("Email : " + m.group());
            this.email = email;
        } else {
            System.out.println("Email : null");
            this.email = email;
        }
    }
    
    public void setUsername(String username)
    {
        this.username=username;
    }
    
    public void setPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z_0-9]{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find()){
            System.out.println("Password: " + m.group());
            this.password = password;
        }else{
            System.out.println("Password: NULL");
            this.password = "NULL";
        }
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate=birthDate;
    }
    
    public void setBirthDate(int year,int month,int dayOfMonth)
    {
        this.birthDate=new GregorianCalendar(year,month-1,dayOfMonth);
    }
    
    public String toString()
    {
        return "\nId: "+id+
                ", Nama: "+name+
                ", Username: "+username+
                ", Email: "+email+
                ", Password: "+password;
        /*
        return "===Customer==="+
        "\nId: "+id+
        "\nNama: "+name+
        "\nUsername: "+username+
        "\nEmail: "+email+
        "\nPassword: "+password;
         */

    }
}
