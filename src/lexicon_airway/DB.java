package lexicon_airway;

import java.util.ArrayList;



public class DB 
{

    ArrayList<Ticket> TicketDatabase = new ArrayList<>();
    ArrayList<Passanger> PassangerDatabase = new ArrayList<>();
    ArrayList<Airplane> HangerDatabase = new ArrayList<>();
    ArrayList<Food> FoodMenu = new ArrayList<>();
    ArrayList<Flight> FlightDatabase = new ArrayList<>();

    public DB(boolean fake)
    {    
        PassangerDatabase.add(new Passanger("Marcus"));
        PassangerDatabase.add(new Passanger("Lars"));
        PassangerDatabase.add(new Passanger("Fredrik"));
        PassangerDatabase.add(new Passanger("Svenne"));
        PassangerDatabase.add(new Passanger("Kevin"));
        
        HangerDatabase.add(new Airplane("Alpha Air", 10, 20));
        HangerDatabase.add(new Airplane("Silver Wind", 5, 15));
        HangerDatabase.add(new Airplane("Bright Comet", 15, 0));
        
        FlightDatabase.add(new Flight(15, 30, 20, 0, "Tokyo"));
        FlightDatabase.add(new Flight(17, 15, 21, 0, "New York"));
        FlightDatabase.add(new Flight(16, 45, 17, 30, "Malmö"));
       
        
        FoodMenu.addAll(addFood());
    }

    public DB()
    {
        
    }

    /**
     * Food Array Generator, can be edited to update food menu
     * @return
     */
    protected final ArrayList<Food> addFood()
    {
        Food steak = new Food("Steak", 100, STATIC.FIRSTCLASS, false);
        Food chicken = new Food("Chicken", 75, STATIC.FIRSTCLASS, false);
        Food fancySalad = new Food("Fancy Salad", 80, STATIC.FIRSTCLASS, false);
        Food lightbeer = new Food("Light beer", 20, STATIC.FIRSTCLASS, true);
        Food redWine = new Food("Red Wine", 30, STATIC.FIRSTCLASS, true);
        Food nuts = new Food("Nuts", 10, STATIC.ECONOMYCLASS, false);
        Food fish = new Food("Fish", 60, STATIC.ECONOMYCLASS, false);
        Food meat = new Food("Meat", 75, STATIC.ECONOMYCLASS, false);
        Food softDrink = new Food("Soft Drink", 10, STATIC.ECONOMYCLASS, true);
        Food water = new Food("Water", 5, STATIC.ECONOMYCLASS, true);
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(steak);
        foodList.add(chicken);
        foodList.add(fancySalad);
        foodList.add(lightbeer);
        foodList.add(redWine);
        foodList.add(nuts);
        foodList.add(fish);
        foodList.add(meat);
        foodList.add(softDrink);
        foodList.add(water);
        return foodList;
    }
    
    
    
    
    
}
