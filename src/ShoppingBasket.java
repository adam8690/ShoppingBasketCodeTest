import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 31/03/2017.
 */
public class ShoppingBasket {

    private HashMap<Item, Integer> basket;
    private double loyaltyDiscountFactor;
    private double valueDiscountFactor;

    public ShoppingBasket() {
        basket = new HashMap<>();
        loyaltyDiscountFactor = 0.98;
        valueDiscountFactor = 0.90;
    }

    public HashMap<Item, Integer> getBasket() {
        return basket;
    }

    public double getLoyaltyDiscountFactor() {
        return loyaltyDiscountFactor;
    }

    public void setLoyaltyDiscountFactor(int loyaltyDiscountFactor) {
        this.loyaltyDiscountFactor = loyaltyDiscountFactor;
    }

    public double getValueDiscount() {
        return valueDiscountFactor;
    }

    public void setValueDiscout(int valueDiscout) {
        this.valueDiscountFactor = valueDiscout;
    }

    public void addToShoppingBasket(Item item) {
//        if item exists in basket increment quan
        if (basket.get(item) != null) {
            int quantity = basket.get(item);
            basket.put(item, (quantity + 1));
        }
        basket.put(item, 1);
    }

    public int valueNoDiscount(){
        int totalValue = 0;
        for (Item item : basket.keySet()){
            totalValue = totalValue + item.getPrice();
        }
        return totalValue;
    }

    public void clear(){
        basket.clear();
    }

}
