
import java.util.*;

/**
 * The SarahLab class represents an enrolment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * modified by Sarah Cunningham
 * dated 27/Sep/2020
 */
public class SarahLab
{
    private String instructor;
    private String room;
    private String timeAndDay;
    
    private ArrayList<Student> students;
    private int capacity;
    
    /**
     * Create a SarahLab with a maximum number of enrolments. All other details
     * are set to default values.
     */
    public SarahLab(int maxNumberOfStudents)
    {
        instructor = "unknown";
        room = "unknown";
        timeAndDay = "unknown";
        
        students = new ArrayList<Student>();
        capacity = maxNumberOfStudents;
    }

    /**
     * Add a student to this SarahLab.
     */
    public void enrollStudent(Student newStudent)
    {
        if(students.size() == capacity) 
        {
            System.out.println("The class is full, you cannot enrol.");
        }
        else 
        {
            students.add(newStudent);
        }
    }
    
    /**
     * Return the number of students currently enrolled in this SarahLab.
     */
    public int numberOfStudents()
    {
        return students.size();
    }
    
    /**
     * Set the room number for this SarahLab.
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    
    /**
     * Set the time for this SarahLab. The parameter should define the day
     * and the time of day, such as "Friday, 10am".
     */
    public void setTime(String timeAndDayString)
    {
        timeAndDay = timeAndDayString;
    }
    
    /**
     * Set the name of the instructor for this SarahLab.
     */
    public void setInstructor(String instructorName)
    {
        instructor = instructorName;
    }
    
    /**
     * Print out a class list with other SarahLab details to the standard
     * terminal.
     */
    public void printList()
    {
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructor + "   Room: " + room);
        System.out.println("Class list:");
        
        for(Student student : students) 
        {
            student.print();
        }
        
        System.out.println("Number of students: " + numberOfStudents());
    }
}