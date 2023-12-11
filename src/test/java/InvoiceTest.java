import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import InvoiceProject.*;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A class for testing the various invoice classes and methods.
 */
public class InvoiceTest {
    Address address = new Address("Old street", "Los Santos", "NL");
    Customer customer = new Customer("Bosh", address);
    Product oldProduct = new Product("Old001", "This is the old product", 50);
    Product newProduct = new Product("New001", "This is the new product", 100);
    InvoiceItem item1 = new InvoiceItem(oldProduct, 5);
    InvoiceItem item2 = new InvoiceItem(newProduct, 10);

    LocalDate duedate = LocalDate.now().plusWeeks(1);
    ArrayList<InvoiceItem> list = new ArrayList<InvoiceItem>();

    void createList(){
        list.add(item1);
        list.add(item2);
    }
    Invoice invoice = new Invoice(list, 1, customer, duedate);

    @Test
    @DisplayName("Tests the getter for the item list")
    void getList(){
        createList();
        assertEquals(2, invoice.getItemList().size());
    }

    @Test
    @DisplayName("Tests the getter for the customer")
    void getCustomer(){
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    @DisplayName("Tests the getter and setter for the invoice number")
    void getSetInvoiceNum(){
        invoice.setInvoiceNum(5);
        assertEquals(5, invoice.getInvoiceNum());
    }

    @Test
    @DisplayName("Tests the getter and setter for the due date")
    void getSetDueDate(){
        invoice.setDueDate(duedate.plusWeeks(2));
        assertEquals(LocalDate.now().plusWeeks(3), invoice.getDueDate());
    }

    @Test
    @DisplayName("Tests the method for calculating invoice total")
    void checkTotal(){
        createList();
        assertEquals(1250, invoice.getInvoiceTotal());
    }

    @Test
    @DisplayName("Tests the method for calculating invoice total tax")
    void checkTax(){
        createList();
        assertEquals(187.5, invoice.getInvoiceTax());
    }

}
