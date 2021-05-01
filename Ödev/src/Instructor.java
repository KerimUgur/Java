
public class Instructor extends User {
	
	String instructorSchedule;

	public Instructor(int id, String name, String userName, String password, String instructorSchedule) {
		super(id, name, userName, password);
		this.instructorSchedule = instructorSchedule;
	}

	public String getInstructorSchedule() {
		return instructorSchedule;
	}

	public void setInstructorSchedule(String instructorSchedule) {
		this.instructorSchedule = instructorSchedule;
	}
	

}
