package inheritance;

public class P3 {

	public P3() {
		this(1,2,3);
		System.out.println("parent default");
	}
	public P3(int a) {
		this(1,3);
		System.out.println("parent 1 parameter");
	}
	public P3(int a,int b) {
		this();
		System.out.println("parent 2 parameter");
	}
	public P3(int a,int b, int c){
		System.out.println("parameter 3 parameter");
	}
}
