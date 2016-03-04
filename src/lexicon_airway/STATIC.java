package lexicon_airway;


public class STATIC 
{
    static final int FIRSTCLASS = 1;
    static final int ECONOMYCLASS = 2;
    
    static final int FIRSTCLASSPRICE = 20000;
    static final int ECONOMYCLASSPRICE = 5000;
    
    static final double UPKEEP = 0.3;
    
    static final Ticket emptyTicket = new Ticket();
    
    static final Flight noFlight = new Flight();
    
    public void fancyPrinting(String title, String conTitle1, String value1) {
        System.out.println("*-------------" + title + "-------------*");
        System.out.println(conTitle1 + " : " + value1);
        System.out.println("*---------------------------------------*");
    }
}
