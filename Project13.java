package project;

public class Project13 {
	public static void main(String[] args) {
		int row=15;
		int column;
		while(row >= 1) {
			column=1;
			while(column <= 10 ) {
				System.out.println(row%2 == 1? "&&&& ": "****");
				++column;
			}
			--row;
			
		}
		
	}

}

