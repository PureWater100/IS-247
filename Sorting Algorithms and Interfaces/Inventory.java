
public class Inventory implements Comparable<Inventory>
{
    public String name; //item name
    public int price; //item price
    public int quantity; //number of items in stock 

    @Override
    public int compareTo(Inventory o)
    {
        return this.name.compareTo(o.name);
    }

    // Alternative method, works too.
    // @Override 
    // public int compareTo(Inventory o)
    // {
    //     if (name.compareTo(o.name) < 0) //negative, aka name comes before o.name
    //         return -1;
    //     else if (name.compareTo(o.name) > 0) //positive, aka name comes after o.name
    //         return 1;
    //     else
    //         return 0;
    // }

    @Override
    public String toString()
    {
        return (this.name + " " + this.price + "$ " + this.quantity + " units;");
    }

    public Inventory() //default constructor, draws on following constructor
    {
        this("Spinach", 5, 200);
    }

    public Inventory(String name, int price, int quantity) //constructor
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    } 
}
