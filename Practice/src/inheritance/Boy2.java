package inheritance;

public class Boy2 extends Baap{

	public void Bad(int a,int b) {
		
		int c=a/b;
		System.out.println("Boy is a bad boy  "+c);
	}

	public static void main(String[] args) {
		
		Boy2 G=new Boy2();
		G.First();
		G.Bad(5, 2);
	
	}
}
