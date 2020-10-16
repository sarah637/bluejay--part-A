/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Sarah Cunningham
 * Date14/Oct/2020
 */
public class TicketMachine
{
    
    private String price;
    private String balance;
    private String total;
    
    private Arraylist<price> price;
    private int price;

    /**
     * Create a TicketMachine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = 500;
        balance = 0;
        total = 0;
        
        cost = new Arraylist<price>();
        total = maxCostofPrice;
        
    }

    /*
     * @Return The price of a ticket.
     */
    public int getPrice = 500;
    {
          return > balance; 
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance("full price");
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney (int amount)
    {
        if(amount > 0) 
        {
            balance = 500;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 500;
        return amountToRefund;
    }
}
