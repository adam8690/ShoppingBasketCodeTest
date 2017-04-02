import java.util.Objects;

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

    public int applyLoyaltyDiscount(int currentValue) {
        if (customer.hasLoyaltyCard == true) {
            double discountFactor = shoppingBasket.getLoyaltyDiscountFactor();
            int newValue = (int) (currentValue * discountFactor);
            return newValue;
        } else return currentValue;
    }

    public int applyOffers(int currentValue) {

        int totalDiscount = 0;

        for (Item item : shoppingBasket.getBasket().keySet()) {
//            for each item in basket find the ones with bogof offer.
            if (item.getOffers().contains("bogof")) {
                int itemQuantity = shoppingBasket.getItemQuantity(item);
                int bogofCount = itemQuantity / 2 ;
                int itemDiscount = bogofCount * item.getPrice();
                totalDiscount = totalDiscount + itemDiscount;
            }


        }
        return currentValue - totalDiscount;
    }

    public int applyOffersAndDiscountsInCorrectOrder(int valueNoDiscounts){
//this method will apply the discounts in whatever order you want each takes in the total value of the items and returns the updated value.

        int newTotal = applyOffers(valueNoDiscounts);

        newTotal = applyValueDiscount(newTotal);

        newTotal = applyLoyaltyDiscount(newTotal);

        return newTotal;
    }

}
