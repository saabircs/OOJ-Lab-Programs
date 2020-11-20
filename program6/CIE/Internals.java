package CIE;
import java.util.Scanner;
public class Internals extends CIE.Student
{
    public int ciem[]=new int[5];
    Scanner xx =new Scanner (System.in);
    public void accept()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Please enter the cie marks of subject"+(i+1)+" out of 50");
            {
                ciem[i]=xx.nextInt();
            }
        }
    }

    
}