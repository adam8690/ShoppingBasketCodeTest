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

    public int applyLoyaltyDiscount(int currentValue){
        double discountFactor = shoppingBasket.getLoyaltyDiscountFactor();
        int newValue  = (int) (currentValue * discountFactor);
        return newValue;
    }

    public int applyOffers(int currentValue) {

        int totalDiscount = 0;

        for (Item item : shoppingBasket.getBasket().keySet()) {
//            for each item in basket find the ones with bogof offer.
            if (item.getOffers().contains("bogof")) {
//            for each item with a bogof offer find how many of them there are by comparing their names. I should probably use a better unique identifier than name here.
//            this loop will repeat for duplicate items in the shopping list possibly applying the discount twice and doing unnecessary work.
                int timesFound = 0;
                int bogofCount = 0;
                for (Item item2 : shoppingBasket.getBasket().keySet()) {
                    if (Objects.equals(item2, item)) {
                        timesFound = timesFound + 1;
                        if((timesFound % 2) == 0){ bogofCount ++;
                        }
                    }

                }
//                divided price by 2 because my loop finds each item twice so the discount is applied twice.
                totalDiscount = totalDiscount + (item.getPrice() * bogofCount/2);
            }

        }
        return currentValue - totalDiscount;
    }

}
