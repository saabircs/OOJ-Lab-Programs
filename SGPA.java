/* Develop a Java program to create a class Student with members usn, name, an array
credits and an array marks. Include methods to accept and display details and a method to
calculate SGPA of a student. */

import java.util.Scanner;
public class GPA
{
     int numberOfCourses;
     String usn, name;
     int creditsArray[];
     int marksArray[];
     int gradesArray[];
     double SGPA;
    
     GPA()
     {
	 SGPA = 0.0D;
     }
	
     void input()
     {
        Scanner in = new Scanner(System.in);
        System.out.print("\n Please Enter your Name: ");
        name = in.nextLine();
        System.out.print("Enter your USN: ");
        usn = in.next();
        System.out.print("Enter number of courses registered: ");
        numberOfCourses = in.nextInt();
        marksArray = new int[numberOfCourses];
        creditsArray = new int[numberOfCourses];
        gradesArray = new int[numberOfCourses];
        
        int i = 0;
        
	System.out.println();
        for(i = 0;i < numberOfCourses; i++)
        {
            System.out.print("Enter Credits for course "+(i+1)+" = ");
            creditsArray[i] = in.nextInt();
            System.out.print("Enter marks obtained in course "+(i+1)+" = ");
            marksArray[i] = in.nextInt();  
	    System.out.println();         
        }
        in.close();
    }
    
    void computeGradesArray()
    {
        int i = 0;
        for(i=0;i<numberOfCourses;i++)
        {
            if(marksArray[i]==100)
            {
                gradesArray[i] = 10;
                continue;
            }
            if(marksArray[i]>=50)
            {
                gradesArray[i] = (marksArray[i]/10)+1;
                continue;
            }
            if(marksArray[i]>=35)
            {
                gradesArray[i] = 4;
                continue;
            }
            gradesArray[i]=0;
        }
    }
    
     void computeSGPA()
     {
        int i = 0;
        int netCredits = 0;
        for(i = 0 ; i < numberOfCourses ; i++)
        {
            SGPA = SGPA + creditsArray[i]*gradesArray[i];
            netCredits = netCredits+creditsArray[i];
        }
        SGPA = SGPA/netCredits;
    }
    
     void display()
     {
	System.out.println();
        System.out.println("*******************************************************");
        System.out.println("Student USN: "+usn);
        System.out.println("Student Name: "+name);
        System.out.println("Number of Courses registered: "+numberOfCourses);
        int i = 0;
        for(i = 0;i<numberOfCourses; i++)
            System.out.println("Marks scored in course "+(i+1)+" is "+marksArray[i]);
        System.out.println("SGPA : "+SGPA);
        System.out.println("*******************************************************");
        
    }
    public static void main(String []args)
    {
        GPA object = new GPA();
        object.input();
        object.computeGradesArray();
        object.computeSGPA();
        object.display();
    }
}
