import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Sarah Cunningham
 * @version 30/10/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    private Random generator;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)

    {  
        generator = new Random();
        this.manager = new StockManager();

        manager.addProduct(new Product(101, "Dolce Gusto Latta"));
        manager.addProduct(new Product(102, "Dolce Gusto Cappaccino"));
        manager.addProduct(new Product(103, "Dolce Gusto Mocha"));
        manager.addProduct(new Product(104, "Nespresso pods Latta"));
        manager.addProduct(new Product(105, "Nespresso pods Cappaccino"));
        manager.addProduct(new Product(106, "Nespresso pods Mocha"));
        manager.addProduct(new Product(107, "Tassimo Pods Latta"));
        manager.addProduct(new Product(108, "Tassimo Pods Cappaccino"));
        manager.addProduct(new Product(109, "Tassimo Pods Mocha"));
        manager.addProduct(new Product(110, "Tassimo Pods Americano"));
    }

    /**
     * This method will run all tests to show the requirements are meet
     */
    public void runDemo()
    {
       manager.printAllProducts();
       demoDeliverProducts();
       manager.printALLProducts();
       demosellProduct();
       mamnager.printALLProducts();
    }

    /**
     *Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.   
     */

    private void demoDeliverProducts()
    {
        printHeading("delivery");
        int quantity = 0;

        for(int id = 101; id <= 110; id++)
        {  
            amount = generator.nextInt(8) + 1;
            manager.deliveryProduct(id, quantity);
            amount++;
        }
    }

    private void demoSell()
    {
        printHeading("something");

        int amount = 0;
        for(int id = 101; id <= 110; id++)
        {  
            amount = generator. nextInt(8) + 1;
            manager.sellProduct(id, amount);
            amount++;
        }

    }

    /**
     * Method to find product from name.
     */
    public void search(String prefix)
    {
        int id = 100;

        while(id <= 109)
        {
            Product product = manager.findProduct(id);
            String name = product. getName();
            name = name.toLowerCase();
            prefix = prefix.toLowerCase();

            if(name.contains(prefix))
            {
                System.out.println(product);
            }
            id++;
        }

    }
    
    /**
     * print a heading to make it easier
     * to find the difference and demostrate
     * in the demo mode.
     */
    public void printHeading(String verb)
    {
        System.out.println();
        System.out.println("Demonstating product" + verb);
        System.out.println();
    }
}  
 