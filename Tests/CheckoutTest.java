import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by user on 31/03/2017.
 */
public class CheckoutTest {

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Item item = new Item("Champagne", 3000);
    Item item2 = new Item("Beer", 160);
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
        assertEquals(3000, checkout.getShoppingBasket().getValueNoDiscount());
    }

    @Test
    public void testCanApplyValueDiscount(){
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(2700, checkout.applyValueDiscount(shoppingBasket.getValueNoDiscount()));
    }

    @Test
    public void testCanApplyLoyaltyDiscount(){
        shoppingBasket.addToShoppingBasket(item);
        customer.setHasLoyaltyCard(true);
        assertEquals(2940, checkout.applyLoyaltyDiscount(shoppingBasket.getValueNoDiscount()));
    }

    @Test
    public void testCanApplyBogofToTwoItems(){
        item.addBogof();
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(3000, checkout.applyOffers(shoppingBasket.getValueNoDiscount()));
    }

    @Test
    public void testCanApplyBogofToThreeItems(){
        item.addBogof();
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(6000, checkout.applyOffers(shoppingBasket.getValueNoDiscount()));
    }

    @Test
    public void testCanApplyBogofToFourItems(){
        item.addBogof();
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(6000, checkout.applyOffers(shoppingBasket.getValueNoDiscount()));
    }

    @Test
    public void testCanApplyBogofCorrectlyWithMultipleDifferentItemsInBasket(){
        item2.addBogof();
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item2);
        shoppingBasket.addToShoppingBasket(item2);
        assertEquals(6160, checkout.applyOffers(shoppingBasket.getValueNoDiscount()));
    }

}
