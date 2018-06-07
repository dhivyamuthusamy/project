package project;

import java.util.Scanner;

public class Shape {
	double length;
	double width;
	public void rectangle() {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the values of length and breadth");
		length=in.nextDouble();
		width=in.nextDouble();
		if((length>0.0 && length<20.0)&&(width>0.0 && width<20.0)) {
		System.out.println("area"+length*width);	
		System.out.println("perimeter"+2*(length+width));
		}
		else {
			System.out.println("nothing");
		}
		
		}
	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.rectangle();
	}
}


