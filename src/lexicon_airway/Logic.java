package lexicon_airway;

import java.util.ArrayList;

public class Logic extends STATIC
{

    DB db = new DB(true);

    public Logic()
    {

    }

    //<editor-fold defaultstate="collapsed" desc="Passanger Functions">
    /**
     * book a ticket for the passanger on the selected plane and of the selected rank
     *
     * @param plane
     * @param passanger
     * @param rank
     * @param food
     */
    public void bookTicket(Airplane plane, Passanger passanger, int rank, ArrayList<Food> food)
    {
        if (passanger.getTicket().getId() == -1 && findOpenSeat(rank) != -1)
        {
            if (db.HangerDatabase.get(plane.getId()).getRankAvailable(rank) != 0)
            {
                Ticket ticket = new Ticket(plane.getId(), passanger.getId(), rank, food);
                db.TicketDatabase.add(ticket);
                db.PassangerDatabase.get(passanger.getId()).setTicket(ticket);

                db.HangerDatabase.get(plane.getId()).updateIncome(ticket.getRank());
                db.HangerDatabase.get(plane.getId()).updateIncome(passanger.getTicket().getFood());
                db.HangerDatabase.get(plane.getId()).updateRankAvailable(rank);
                
                System.out.println("***************************");
                System.out.println(passanger.getName() + " " );
                System.out.println(rank);
                System.out.println("-----* Plane *-----");
                System.out.println(plane.getCallsign());
                System.out.println("***************************");
                
                System.out.println("");
                System.out.println(passanger.toString());
            }
        } else
        {
            System.err.println("Something went wrong");
        }
    }

    /**
     * book a ticket for the passanger on the first available plane of the selected Rank
     *
     * @param passanger
     * @param rank
     * @param food
     */
    public void bookTicket(Passanger passanger, int rank, ArrayList<Food> food)
    {
        if (passanger.getTicket().getId() != -1 && findOpenSeat(rank) != -1)
        {
            int planeID = findOpenSeat(rank);
            if (db.HangerDatabase.get(planeID).getRankAvailable(rank) != 0)
            {
                Ticket ticket = new Ticket(planeID, passanger.getId(), rank, food);
                db.TicketDatabase.add(ticket);
                db.PassangerDatabase.get(passanger.getId()).setTicket(ticket);

                db.HangerDatabase.get(planeID).updateIncome(ticket.getRank());
                db.HangerDatabase.get(planeID).updateRankAvailable(rank);
            }
//            fancyPrinting("B, name);
        } else
        {
            System.err.println("Something went wrong");
        }
    }

    /**
     * Have a passanger order food
     *
     * @param passanger
     * @param food
     */
    public void orderFood(Passanger passanger, ArrayList<Food> food)
    {
        db.HangerDatabase.get(passanger.getTicket().getAirplaneID()).updateIncome(food);
    }

    /**
     * Cancel any ticket
     *
     * @param passanger
     */
    public void cancelTicket(Passanger passanger)
    {
        if (passanger.getTicket().getId() != -1)
        {
            db.PassangerDatabase.get(passanger.getId()).setTicket(emptyTicket);
        }
    }

    /**
     * Find the passanger who owns the Ticket
     *
     * @param ticket
     * @return
     */
    public Passanger findPassanger(Ticket ticket)
    {
        return db.PassangerDatabase.get(ticket.getPassangerID());
    }

    /**
     * Find the Passanger based on ID
     *
     * @param id
     * @return
     */
    public Passanger findPassanger(int id)
    {
        return db.PassangerDatabase.get(id);
    }

    /**
     * Find which plane the passanger is on
     * @param passanger
     * @return 
     */
    public Airplane find_Plane_based_on_Passanger(Passanger passanger)
    {
        return db.HangerDatabase.get(passanger.getTicket().getAirplaneID());
    }

    //</editor-fold>
    /**
     * Create a new Plane
     *
     * @param callsign
     * @param firstclass
     * @param economyclass
     */
    public void createPlane(String callsign, int firstclass, int economyclass)
    {
        Airplane plane = new Airplane(callsign, firstclass, economyclass);
        plane.setMenu(db.addFood());
        db.HangerDatabase.add(plane);
    }

    /**
     * Create a new Passanger
     *
     * @param name
     * @return 
     */
    public Passanger createPassanger(String name)
    {
        Passanger passanger = new Passanger(name);
        db.PassangerDatabase.add(passanger);
        return passanger;
    }

    /**
     * Find the planeID of the first open seat on a plane of the Rank asked for,
     * If none is found return -1
     *
     * @param rank
     * @return
     */
    public int findOpenSeat(int rank)
    {
        for (Airplane item : db.HangerDatabase)
        {
            if (item.getRankAvailable(rank) != 0)
            {
                return item.getId();
            }
        }
        return -1;
    }


}
