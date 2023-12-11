import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import InvoiceProject.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test class for testing the methods of Address class
 */
public class AddressTest {

    /**
     * A test for the getter and setters for street
     */
    @Test
    @DisplayName("Tests the getter and setter for the street")
    void getSetStreet(){
        Address address = new Address("Old street", "Los Santos", "NL");
        address.setStreet("New Street");
        assertEquals("New Street", address.getStreet());
    }

    /**
     * A test for the getter and setters for city
     */
    @Test
    @DisplayName("Tests the getter and setter for the city")
    void getSetCity(){
        Address address = new Address("Old street", "Los Santos", "NL");
        address.setCity("New City");
        assertEquals("New City", address.getCity());
    }

    /**
     * A test for the getter and setters for province
     */
    @Test
    @DisplayName("Tests the getter and setter for the Province")
    void getSetProvince(){
        Address address = new Address("Old street", "Los Santos", "NL");
        address.setProvince("New Province");
        assertEquals("New Province", address.getProvince());
    }


}
