
                          
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
    
    private int price;
    private int balance;
    private int total;
    
    private Ticket ticket;
    
    private Coin coin;
    
    /**
     * Create a TicketMachine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance=0;
        total=0;
        
       
        
    }

    /*
     * @Return The price of a ticket.
     */
    public int getPrice() 
    {
          return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney (int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    public void insertCoin(Coin coin)
    
    { balance = balance + coin.getValue();
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
            System.out.println("# Ticket to" + ticket.getDestination());
            System.out.println("# " + ticket.getPrice() + " cents.");
            System.out.println("# " + ticket.getDate());
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
        balance = 220;
        return amountToRefund;
    }
}

    
