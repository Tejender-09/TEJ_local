package inheritance;

public class P2 extends P1 {

	public P2() {
		this(5);
		System.out.println("Child default");
	}public P2(int a){
		//super();
		super(1);
		System.out.println("Child 1 parameter");
	}public P2(int a,int b){
		this();
		System.out.println("Child 2 paramter");
	}
	public static void main(String[] args) {
		
		P2 p=new P2(1,3);
	    
	     
	}
}
