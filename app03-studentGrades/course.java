import java.util.*;

 /**
 *  course represents a students course.
 *
 * @author Sarah Cunningham
 * @version 26/10/2020
 */
public class Course
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
    private int moduleMark;
    private int credit;
    
    
    /**
     * Constructer for objects of class Course
     */
    public course(String codeNo, String title)
    {
        // initialise instance variables
        this. codeNo = codeNo;
        this. title = title;
        
        this.finalMark = -1;
        this.finalGrade = null;
        
        createModules();
    }

    public void createModules(Module module, int moduleNo)
    {
       module1 = new Module ("CO452", "programming concepts");
       module2 = new Module ("CO450", "computer Architectures");
       module3 = new Module ("CO404", "cyber Threat and risk management");
       module4 = new Module ("CO456", "web development");
    
    }
    
    public void addModule(Module module, int moduleNo);
    {
        if(moduelNo == 1)
        {
            this.module1 = module1;
        }
        
        else if(moduelNo == 2)
        {
            this.module2 = module2;
        }
        
        else if(moduelNo == 3)
        {
            this.module3 = module3;
        }
        
        else if(moduelNo == 4)
        {
            this.module4 = module4;
        }
        else
        {
            System.out.println("select module");
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
                
            credit = module1.getCredit() + module2.getCredit + 
            module3.getCredit() + module4.getCredit();
       
            print();
                
                
            }
            else
            {
        
            }      
    }
        
    public boolean courseCompleted() 
    
    {  
        if((module1.isCompleted()) && (module2.isCompleted()) &&
          (module3.isCompleted())  && (module4.isCompleted()))
        {
            return true; 
        }
        else return false;
    }
    
    /**
     * prints out the details of a course
     */
    public void Print()  
    {
        // put your code here
        System.out.println("course" + codeNo + " - " + title); 
        
    }
    
    public void printModules()
    {
        
        //print all the module marks
        
        if(courseCompleted())
        {
            System.out.println("Modules: ");
            module1.print();
            module2.print();
            module3.print();
            module4.print();
            
            System.out.println("Final Mark =" + courseMark);
            System.out.println("Final Grade=" + converttoGrade(courseMark));
            System.out.println("Final Credit=" + credit()); 
        }
    }
}
