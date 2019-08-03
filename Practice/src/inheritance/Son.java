package inheritance;

public class Son extends Father {

	public void Third() {
		i=i*6;
		System.out.println("Third value of i= "+i);
	}
	public static void main(String[] args) {
		
		
		Son ob=new Son();
        
        ob.First();
        ob.Second();
        ob.Third();
        
	}
}
