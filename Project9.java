package project;

public class Project9 {
	public static void main(String[]  args) {
			 int N=68942;
			int temp=N;
			int i=0;
			 int arr[] = new int[10];
			 
			 while(temp > 0)
			 {
				 int remainder =temp % 10;
				 arr[i] = remainder;
				 i++;
				temp = temp/10; 
			 }
		for(i=0;  i < 10;  i++) {
			System.out.println(arr[i]);
		}
			 
		 }
		}
          

