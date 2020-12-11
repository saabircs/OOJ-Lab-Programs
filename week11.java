class NewThread implements Runnable
{
 private String name;
 private int interval;
 private Thread t;
 NewThread(String threadname,int interval)
{
 this.name=threadname;
 this.interval=interval;
 t=new Thread(this,name);
 t.start();
}
public void run()
{
 try
 {
      for(int i=5;i>0;i--)
      {
       System.out.println(""+this.name);
       Thread.sleep(this.interval);
      }
 }
catch(InterruptedException e)
{
  System.out.println(name+"Interrupted");
}
}
}
class week11
{
 public static void main(String args[]){
 new NewThread("Bms College Of Engineering",10000);
 new NewThread("CSE",2000);
}
}
