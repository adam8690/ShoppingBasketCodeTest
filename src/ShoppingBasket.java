import java.util.ArrayList;

/**
 * Created by user on 31/03/2017.
 */
public class ShoppingBasket {

    ArrayList<Item> basket;
    int loyaltyDiscount;
    int valueDiscout;

    public ShoppingBasket() {
        basket = new ArrayList<Item>();
        loyaltyDiscount = 2;
        valueDiscout = 10;
    }

    public ArrayList<Item> getBasket() {
        return basket;
    }

    public int getLoyaltyDiscount() {
        return loyaltyDiscount;
    }

    public void setLoyaltyDiscount(int loyaltyDiscount) {
        this.loyaltyDiscount = loyaltyDiscount;
    }

    public int getValueDiscout() {
        return valueDiscout;
    }

    public void setValueDiscout(int valueDiscout) {
        this.valueDiscout = valueDiscout;
    }




}
