package project;

public class Celsius {

	public void celsiusCalc(double fahrenhiet) {
		double celsius = 5.0 / 9.0 * (fahrenhiet - 32);
		System.out.println(celsius);
	}
	public void fahrenheitCalc(double celsius) {
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		System.out.println(fahrenheit);
	}

	public static void main(String[] args) {
		Celsius celsius = new Celsius();
		celsius.celsiusCalc(98);
		celsius.fahrenheitCalc(88);
		
	}

}
