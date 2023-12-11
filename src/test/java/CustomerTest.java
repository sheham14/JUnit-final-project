import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import InvoiceProject.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test class for the Address class
 */
public class CustomerTest {

    /**
     * A test for the getter and setter for name
     */
    @Test
    @DisplayName("Tests the getter and setter for customer name")
    void getSetName(){
        Address address = new Address("Old street", "Los Santos", "NL");
        Customer customer = new Customer("Bosh", address);
        customer.setName("Dooosh");
        assertEquals("Dooosh", customer.getName());
    }

    /**
     * A test for getter and setter of address
     */
    @Test
    @DisplayName("Tests the getter and setter for customer name")
    void getSetAddress(){
        Address address = new Address("Old street", "Los Santos", "NL");
        Address address2 = new Address("New street", "New Santos", "ON");
        Customer customer = new Customer("Bosh", address);
        customer.setAddress(address2);
        assertEquals(address2, customer.getAddress());
    }
}
