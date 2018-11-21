public class Drink implements MenuItem {
    private String drinkName;
    private double price;

    public Drink(String drinkName, double prioe)
    {
        this.drinkName = drinkName;
        this.price = price;
    }

    public String getName() {
        return this.drinkName;
    }
    public double getPrice(){
        return this.price;
    }
}
