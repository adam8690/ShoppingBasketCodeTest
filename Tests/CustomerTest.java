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

    @Test
    public void testHasLoyaltyCardDefaultFalse(){
        assertEquals(false, customer.hasLoyaltyCard());
    }

    @Test
    public void testCanAddLoyaltyCard(){
        customer.setHasLoyaltyCard(true);
        assertEquals(true, customer.hasLoyaltyCard());
    }
}
