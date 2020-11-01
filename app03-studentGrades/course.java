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
    public Course(String courseCode, String courseTitle)
    {
        // initialise instance variables
        codeNo = courseCode;
        title = courseTitle;

        this.finalMark = -1;
        this.finalGrade = null;

        createModules();
    }

            
    public void createModules()
    {
        module1 = new Module("CO452 ", "programming concepts");
        module2 = new Module("CO450 ", "computer Architectures");
        module3 = new Module("CO404 ", "cyber Threat and risk management");
        module4 = new Module("CO456 ", "web development");

    }

    public void addModule(Module module, int moduleNo)
    {
        if(moduleNo == 1)
        {
            this.module1 = module;
        }

        else if(moduleNo == 2)
        {
            this.module2 = module;
        }

        else if(moduleNo == 3)
        {
            this.module3 = module;
        }

        else if(moduleNo == 4)
        {
            this.module4 = module;
        }
        else
        {
            System.out.println("module number invalid!");
        }
    }

    public void setMarkI(int mark, int moduleNo)
    {
        if(moduleNo == 1) 
        {
            module1.awardMark(mark);
        }

        else if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }

        else if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }

        else if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
        else {
            System.out.println("module number invalid!");
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
            System.out.println("course not complete");
        }      
    }


    public boolean courseCompleted() 

    {  
        if((module1.isComplete()) && (module2.isComplete()) &&
           (module3.isComplete()) && (module4.isComplete()))
        {
            return true; 
        }
        else return false;
    }

    /**
     * Convert marks into grades
     */
    public void calculateGrade()
    {
        if(finalMark>= 0 && finalMark <40)
        {
            finalGrade = "E";  
        }
        else if(finalMark >= 40 &&  finalMark < 50)
        {
            finalGrade = "D"; 
        }
        else if(finalMark>= 50 && finalMark < 60)       
        {
            finalGrade = "C"; 
        }
        else if(finalMark>= 60 && finalMark < 70) 
        {
            finalGrade = "B";
        }
        else if(finalMark>=70 && finalMark <= 100)
        {
            finalGrade = "A";
        }
        else
        {
            System.out.print("No mark awarded");
        }
    }

    /**
     * prints out the details of a course
     */
    public void print()  
    {
        // put your code here
        System.out.println("course" + codeNo + " - " + title); 
        printModules();

    }

    public void printModules()
    {

        //print all the module marks

        System.out.println("Modules: ");
            
        module1.print();
        module2.print();
        module3.print();
        module4.print();

        if(courseCompleted())
        {
            System.out.println("Final Mark =" + finalMark);
            System.out.println("Final Grade=" + finalGrade);
            System.out.println("Final Credit=" + credit); 
        }
    }
}
