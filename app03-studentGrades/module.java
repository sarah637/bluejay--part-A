import java.util.*;

/**
 *Module represents the modules in the course.
 *
 * @author Sarah Cunningham
 * @version 26/10/2020
 */
public class module
{
    // instance variables - replace the example below with your own
    private int mark;
    private String title;
    private String codeNo;

   
    /**
     * Constructor for objects of class module
     */
    public module(String title, String codeNo) 
    
    {
      mark = 0;
      this. title = title;
      this.codeNo = codeNo;
    }
     
    public void print()
    {
      System.out.println("Module; " + codeNo + 
      " " + title + " Mark = " + mark);
    }  
}
    
