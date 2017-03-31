import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by user on 31/03/2017.
 */
public class CheckoutTest {

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Item item = new Item("Champagne", 3000);
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

    @Test
    public void testCanGetValueWithNoDiscounts(){
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(3000, checkout.getShoppingBasket().valueNoDiscount());
    }

    @Test
    public void testCanApplyValueDiscount(){
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(2700, checkout.applyValueDiscount(shoppingBasket.valueNoDiscount()));
    }

    @Test
    public void testCanApplyLoyaltyDiscount(){
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(2940, checkout.applyLoyaltyDiscount(shoppingBasket.valueNoDiscount()));
    }

}
