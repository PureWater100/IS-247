public class Deli extends Inventory {
    public Deli()
    {
        this("Sausage", 10, 5); //draws on following constructor
    }

    public Deli(String name, int amount, double price)
    {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    
}
