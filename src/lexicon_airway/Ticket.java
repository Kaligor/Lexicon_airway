package lexicon_airway;

import java.util.ArrayList;
import java.util.Arrays;

public class Ticket extends STATIC
{

    private static int nextID = 0;
    private final int id;

    private int airplaneID;
    private int passangerID;
    private int totalCost = 0;
    private ArrayList<Food> food = new ArrayList<>();
    private int foodTotal = 0;
    private int rank; //use Static Variables  

    /**
     * Standard Constructor
     *
     * @param airplaneID
     * @param passangerID
     * @param rank
     * @param food
     */
    public Ticket(int airplaneID, int passangerID, int rank, ArrayList<Food> food)
    {
        id = nextID;
        nextID++;
        this.airplaneID = airplaneID;
        this.passangerID = passangerID;
        this.rank = rank;
        this.food = food;
        food.stream().forEach((item) ->
        {
            foodTotal = foodTotal + item.getPrice();
            totalCost = totalCost + item.getPrice();
        });
        if(rank == ECONOMYCLASS) {
            totalCost = totalCost + 5000;
        } else if (rank == FIRSTCLASS) {
            totalCost = totalCost + 20000;
        }

    }

    /**
     * Dummy Ticket
     */
    public Ticket()
    {
        id = -1;
        airplaneID = -1;
        passangerID = -1;
        rank = -1;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public int getFoodTotal()
    {
        return foodTotal;
    }

    public int getTotalCost()
    {
        return totalCost;
    }

    public ArrayList<Food> getFood()
    {
        return food;
    }

    public int getAirplaneID()
    {
        return airplaneID;
    }

    public void setAirplaneID(int airplaneID)
    {
        this.airplaneID = airplaneID;
    }

    public int getPassangerID()
    {
        return passangerID;
    }

    public void setPassangerID(int passangerID)
    {
        this.passangerID = passangerID;
    }

    public int getRank()
    {
        return rank;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    public int getId()
    {
        return id;
    }
//</editor-fold>

    @Override
    public String toString()
    {
        return "Ticket{" + "id=" + id + ", airplaneID=" + airplaneID + ", passangerID=" + passangerID + ", totalCost=" + totalCost +  ", rank=" + rank + "\n" + "Food=" + food + '}';
    }

}
