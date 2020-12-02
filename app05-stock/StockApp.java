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
    public final int FIRST_ID = 101;
    
    // Use to get user input
    private InputReader input = new InputReader();

    public static final char CLEAR_CODE = '\u000c';

    public static final String QUIT = "QUIT";
    public static final String ADD =  "ADD";
    public static final String PRINT_ALL =  "PRINTALL";
    
   
    private StockManager manager = new StockManager();
    private StockDemo demo;
    
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
    }
    
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

            String choice = input.getString(" Please enter your choice > ");
            choice = choice.toUpperCase();
            
            if(choice.equals(QUIT))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }

    /**
     * 
     */
    private void executeMenuChoice(String choice)
    { 
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if (choice.equals(PRINT_ALL))
        {
            manager.printAllProducts();
        }
        else
        {
            System.out.println(" Not a valid choice!");
        }
    }
    

    /**
     * Print the title of the progress of coffee brands.
     */
    public void addProduct()
    {
        System.out.println ("Adding new product\n"); 

        int id = input.getInt("\n Please enter the product ID");

        if(manager.findProduct(id) == null)
        {
            String name = input.getString("\n Please enter the name of the product");

            Product product = new Product(id, name);
            manager.addProduct(product);
    
            System.out.println("\n You have added " + product);
            System.out.println();
        }
        else
        {
            System.out.println("\n Product ID " + id + " already exists");
        }
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
        System.out.println("    App05: by Sarah Cunningham");
        System.out.println("******************************");
    }
}
