/**
 * Created by user on 31/03/2017.
 */
public class Checkout {

    Customer customer;
    ShoppingBasket shoppingBasket;

    public Checkout(Customer customer, ShoppingBasket shoppingBasket) {
        this.customer = customer;
        this.shoppingBasket = shoppingBasket;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShoppingBasket getShoppingBasket() {
        return shoppingBasket;
    }

    public int applyValueDiscount(int currentValue) {
        double discountFactor = shoppingBasket.getValueDiscount();
        int newValue =  (int) ( currentValue * discountFactor );
        return newValue;
    }

    public int applyLoyaltyDiscount(int currentValue){
        double discountFactor = shoppingBasket.getLoyaltyDiscountFactor();
        int newValue  = (int) (currentValue * discountFactor);
        return newValue;
    }

}
