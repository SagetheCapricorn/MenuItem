public class Sandwich implements MenuItem {
    private String sandwichName;
    private double price;

    public Sandwich(String sandwichName, int price)
    {
        this.sandwichName = sandwichName;
        this.price = price;
    }
    public String getName(){
        return this.sandwichName;
    }

    public double getPrice() {
        return this.price;
    }
}
