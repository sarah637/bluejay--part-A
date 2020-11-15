import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Sarah Cunningham 
 * @version 30/10/2020
 */
public class StockManager
{

    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Method to remove a product from
     * the stock list.
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            stock.remove(product);
        }    
        else  
        {      
            System.out.println("Please enter a valid id number");
        }
    }

    /**
     * Method to renameproduct from the StockManger
     */
    public void renameproduct(int id, String replaceProductName) 
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.changeName(id, replaceProductName);
            System.out.println("Rename Change Successful"
                + product);
        }
        else
        {
            System.out.println("Invalid ID");
        }
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id); 

        if(product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Delivered:" + product);
        }
        else
        {  
            System.out.println("Product ID" + id + "NOT FOUND!!!");
        } 

    }

     /**
     * Shown details of the product.
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = findProduct(id);

        if(product != null)
        {
            System.out.println(product. toString());
        }
    }

    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int amount)
    {
        Product product = findProduct(id);

        if(product != null) 
        {   
            showDetails(id);
            product.sell(amount);
            showDetails(id);
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if (product.getID() == id)
            { 
                return product;
            }
        } 
        return null;
    }   

    /**
     * Locate a product with the given ID and return how
     *Many of this item are in stock. If the ID does not     
     * match any product, return zero.
     * @paran id The ID of the product.
     * return the quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        Product product = findProduct(id);

        if(product == null)

        {
            return 0;
        }
        return product.getQuantity();
    }

    /**
     * Print details of all the products.
     */
    public void printAllProducts()
    {
        for(Product product :stock)
        {
            System.out.println(product);
        }
    }

    /**
     * Print products with low stock levels.
     */
    public void printlowStock()
    {
        for(Product product : stock)
         {
             int id = 101;
            if(product.getQuantity() <3)
            {   
                System.out.println("Alert! Low Stock");
                System.out.println(product);
            }
            id++;
        }
    }

    public void printHeading()
    {
        System.out.println("\n==========================");
        System.out.println("Sarah's Stock List");
        System.out.println("#############\n");
    }

}
