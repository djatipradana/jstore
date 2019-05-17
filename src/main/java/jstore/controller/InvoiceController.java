package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class InvoiceController {

    @RequestMapping(value = "/invoicecustomer/{id_customer}", method = RequestMethod.GET)
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer) {
        ArrayList<Invoice> invoice = null;
        try {
            invoice = DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(id_customer));
        	return invoice;
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/invoice/{id_invoice}", method = RequestMethod.GET)
    public Invoice getInvoice(@PathVariable int id_invoice) {
        Invoice invoice = DatabaseInvoice.getInvoice(id_invoice);
        return invoice;
    }

    @RequestMapping(value = "/createinvoicepaid", method = RequestMethod.POST)
    public Invoice createInvoicePaid(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                     @RequestParam(value="customerID") int customerID
    ){
        try {
            /*//int i = 0;
            int size = listItem.size();

            ArrayList<Integer> item = new ArrayList<Integer>();
            for (int i=0;i<=size;i++) {
                int id = DatabaseItem.getItemFromID(i+1).getId();
                if(listItem.get(i) == id) {
                    item.add(id);
                }
            }*/
            boolean tmp = DatabaseInvoice.addInvoice(new Sell_Paid(listItem, DatabaseCustomer.getCustomer(customerID)));
        	if (tmp == true) {
        		return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
        	}
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createinvoiceunpaid", method = RequestMethod.POST)
    public Invoice createInvoiceUnpaid(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                       @RequestParam(value="customerID") int customerID
    )
    {
        try {
            boolean tmp = DatabaseInvoice.addInvoice(new Sell_Unpaid(listItem, DatabaseCustomer.getCustomer(customerID)));
        	if (tmp == true) {
        		return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());	
        	}
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        return null;
    }

    @RequestMapping(value = "/createinvoiceinstallment", method = RequestMethod.POST)
    public Invoice createInvoiceInstallment(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                            @RequestParam(value="customerID") int customerID,
                                            @RequestParam(value="installmentPeriod") int installmentPeriod
    )
    {
        try {
            boolean tmp = DatabaseInvoice.addInvoice(new Sell_Installment(listItem, installmentPeriod,DatabaseCustomer.getCustomer(customerID)));
        	if (tmp == true) {
        		return DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
      
        	}
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
          return null;
    }

    @RequestMapping(value = "/canceltransaction", method = RequestMethod.POST)
    public Invoice cancelTransaction(@RequestParam(value="invoiceID") int invoiceID)
    {
        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(invoiceID));
        return DatabaseInvoice.getInvoice(invoiceID);
    }

    @RequestMapping(value = "/finishtransaction", method = RequestMethod.POST)
    public Invoice finishTransaction(@RequestParam(value="invoiceID") int invoiceID)
    {
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(invoiceID));
        return DatabaseInvoice.getInvoice(invoiceID);
    }
}