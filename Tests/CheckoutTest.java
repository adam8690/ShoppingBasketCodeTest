import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by user on 31/03/2017.
 */
public class CheckoutTest {

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Customer customer = new Customer("Adam");
    Checkout checkout = new Checkout( customer, shoppingBasket);

    @Test
    public void testCanGetCustomerName(){
        assertEquals("Adam", checkout.getCustomer().getName());
    }

    @Test
    public void testCanGetShoppingBasket(){
        assertEquals(0, checkout.getShoppingBasket().getBasket().size());
    }


}
