package inheritance;

public class P1 {

  public P1() {
	this(1,3);
	  System.out.println("Parent Default");
	  
  }public P1(int a){
	  this();
	  System.out.println("Parent 1 parameter");
  }public P1(int a,int b){
	  System.out.println("Parent 2 parameter");
  }
}
