package exercises4;

//exercise 10.9 

public class Course {

	private String courseName;
	private String[] students = new String[4];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents--;
	}

	public void push(String value) {
		if (numberOfStudents >= students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}

		students[numberOfStudents++] = value;
	}

	public void clear() {

		String[] students = new String[0];
	}
}
