
public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Kerim", "Kerim Uğur", "123456");
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);
		
		System.out.println("------------------");
		
		Instructor instructor = new Instructor(2, "Tarık", "Tarık35", "09876", "12-A*2  11-C*2  9-F*2 ");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		instructorManager.scheduleClassify(instructor);
		
		System.out.println("------------------");
		
		Student student = new Student(3, "Yusufcan", "NacarBoi", "dododot", "Matematik*2 - Türkçe*2 - İngilizce*2 - Beden*2");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);
		studentManager.scheduleClassify(student);
		

	}

}
