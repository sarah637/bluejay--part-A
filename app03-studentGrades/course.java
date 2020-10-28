import java.util.*;

/**
 *  course represents a students course.
 *
 * @author Sarah Cunningham
 * @version 26/10/2020
 */
public class course
{
    // instance variables - replace the example below with your own
    private String codeNo; 
    private String title; 
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    
    /**
     * Constructer for objects of class Course
     */
    public course(String codeNo, String title); 
    {
        // initialise instance variables
        this. codeNo = codeNo;
        this. title = title;
        
        module1 = new Module("programming concepts", "CO452");
    }

    public void addModule(Module module, int moduleNo)
    {
    
    
    }
    /**
     * print course
     * 
     */
    public void print();
    {
        // put your code here
       system.out.println("course" + codeNo + " - " title); 
    }
}
