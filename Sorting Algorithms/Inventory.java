
public abstract class Inventory 
{
    public String name;
    public int amount;
    public double price;
    public static int num; 
    
    public String toString()
    {
        return(this.name + " " + this.amount + " " + this.price);
    } 
}
