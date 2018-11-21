public class Trio implements MenuItem {
    private Sandwich sand;
    private Salad sal;
    private Drink drin;
    private double price;
    private String oirT;

    public Trio(Sandwich sand, Salad sal, Drink drin)
    {
        this.sand = sand;
        this.sal = sal;
        this.drin = drin;
    }
    public String getName(){
        return (this.sand.getName()+this.sal.getName()+this.drin.getName());
    }
    public double getPrice(){
        return (this.price)
    }
}
