package assignmentCRUD;

public class User {
	public static void main(String[] args) {
		StudentDao obj = new StudentDao();
		
		Student stu = new Student();
		stu.setId(102);
		stu.setName("Gungun");
		stu.setEmail("Gungun@gmail.com");
		stu.setMarks(90.9);
		
		obj.saveStudent(stu);

	}

}