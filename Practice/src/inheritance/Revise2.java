package inheritance;

public class Revise2 extends Revise1 {

	public Revise2() {
		super(5);
		System.out.println("child default");
	}
	public Revise2(int a) {
		this();
		//super(6);
		System.out.println("Child 1 parameterize Cons");
	}
	public static void main(String[] args) {
		
		Revise2 R=new Revise2(5);
	}
}
