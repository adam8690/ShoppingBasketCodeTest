/**
 * Created by user on 31/03/2017.
 */
public class Customer {

    String name;
    boolean hasLoyaltyCard;

    public Customer(String name) {
        this.name = name;
        this.hasLoyaltyCard = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasLoyaltyCard() {
        return hasLoyaltyCard;
    }

    public void setHasLoyaltyCard(boolean hasLoyaltyCard) {
        this.hasLoyaltyCard = hasLoyaltyCard;
    }
}
