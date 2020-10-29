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
    
    private int finalMark;
    private String finalGrade;
    
    /**
     * Constructer for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this. codeNo = codeNo;
        this. title = title;
        
        this.finalMark = 0;
        this.finalGrade = null;
        
        createModules();
    }

    public void createModules()
    {
       module1 = new Module("CO452", "programming concepts");
       module2 = new Module("CO452", "programming concepts");
       module3 = new Module("CO452", "programming concepts");
       module4 = new Module("CO452", "proggraming concepts");
    
    }
    
    public void addModule(Module module, int moduleNo);
    {
        if(moduelNo == 1)
        {
            this.module1 = module;
        }
    }
    
    public void setMarkI(int mark, String codeNo)
    {
        if(moduel1.getCodeNo() == codeNo)
        {
            module1.awardMark(mark);
        }

    }
   
    public void calculateFinalMark()
    {
        if(courseCompleted())
           {
            
               int totalMark = module1.getMark() + module2.getMark() + 
                   module3.getMark() + module4.getMark();
                
                
                finalMark = totalMark / 4;
                print();
                
                
            }
            else
            {
        
            }      
    }
        
    public boolean courseCompleted()
    
    {
        if((module1.isCompleted()) && (module2.isCompleted())) 
        {
            return true; 
        }
        else return false;
    }
    
    /**
     * prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("course" + codeNo + " - " + title); 
    }
    
    public void printModules()
    {
        
        //print all the module marks
        
        if(courseCompleted())
        {
            System.out.println("FinalMark =" + finalMark);
        }
    }
}
