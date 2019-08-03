package Abstraction;

import java.util.Scanner;

public class Class2 extends Class1 {

	public void Sub(int a,int b) {
		
		int c=a-b;
		System.out.println("Sub = "+c);
	}
	
	public static void main(String[] args) {
		
		Class2 c=new Class2();
		Scanner S=new Scanner(System.in);
		int v1=S.nextInt();
		int v2=S.nextInt();
		
		c.Sum(v1,v2);
		c.Sub(v1, v2);
		
	}
}
