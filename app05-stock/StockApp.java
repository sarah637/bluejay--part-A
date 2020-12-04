
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
    // Use to get user input
    
    public static final char CLEAR_CODE = '\u000c';

    public static final String QUIT = "QUIT";
    public static final String ADD =  "ADD";
    public static final String PRINT_ALL =  "PRINTALL";
    public static final String REMOVE = "REMOVE";
    public static final String DELIVER = "DELIVER";
    public static final String SELL = "SELL";
    public static final String SEARCH = "SEARCH";
    public static final String LOW_STOCK = "LOW STOCK";
    public static final String RESTOCK = "RESTOCK";
   
   
    private StockManager manager;
    private StockDemo demo;
    private InputReader input = new InputReader();

    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        manager = new StockManager();
        demo = new StockDemo(manager);
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
     * Menu choice to give information
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
        else if (choice.equals(REMOVE))
        {
            removeProduct();
        }
        else if (choice.equals(DELIVER))
        {
            deliverProduct();
        }
        else if (choice.equals(SELL))
        {
            sellProduct();
        }
        else if (choice.equals(SEARCH))
        {
            searchProduct();
        }
        else if (choice.equals(LOW_STOCK))
        {
            manager.printLowStock();
        }
        else if (choice.equals(RESTOCK))
        {
            manager.RestockProduct();
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

        System.out.println("Please enter the product name");
        String name = ("getString");
        
        if (id != 0 && !name.isBlank())
        {
          Product product = new Product(id, name);
          manager.addProduct(product);
        }
        else
        {
          System.out.println("Error occured! blank spaces");  
        }
    }
    
    /**
     * removing product from list
     */
    private void removeProduct()
    {
        System.out.println("remove product");
        int id = input.getInt("\n Please enter the product ID");
        manager.removeProduct(id);
    }
    
    /**
     * show delivery of a product
     */
    private void deliverProduct()
    {
        System.out.println("deliver product"); 
        int id = input.getInt("\n Please enter the product ID");
        int amount = input.getInt("\n Please enter the product amount");
        manager.deliverProduct(id, amount);
    }
    
    /**
     * method to sell product
     */
    private void sellProduct()
    {
        System.out.println("sell product");
        int id = input.getInt("\n Please enter the product ID");
        int amount = input.getInt("\n Please enter the product amount");
        manager.sellProduct(id, amount);
    }
    
    /**
     * how to search for a product
     */
    private void searchProduct()
    {
        System.out.println("search product");
        String name = ("getString");
        System.out.println("prefix");
        demo.search("prefix");
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Deliver:    Deliver a product");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Low_Stock   Print low_stock");
        System.out.println("    Search      Search for a product");
        System.out.println("    Restock     Restock products");
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
