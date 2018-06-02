package Student;

public class ShowStudent {
	

	public static  void main(String args[]) {
		Student student = new Student();//object created
		student.setFirstName("sai");
		student.setDept("ECE");
		student.setLastName("suresh");
		student.setGender("female");
		student.setStudentId("1234iet");
		System.out.println(student);
		

}
}