import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by user on 31/03/2017.
 */
public class CustomerTest {

    Customer customer = new Customer("Adam");

    @Test
    public void testCustomerHasUserName(){
        assertEquals(customer.getName(), "Adam");
    }
}
