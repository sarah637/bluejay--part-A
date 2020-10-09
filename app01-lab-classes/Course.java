
/**
 * Write a description of class Course here.
 *
 * @author (sarah)
 * @version (0.1)
 */
public class Course
{
    // instance variables - replace the example below with your own
   private String title;
  
   private String code;
    /**
     * Constructor for objects of class Course
     */
    public Course(String title,String code)
    {
        // ini
        this.title=title;
        this.code=code;
        
        
        
        
    } 
 public void print()
{
    System.out.println("course"+ title + ",course code" + code);
    
}
}
