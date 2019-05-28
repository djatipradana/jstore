package jstore;
import java.lang.*;
import java.io.*;

public class InvoiceAlreadyExistsException extends Exception {
    private Invoice invoice_error;

    public InvoiceAlreadyExistsException(Invoice invoice_input){
        super("Invoice ID :");
        invoice_error=invoice_input;
    }

    public String getExMessage(){
        return super.getMessage() + invoice_error.getItem() + " already ordered by "  + invoice_error.getCustomer().getUsername();
    }
}
