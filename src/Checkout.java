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
}
