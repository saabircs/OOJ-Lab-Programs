import java.util.*;
import java.lang.*;

class Sum1 extends Thread {
	int SumOdd=0;
	Sum1(){
		super("Sum1");
		System.out.println("Child Thread: "+this);
		start();
	}
	public void run(){
		try{
			for(int i=1;i<=100;i++){
				if(i%2 != 0){
						 SumOdd= SumOdd + i;
					Thread.sleep(100);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Child Interrupted");
		}
		System.out.println("The Sum of Odd Numbers from 1 to 100: "+	 SumOdd);
	}
}

class OddEven {
	public static void main(String args[]){
		int SumEven=0;
		new Sum1();
		try{
			for(int i=1;i<=100;i++){
				if(i%2 == 0){
					SumEven = SumEven + i;
					Thread.sleep(200);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Sum of Even Numbers from 1 to 100: "+SumEven);
	}
}
