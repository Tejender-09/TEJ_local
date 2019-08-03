package Rough;

public class Practice1 {
      static int c;
	public void sum(int a,int b) {
		
		c=a+b;
	  System.out.println("Sum ="+c);

   }
	public void sub(int a,int b) {
		c=a-b;
		System.out.println("Sub ="+c);
	}
   public  void mul(int a,int b) {
	   this.sub(a, b);
	    c=a*b;
	    System.out.println("mul ="+c);
	}
 	   
}
