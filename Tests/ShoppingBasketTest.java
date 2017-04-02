import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

/**
 * Created by user on 31/03/2017.
 */
public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Item item = new Item("Beans", 200);
    HashMap<Item, Integer> basket = shoppingBasket.getBasket();

    @Test
    public void testShoppingBasketIsEmpty(){
        assertEquals(0, basket.size());
    }

    @Test
    public void testCanAddItemToList(){
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(1, (int) shoppingBasket.getItemQuantity(item));
    }

    @Test
    public void testCanGetValueOfBasket(){
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(200, shoppingBasket.valueNoDiscount());
    }

    @Test
    public void testCanRemoveItemsFromBasket(){
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(1, shoppingBasket.getItemQuantity(item));
        shoppingBasket.removeFromShoppingBasket(item);
        assertEquals(0, shoppingBasket.getItemQuantity(item));
    }

    @Test
    public void testCanClearBasket(){
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.clear();
        assertEquals(0, basket.size());
    }

    @Test
    public void testCanAddMultipleItemsAndQuantityCorrect(){
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        shoppingBasket.addToShoppingBasket(item);
        assertEquals(3, shoppingBasket.getItemQuantity(item));
    }
    

}
