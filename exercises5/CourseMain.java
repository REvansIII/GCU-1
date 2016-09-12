package exercises5;

import java.util.ArrayList;

public class CourseMain {

	public static void main(String[] args) {
		Course course = new Course("Cst");
		course.addStudent("jane");
		course.addStudent("Jimmy");
		course.addStudent("Tommy");
		
		System.out.println("Present students in " + course.getCourseName()+ " are " + course.toString());
	}

}
 class Course {
	  private String courseName;
	  ArrayList<String> studentList = new ArrayList<>();
	  private int numberOfStudents;
	    
	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	  
	  public void addStudent(String student) {
	    studentList.add(student);
	  }
	  
	  public void dropStudent(String student){
		 studentList.remove(student);
		  
	  }
	  public void getStudents() {
	    studentList.size();
	  }

	  public void getNumberOfStudents() {
	    studentList.get(numberOfStudents);
	  }  

	  public String getCourseName() {
	  	    return courseName;
	  }
	 
	  @Override
	  public String toString(){
		  return "Students: " + studentList.toString();
	  }
	  
}