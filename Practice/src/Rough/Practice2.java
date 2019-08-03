package Rough;

import java.util.Scanner;

public class Practice2 extends Practice1 {

	public void div(int a,int b) {
	    super.mul(a, b);
		c=a/b;
	   System.out.println("Div ="+c);
	    
   }
	
	public static void main(String[] args) {
		
		Practice2 P=new Practice2();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the values =");
	int v1=s.nextInt();
	int v2=s.nextInt();
	  P.div(v1,v2);
	 
	System.out.println(" Change Done ");
	
	
	}
}
