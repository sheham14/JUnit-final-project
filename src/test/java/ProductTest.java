import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import InvoiceProject.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test class for testing the methods of the Product class
 */
public class ProductTest {

    /**
     * A test for checking if the getter and setter for id are working
     */
    @Test
    @DisplayName("Checks if the getId() and setId() methods work")
    void getSetId(){
        Product product = new Product("1", "Sample", 5.00);
        product.setId("3");
        assertEquals("3", product.getId());

    }

    /**
     * A test for checking if the getter and setter for price are working
     */
    @Test
    @DisplayName("Checks if the getPrice() and setPrice() methods work")
    void getSetPrice(){
        Product product = new Product("1", "Sample", 5.00);
        product.setPrice(10.00);
        assertEquals(10.00, product.getPrice());

    }

    /**
     * A test for checking if the getter and setter for description are working
     */
    @Test
    @DisplayName("Checks if the getId() and setId() methods work")
    void getSetDesc(){
        Product product = new Product("1", "Sample", 5.00);
        product.setDescription("New sample description");
        assertEquals("New sample description", product.getDescription());

    }

    /**
     * Checks if an error is returned after the price is set to a negative value.
     */
    @Test
    @DisplayName("Checks if a negative price can be set on a product")
    void negativePrice(){
        try{
            Product product = new Product("1", "Sample", -20.00);
        } catch (IllegalArgumentException ignored){}
    }

}
