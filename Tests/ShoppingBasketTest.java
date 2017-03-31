import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by user on 31/03/2017.
 */
public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Item item = new Item();

    @Test
    public void testShoppingBasketIsEmpty(){

        assertEquals(0, shoppingBasket.getBasket().size());
    }

    @Test
    public void testCanAddItemToList(){
        assertEquals(1, shoppingBasket.add(item));
    }

}
