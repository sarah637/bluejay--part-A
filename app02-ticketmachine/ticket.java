
/**
 * Write a description of class ticket here.
 *
 * @author (Sarah Cunningham)
 * @version (23/10/2020)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private int price;
    private String destination;
    private String date;
    /**
     * Constructor for objects of class ticket
     */
    public Ticket(String destination, int price, String date)
    {
        // initialise instance variables
       this.price = price;
       this.destination = destination;
       this.date = date;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getPrice()
    {
        // put your code here
        return price;
    }
     public String getDestination()
    {
        // put your code here
        return destination;
    } public String getDate()
    {
        // put your code here
        return date;
    }
}
