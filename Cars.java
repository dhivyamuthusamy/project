package project;

public class Cars {
	public Cars() {
		System.out.println("empty constructor are called");
	}
public  Cars(int i) {

	System.out.println("one arg constructor are called");
	
}
public void brake() {
	System.out.println("brake is used");}

public static void main(String[] args) {
	Cars c1=new Cars(10);
	c1.brake();
}
}
