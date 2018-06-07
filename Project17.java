package project;

public class Project17 {
	public static void main(String[] args) {
		int a[] = {5,4,6,2,8,1};
		int i,n,m;
		   int min=a[0];
  		   for(i=0;i<a.length;i++) {
			if (a[i] >= min) {
				n=a[i];
				System.out.println("max is"+n);
			}
			   
			else {
				if(a[i] < min) {
				m=a[i];
				System.out.println("min is "+m);
			}
			}
	}

}
}