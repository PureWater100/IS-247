public class FrozenFood extends Inventory 
{
    
    //subclasses must implement ALL methods in its abstract parent class 

    //default constructor
    public FrozenFood()
    {
        this("French Fries", 100, 15); //draws on following constructor
    }

    public FrozenFood(String name, int amount, double price)
    {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
   
}
