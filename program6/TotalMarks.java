import CIE.*;
import SEE.*;
import java.util.*;

class TotalMarks
{
    public static void main(String sss[])
    {
        int i,j,n;
        int total[]=new int[5];
        Scanner xx=new Scanner(System.in);
        System.out.println("Please Enter the number of students");
        n=xx.nextInt();
        CIE.Student s[]=new CIE.Student[n];
        CIE.Internals ci[]= new CIE.Internals[n];
	    SEE.Externals se[]=new SEE.Externals[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter student"+(i+1)+" details");
            s[i]=new CIE.Student();
            s[i].accept();
            ci[i]=new CIE.Internals();
            ci[i].accept();
            se[i]=new SEE.Externals();
            se[i].accept();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("details of the student "+(i+1));
            s[i].display();
            for(j=0;j<5;j++)
            {
                total[j]=ci[i].ciem[j]+(se[i].seem[j]/2);
                System.out.println("Total marks in subject"+(j+1)+" is "+total[j]);
            }
        }
    }
}