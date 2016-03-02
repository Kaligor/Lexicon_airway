package lexicon_airway;

import java.util.Objects;

public class Passanger extends STATIC
{

    private static int nextID = 0;
    private final int id;
    private final String name;
    Ticket ticket = emptyTicket;

    public Passanger(String name)
    {
        this.name = name;
        id = nextID;
        nextID++;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Ticket getTicket()
    {
        return ticket;
    }

    public void setTicket(Ticket ticket)
    {
        this.ticket = ticket;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Hash & Equals">
    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Passanger other = (Passanger) obj;
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        return true;
    }
//</editor-fold>

    @Override
    public String toString()
    {
        return "Passanger{" + "id=" + id + ", name=" + name + "\n" + "Ticket=" + ticket + '}';
    }

    

    
}
