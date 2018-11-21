public class Salad implements MenuItem {
    private String saladName;
    private double price;

    public Salad(String saladName, double price)
    {
        this.saladName = saladName;
        this.price = price;
    }

    public String getName() {
        return this.saladName;
    }
    public double getPrice(){
        return this.price;
    }
}
