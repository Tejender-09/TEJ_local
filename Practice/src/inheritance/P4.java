package inheritance;

public class P4 extends P3 {

	public P4() {
		this(2,3);
		System.out.println("child default");
	}
	public P4(int a){
		this(2,1,2);
		System.out.println("child 1 parameter");
	}
	public P4(int a,int b){
		super(5);
		System.out.println("child 2 parameter");
	}
	public P4(int a,int b,int c){
		this();
		System.out.println("child 3 parameter");
	}
	public static void main(String[] args) {
		
		P4 P=new P4(5);
	}
}
