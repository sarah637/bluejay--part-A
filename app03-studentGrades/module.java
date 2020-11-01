import java.util.*;

/**
 *Module represents modules in the course.
 *
 * @author Sarah Cunningham
 * @version 26/10/2020
 */
public class Module
{
    // instance variables - replace the example below with your own
    private int mark;

    private String title;

    private String codeNo;

    private int credit;

    private boolean completed;

   
    /**
     * Constructor for objects of class module
     */
    public Module(String title, String codeNo) 

    {
        mark = -1;
        this. title = title;
        this.codeNo = codeNo;
        credit = 0;
        completed = false;
    }

    /**
     * Get module title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * module code number
     */
    public String getCodeNo()
    {
        return codeNo;
    }

    /**
     * Award a mark
     */
    public void awardMark(int mark)
    {
        this.mark = mark;
    }

    /**
     * retrieve a mark
     */
    public int getMark()
    {
        return mark; 
    }

    /**
     * complete mark in boolean
     */
    public boolean isComplete()
    {
        if(mark >= 40)
        {
            credit = 15;
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Retrieve credit
     */
    public int getCredit()
    {
        return credit;
    }

    /**
     * print information
     */
    public void print()
    {
        System.out.println("Module; " + codeNo + 
            " " + title + " Mark = " + mark);
    }  
}

