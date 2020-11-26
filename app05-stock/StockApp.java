import java.util;
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Sarah Cunningham
 * @version 13/11/2020
 */
public class StockApp
{
    public static final char CLEAR_CODE = '\u000c';

    public static final String Quit = "quit";
    public static final String ADD =  "ADD";
    public ststic final String PRINTALL =  "PRINTALL";
    // Use to get user input
    private InputReader input;

    private StockManager manager = new StockManager();

      
    /**
     * menu choices
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getInput();

            if(choice.equals(QUIT))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }

    private void execute Menu(); Choice(String choice)
    { 
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if (choice.equales(PRINT_ALL))
        {
            manager.printAllproducts();
            String value = input.getString();
        }
    }

    public void addProduct()
    {
        System.out.println ("Adding new product\n"); 

        System.out.println("please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);

        System.out.println("Please enter the name of the product");
        String name = input. getString();

        Product product = new Product(id.name);
        manager.addProduct(product);

        System.out.println("\nyou have added" + product);
        System.out.print;
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Sarah");
        System.out.println("******************************");
    }
}
