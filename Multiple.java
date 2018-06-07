package project;

public class Multiple {
	
public boolean isMultiple(int one,int two)
{
	if(two%one==0)
	return true;
	else
	return false;
}
	public static void main(String[] args) {
		Multiple multiple=new Multiple();
		multiple.isMultiple(3, 9);
		System.out.println(multiple.isMultiple(3, 9));
	
}

}
