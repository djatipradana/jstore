package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="username") String username,
                            @RequestParam(value="password") String password,
                            @RequestParam(value = "year", defaultValue = "1999" ) int year
                            )
    {

        try {
            Customer customer = new Customer(name, email, username, password, year, 10, 10);
            for(Customer cust:DatabaseCustomerPostgre.getCustomerDatabase()){
                if(cust.getEmail().equals(email) && cust.getPassword().equals(password)){
                    return null;
                }
                else {
                    DatabaseCustomerPostgre.insertCustomer(customer);
                    return customer;
                }
            }
            //DatabaseCustomer.addCustomer(customer);
        } catch(Exception ex) {
            ex.getMessage();
            //return null;
        }
        return null;
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        //Customer customer = DatabaseCustomer.getCustomer(id);
        Customer customer = DatabaseCustomerPostgre.getCustomer(id);
        return customer;
    }

    @RequestMapping(value="/logincust", method=RequestMethod.POST)
    public Customer loginCust (@RequestParam(value="email") String email,
                               @RequestParam(value="password") String password
    )
    {
        try {
            //Customer cust = DatabaseCustomer.getCustomerLogin(email, password);
            for(Customer cust:DatabaseCustomerPostgre.getCustomerDatabase()){
                if(cust.getEmail().equals(email)&&cust.getPassword().equals(password)){
                    return cust;
                }
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    /*    Customer customerReply = DatabaseCustomer.getCustomerLogin(email, password);
        return customerReply;    */
    }

}