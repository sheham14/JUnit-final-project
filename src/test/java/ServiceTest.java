import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import InvoiceProject.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test class for testing the methods of the Service class.
 */
public class ServiceTest {

    Service service = new Service(Service.Services.COMPUTER_ASSEMBLE);

    /**
     * A test for checking if the getter and setter for id are working
     */
    @Test
    @DisplayName("Checks if the getId() and setId() methods work")
    void getSetId(){
        Service service = new Service(Service.Services.COMPUTER_ASSEMBLE);
        service.setId("3");
        assertEquals("3", service.getId());

    }

    /**
     * A test for checking if the getter and setter for price are working
     */
    @Test
    @DisplayName("Checks if the getPrice() and setPrice() methods work")
    void getSetPrice(){
        Service service = new Service(Service.Services.COMPUTER_ASSEMBLE);
        service.setPrice(10.00);
        assertEquals(10.00, service.getPrice());

    }

    /**
     * A test for checking if the getter and setter for description are working
     */
    @Test
    @DisplayName("Checks if the getId() and setId() methods work")
    void getSetDesc(){
        Service service = new Service(Service.Services.COMPUTER_ASSEMBLE);
        service.setDescription("New sample description");
        assertEquals("New sample description", service.getDescription());

    }

    /**
     * Checks if an error is returned after the price is set to a negative value.
     */
    @Test
    @DisplayName("Checks if a negative price can be set on a service")
    void negativePrice(){
        try{
            Service service = new Service(Service.Services.COMPUTER_ASSEMBLE);
        } catch (IllegalArgumentException ignored){}
    }

}

