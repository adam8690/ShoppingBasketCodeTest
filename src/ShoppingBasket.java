import java.util.ArrayList;

/**
 * Created by user on 31/03/2017.
 */
public class ShoppingBasket {

    ArrayList<Item> basket;
    int loyaltyDiscount;
    int valueDiscount;

    public ShoppingBasket() {
        basket = new ArrayList<Item>();
        loyaltyDiscount = 2;
        valueDiscount = 10;
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
        return valueDiscount;
    }

    public void setValueDiscout(int valueDiscout) {
        this.valueDiscount = valueDiscout;
    }

    public void addToShoppingBasket(Item item){
        basket.add(item);
    }

    public int value(){
        int totalValue = 0;
        for (Item item : basket){
            totalValue = totalValue + item.getPrice();
        }
        return totalValue;
    }

}
