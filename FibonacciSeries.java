package project;

public class FibonacciSeries {
	public static void main() {
	int n1=0,n2=1,n3,i;
	System.out.println(n1+""+n2);
	
for(i=3;i<10;i++) {
	n3=n1+n2;
	System.out.println(""+n3);
	n1=n2;
	n2=n3;
}
}
}