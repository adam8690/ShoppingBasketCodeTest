import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by user on 31/03/2017.
 */
public class ItemTest {

    Item item = new Item("Beans", 200);

    @Test
    public void testCanGetName(){
        assertEquals("Beans", item.getName());
    }

    @Test
    public void testCanGetOffers(){
        item.addBogof();
        assertEquals("bogof", item.getOffers().get(0));
    }
}
