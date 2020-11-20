package SEE;
import CIE.*;
import java.util.Scanner;

public class Externals extends CIE.Student
{
    public int seem[]=new int[5];
    Scanner xx =new Scanner (System.in);
    public void accept()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Please enter the SEE marks of subject"+(i+1)+" out of 100");
            {
                seem[i]=xx.nextInt();
            }
        }
    }

}