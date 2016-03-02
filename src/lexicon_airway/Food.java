package lexicon_airway;

public class Food extends STATIC
{

    private static int nextID = 0;
    private final String name;
    private final boolean isDrink;
    private final int rank;
    private int price;

    public Food(String name, int price, int rank, boolean isDrink)
    {
        this.name = name;
        this.rank = rank;
        this.price = price;
        this.isDrink = isDrink;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public boolean getIsDrink()
    {
        return isDrink;
    }

    public int getRank()
    {
        return rank;
    }

    public static int getNextID()
    {
        return nextID;
    }

    public static void setNextID(int nextID)
    {
        Food.nextID = nextID;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
//</editor-fold>

    @Override
    public String toString()
    {
        return "Food{" + "name=" + name + ", isDrink=" + isDrink + ", rank=" + rank + ", price=" + price + '}';
    }
    
    

}
