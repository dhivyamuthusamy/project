package project;

public class Perfect {
	int sum=0;
	public boolean isPerfectNumber(int number) {
		for(int i=1;i<number;i++) {
			if(number%i==0) 
				sum=sum+i;
		}
		return sum==number ? true :false;
		}
		public static void main(String[] args) {
			Perfect p1 =new Perfect();
		
			System.out.println(p1.isPerfectNumber(6));
			
		}
			
		
	}


