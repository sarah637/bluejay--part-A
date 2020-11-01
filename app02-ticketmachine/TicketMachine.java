import java.util.*;

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
    private Ticket buyTicket;
    private int price;
    private int balance;
    private int total;

    private Ticket aylesburyTicket; 
    private Ticket highWycombeTicket; 
    private Ticket amershamTicket; 

    private Coin coin;
    private ArrayList<Ticket> ticket;

    /**
     * Create a TicketMachine that issues tickets of the given price.
     */
    public TicketMachine()
    {

        balance= 0;
        total= 0;
        createTickets();

        buyTicket= null; 
        amershamTicket = new Ticket("Amersham",330);
        aylesburyTicket = new Ticket("Aylesbury", 220);
        highWycombeTicket = new Ticket("High Wycombe", 300);

        ticket = new ArrayList<Ticket>();

    }

    /**
     * create tickets for destination
     */
    private void createTickets()
    {
        this.aylesburyTicket = aylesburyTicket;
        this.highWycombeTicket = highWycombeTicket;
        this.amershamTicket = amershamTicket;
    }

    /**
     * add ticket
     */
    public void addTicket(Ticket newTicket)
    {
        {
            ticket.add(newTicket);
        }
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

    /**
     * insert coin to get a value and balance
     */
    public void insertCoin(Coin coin)

    { balance = balance + coin.getValue();
    }

    /**
     * select Aylesbury ticket
     */
    public void selectAylesburyTicket()
    {
        buyTicket = aylesburyTicket;
    } 

    /**
     * select Amersham ticket
     */
    public void selectAmershamTicket()
    {
        buyTicket = amershamTicket;
    } 

    /**
     * select High Wycombe ticket
     */
    public void selectHighWycombeTicket()
    {
        buyTicket = highWycombeTicket;
    } 

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        price = buyTicket.getPrice();
        if(balance >= buyTicket.getPrice())
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# " + buyTicket.getDestination());
            System.out.println("# " + buyTicket.getPrice() + " ster.");
            System.out.println("# " + buyTicket.getDate());
            System.out.println("##################");

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                (price - balance) + " more sterling.");

        }
    }

    /**
     * print tickets
     */
    public void printAllTickets()
    {
        System.out.println("the following three destinations are avaliable");
        aylesburyTicket.print();
        amershamTicket.print();
        highWycombeTicket.print();
        System.out.println("please select your ticket destination");
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()

    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }

    /**
     * print the balance
     */
    public void printBalance()
    { 
        System.out.println("balance = " + balance);
    }
}

