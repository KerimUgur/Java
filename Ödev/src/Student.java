
public class Student extends User {
	
	String studentSchedule;

	public Student(int id, String name, String userName, String password, String studentSchedule) {
		super(id, name, userName, password);
		this.studentSchedule = studentSchedule;
	}

	public String getStudentSchedule() {
		return studentSchedule;
	}

	public void setStudentSchedule(String studentSchedule) {
		this.studentSchedule = studentSchedule;
	}
	

}
