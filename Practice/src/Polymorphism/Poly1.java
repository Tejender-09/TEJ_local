package Polymorphism;

import java.util.Scanner;

public class Poly1 {
     //int c;
	
	public int Poly1(int a,int b){
		
		//this.Poly1(2, 1.2)];
		
		int c=a+b;
		System.out.println("sum= "+c);
		return c;
	}
	public float Poly1(int a,float b) {
		
		float c=a-b;
		//d=(float)c;
		System.out.println("sub= "+c);
		return c;
	}
	
	public float Poly1(float a,float b) {
		float d=a*b;
		
		System.out.println("Result = "+d);
		return d;
	}
	public static void main(String[] args) {
		Poly1 P=new Poly1();
		Scanner s=new Scanner(System.in);
		
	    int v1= s.nextInt();
	    float v2= (int)s.nextFloat();
		
	    P.Poly1(v1,v2);
		
	}
}
