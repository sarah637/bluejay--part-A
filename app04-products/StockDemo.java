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
    public static final int First_ID = 101;
    
    // The stock manager.
    private StockManager manager;
    
    private Random randomgenerator;
    
    private String name = "Dolce Gusto";

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(stockManager manager)
    
    {if(name.startsWith("Dolcegusto"))
     {
        
     }
        
        generator = new Random();
        this. manager = manger;
        
        int id = FIRST_ID;
        
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
       manager.printAllProducts();
       demoSellproducts();
       manager.printAllProducts();
    }
    
   /**
    *Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.   
    */
    
    private void demoDeliverProducts()
    {
        int quantity = 0;
        System.out.println();
        System.out.println ("Demonstrating Product Delivery");
        Ststem.out.println();
        
       
       int amount = 0;
        
       for(int id = 101; id <= 110; id++)
     {  
      quantity = randomgenerator. nextInt(6) + 1;
       manager.deliveryProduct(id, quantity);
       amount++;
     }
     
     private void demoSell()
     {
         printHeading();
         
         
         int amount = 0
     
     
         
        
    }
}  
    