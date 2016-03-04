package lexicon_airway;


public class Flight 
{
    static int nextID = 0;
    int id;
    
    int takeOffHour;
    int takeOffMinute;
    
    int landingHour;
    int landingMinute;
    
    int flightTime;
    
    String Destination;
    
    int planeID;

    public Flight(int takeOffHour, int takeOffMinute, int landingHour, int landingMinute, String Destination)
    {
        this.takeOffHour = takeOffHour;
        this.takeOffMinute = takeOffMinute;
        this.landingHour = landingHour;
        this.landingMinute = landingMinute;
        this.Destination = Destination;
        id = nextID;
        nextID++;
        flightTime = ((landingHour - takeOffHour) * 10000) + ((landingMinute - takeOffMinute) * 1000);
    }

    /**
     * No Flight Constructor
     */
    public Flight()
    {
        takeOffHour = -1;
        takeOffMinute = -1;
        landingHour = -1;
        landingMinute = -1;
        Destination = "No Flight";
        id = 9999;
    }
    
    public int takeOffCheck () {
        return (takeOffHour * 100) + takeOffMinute;
    }

    @Override
    public String toString()
    {
        return "Flight{" + "id=" + id + ", takeOffHour=" + takeOffHour + ", takeOffMinute=" + takeOffMinute + ", landingHour=" + landingHour + ", landingMinute=" + landingMinute + ", flightTime=" + flightTime + ", Destination=" + Destination + ", planeID=" + planeID + '}';
    }

    
    
    
    
}
