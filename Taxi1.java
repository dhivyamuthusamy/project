package project;

public class Taxi1 extends Cars {
	public Taxi1() {
		System.out.println("taxi cons is empty");
	}
public Taxi1(int speed) {
	System.out.println("taxi cons is one");
}
public void brake() {
	System.out.println("brake is used in taxi");
}
public static void main(String[] args) {
	Taxi1 t1=new Taxi1(2);
	t1.brake();
}
}
