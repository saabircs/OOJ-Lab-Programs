import java.util.Random;
class Square extends Thread
{
 int num;
 Square(int n)
 {
 num = n;
 }
 public void run()
 {
 int sqr = num * num;
 System.out.println("The square of " + num + " = " + sqr );
 }
}
class Cube extends Thread
{
 int num;
 Cube(int n)
 {
 num = n;
 }
 public void run()
 {
 int cb = num * num * num;
 System.out.println("The cube of " + num + " = " + cb );
 }
}
class Number extends Thread
{
 public void run()
 {
 Random random = new Random();
 for(int i =0; i<10; i++)
 {
 int randomInteger = random.nextInt(100);
 System.out.println("Random Integer generated is " + randomInteger);
 if(randomInteger%2==0)
 {
	 
	 System.out.println("The Integer is even!");
	 Square s = new Square(randomInteger);
     s.start();
 }
 else
 {
	 System.out.println("The Integer is odd!");
     Cube c = new Cube(randomInteger);
     c.start();
 }
 try {
 Thread.sleep(1000);

 } catch (InterruptedException ex) {
 System.out.println(ex);
}
 }
 }
}
public class RandomInteger {
 public static void main(String args[])
 {
 Number n = new Number();
 n.start();
 }
}
