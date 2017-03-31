import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by user on 31/03/2017.
 */
public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Item item = new Item("Beans", 200);
    ArrayList<Item> basket = shoppingBasket.getBasket();

    @Test
    public void testShoppingBasketIsEmpty(){
        assertEquals(0, basket.size());
    }

    @Test
    public void testCanAddItemToList(){
        basket.add(item);
        assertEquals(1, basket.size());
    }

    @Test
    public void testCanGetValueOfBasket(){
        basket.add(item);
        assertEquals(200, shoppingBasket.value());
    }

    @Test
    public void testCanRemoveItemsFromBasket(){
        basket.add(item);
        assertEquals(1, basket.size());
        basket.remove(item);
        assertEquals(0, basket.size());
    }

    @Test
    public void testCanClearBasket(){
        basket.add(item);
        shoppingBasket.clear();
        assertEquals(0, basket.size());
    }



}
