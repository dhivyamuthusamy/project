package project;

public class Test {
public static void main(String[] args) {
	Travel travelOne=new Lorry();
	Travel travelTwo=new  Bus();
	System.out.println(travelOne instanceof Lorry);
	Travel travelthree=new Kangaroo();
	Owner owner=(Kangaroo)travelthree;
}

}
 