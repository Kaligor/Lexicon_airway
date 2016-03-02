package lexicon_airway;

import java.util.ArrayList;

public class Airplane extends STATIC
{

    private static int nextID = 0;
    private final int id;
    private final String callsign;

    private final int nrOfFirst;
    private final int nrOfEco;

    private int avFirst;
    private int avEco;

    private int totalIncome = 0;

    private final ArrayList<Passanger> passangers = new ArrayList<>();
    private ArrayList<Food> menu = new ArrayList<>();

    public Airplane(String callsign, int nrOfFirst, int nrOfEco)
    {
        this.callsign = callsign;
        this.nrOfFirst = nrOfFirst;
        this.nrOfEco = nrOfEco;

        avFirst = nrOfFirst;
        avEco = nrOfEco;

        id = nextID;
        nextID++;
    }

    /**
     *
     * @param rank
     */
    public void updateIncome(int rank)
    {
        if (rank == ECONOMYCLASS)
        {
            totalIncome = totalIncome + ECONOMYCLASSPRICE;
        } else if (rank == FIRSTCLASS)
        {
            totalIncome = totalIncome + FIRSTCLASSPRICE;
        }
    }

    public void updateIncome(ArrayList<Food> food)
    {
        food.stream().forEach((item) ->
        {
            totalIncome = totalIncome + item.getPrice();
        });
    }

    public int getRankAvailable(int rank)
    {
        switch (rank)
        {
            case FIRSTCLASS:
                return getAvFirst();
            case ECONOMYCLASS:
                return getAvEco();
            default:
                return -1;
        }
    }

    public void updateRankAvailable(int rank)
    {
        switch (rank)
        {
            case FIRSTCLASS:
                setAvFirst();
                break;
            case ECONOMYCLASS:
                setAvEco();
                break;
        }
    }

//    public void updateIncome()
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public void setMenu(ArrayList<Food> menu)
    {
        this.menu = menu;
    }

    public int getAvFirst()
    {
        return avFirst;
    }

    public void setAvFirst()
    {
        avFirst--;
    }

    public int getAvEco()
    {
        return avEco;
    }

    public void setAvEco()
    {
        avEco--;
    }

    public int getId()
    {
        return id;
    }

    public String getCallsign()
    {
        return callsign;
    }

    public ArrayList<Passanger> getPassangers()
    {
        return passangers;
    }

    public ArrayList<Food> getMenu()
    {
        return menu;
    }
//</editor-fold>

}
