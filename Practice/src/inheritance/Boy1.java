package inheritance;

public class Boy1 extends Baap {

	public void Good(int a) {
		int c=a;
		System.out.println("Boy1 is a good boy  "+c);
	}
	public static void main(String[] args) {
		
		Boy1 B=new Boy1();
		B.First();
		B.Good(6);
	}
}
