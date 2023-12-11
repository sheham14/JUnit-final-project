import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import InvoiceProject.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test class for an invoice item
 */
public class InvoiceItemTest {

    Product oldProduct = new Product("Old001", "This is the old product", 50);
    Product newProduct = new Product("New001", "This is the new product", 100);
    InvoiceItem item = new InvoiceItem(oldProduct, 5);

    /**
     * A test for the getter and setter of the item
     */
    @Test
    @DisplayName("Test for the getter and setter of billable item")
    void getSetItem(){

        item.setItem(newProduct);
        assertEquals(newProduct, item.getItem());
    }

    /**
     * A test for the getter and setter for the quantity
     */
    @Test
    @DisplayName("Test for the getter and setter of quantity")
    void getSetQuantity(){

        item.setQuantity(10);
        assertEquals(10, item.getQuantity());
    }

    /**
     * A test for the total price. Price * Quantity
     */
    @Test
    @DisplayName("Test for the total price")
    void checkTotal(){

        assertEquals(250, item.itemTotal());
    }

    /**
     * A test for the total tax. Set at 15%
     */
    @Test
    @DisplayName("Test for the total tax")
    void totalTax(){

        assertEquals(37.5, item.itemTax());
    }
}
