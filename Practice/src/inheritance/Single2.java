package inheritance;

public class Single2 extends Single1 {

	public void Single2(int a,int b) {
		int c=a-b;
		
		System.out.println("i am second ="+c);
	}
	public static void main(String[] args) {
		
		Single2 s=new Single2();
		//s.Single2(1,3);
		s.Single1(6,5);
		s.Single2(1,3);
	}
}
