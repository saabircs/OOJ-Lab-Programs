public class Main {
public static void main(String args[]) {
 TwoGen<Integer, String>  obj  =new TwoGen<Integer, String>(50, "Java");
 obj.showType();
 int v= obj.getObj1();
 String str = obj.getObj2();
   System.out.println("The Integer value is : "+v);
     System.out.println(" The String value is : "+str);

    }
}