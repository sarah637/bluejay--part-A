import java.util.Scanner;
import java.util.*;
import java.util.HashSet;
/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Sarah Cunningham
 * @version    13/11/2020
 */
public class InputReader
{
    private Scanner reader;
    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getString(String prompt)
    {
        String inputLine = null;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.println(prompt);         // print prompt
            inputLine = reader.nextLine();
            if(inputLine.isBlank())
            {
                System.out.println("Blank!");
            }
            else isValid = true;
        }

        return inputLine;
    }
    
    /**
     * insert prompt for user.
     */
    public int getInt(String prompt)
    {
        System.out.println(prompt);         // print prompt
        int number = reader.nextInt();

        return number;
    }    
}
