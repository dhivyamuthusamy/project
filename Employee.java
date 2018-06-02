package project;

public class Employee {
	String name;
	double  salary;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setName (" name");
	e1.setSalary (35000);
	Employee e2 = new Employee();
	e2.setName("name");
	e2.setSalary(254000);
	System.out.println(e1.getSalary());
	System.out.println(e2.getSalary());
}
}