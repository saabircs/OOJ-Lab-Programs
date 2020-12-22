class NewThread implements Runnable
{
private String name;
private int interval;
private Thread t;
NewThread(String threadname, int interval)
{
 this.name= threadname;
 this.interval = interval;

 t = new Thread(this,name);
 t.start();
}
public void run()
{
try
{
     Thread.sleep(this.interval);
     System.out.println(this.name);
}
catch(InterruptedException e) {
   System.out.println(name + "Interrupted");
  }
 }
}
class FourThreads {
public static void main(String args[])
{
new NewThread("{1BM19CS209}",1000);
new NewThread("{CSE}",2000);
new NewThread("{BMSCE}",3000);
new NewThread("{BANGALORE}",4000);
}
}
