package project;

public class Program {
	public static void main(String[] args) {
		int n=545,r;
		int sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		 if(temp==sum) {
			System.out.println("it is a palindrome number");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}

}
