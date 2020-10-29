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
    public course(String codeNo, String title); 
    {
        // initialise instance variables
        this. codeNo = codeNo;
        this. title = title;
        
        this.finalMark = 0;
        this.finalGrade = null;
        
        createModules();
    }

    public void acreateModules();
    {
      module1 = new Module("programming concepts", "CO452");
      moudle2 = new Module("programming concepts", "CO452");
      module3 = new Module("programming concepts", "CO452");
      module4 = new Module("proggraming concepts", "CO452");
    
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
                module3.geMark() + module4.getMark();
                
                
                finalMark = totalMark / 4;
                print();
                
                
            }
            else
            {
        
            }      
    }
        
    public boolean courseCompleted()
    
    {
        if((moduel1.isCompleted()) && (module2.iCcompleted())) 
        (module3.isCompleted())) && (module4 .isCompleted()))
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
        system.out.println("course" + codeNo + " - " + title); 
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
