package CIE;
import java.util.Scanner;

public class Student
{
    String name,usn;
    int sem;
    Scanner xx=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Please enter the name:");
        name=xx.nextLine();
        System.out.println("Please enter the USN:");
        usn=xx.next();
        System.out.println("Enter Semester:");
        sem=xx.nextInt();
    }
    public void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Usn :"+usn);
        System.out.println("Sem :"+sem);
    }
}