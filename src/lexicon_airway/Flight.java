package lexicon_airway;


public class Flight 
{
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
        flightTime = ((landingHour - takeOffHour) * 10000) + ((landingMinute - takeOffMinute) * 1000);
    }
    
    public int takeOffCheck () {
        return (takeOffHour * 100) + takeOffMinute;
    }

    @Override
    public String toString()
    {
        return "Flight{" + "takeOffHour=" + takeOffHour + ", takeOffMinute=" + takeOffMinute + ", landingHour=" + landingHour + ", landingMinute=" + landingMinute + ", flightTime=" + flightTime + ", Destination=" + Destination + ", planeID=" + planeID + '}';
    }
    
    
    
}
