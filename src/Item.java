import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 31/03/2017.
 */
public class Item {

    private String name;
    private int price;
    private int discount;
    private ArrayList<String> offers;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.offers = new ArrayList<String>();
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public ArrayList<String> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<String> offers) {
        this.offers = offers;
    }

    public void addBogof(){
        if (offers.contains("bogof")){
            return;
        }
        else offers.add("bogof");
    }

    public void removeBogof(){
        if (offers.contains("bogof")){
            offers.remove("bogof");
        }
        else return;
    }

}
