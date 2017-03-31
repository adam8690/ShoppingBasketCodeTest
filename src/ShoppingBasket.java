import java.util.ArrayList;

/**
 * Created by user on 31/03/2017.
 */
public class ShoppingBasket {

    private ArrayList<Item> basket;
    private double loyaltyDiscountFactor;
    private double valueDiscountFactor;
    private boolean hasLoyaltyCard;

    public ShoppingBasket(boolean hasLoyaltyCard) {
        basket = new ArrayList<Item>();
        loyaltyDiscountFactor = 0.98;
        valueDiscountFactor = 0.90;
        hasLoyaltyCard = hasLoyaltyCard;
    }

    public boolean hasLoyaltyCard() {
        return hasLoyaltyCard;
    }

    public void setHasLoyaltyCard(boolean hasLoyaltyCard) {
        this.hasLoyaltyCard = hasLoyaltyCard;
    }

    public ArrayList<Item> getBasket() {
        return basket;
    }

    public double getLoyaltyDiscountFactor() {
        return loyaltyDiscountFactor;
    }

    public void setLoyaltyDiscountFactor(int loyaltyDiscountFactor) {
        this.loyaltyDiscountFactor = loyaltyDiscountFactor;
    }

    public double getValueDiscout() {
        return valueDiscountFactor;
    }

    public void setValueDiscout(int valueDiscout) {
        this.valueDiscountFactor = valueDiscout;
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

    public void clear(){
        basket.clear();
    }

}
