package exercises6;

//exercise 13.13

import java.util.ArrayList;



public class CourseClone implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		CourseClone course = new CourseClone("Cst");
		CourseClone course2= (CourseClone)course.clone();
		
		course.addStudent("jane");
		course.addStudent("Jimmy");
		course.addStudent("Tommy");
		
		System.out.println(course.toString() + " EQUALS CLONE  " + course2.toString());
	}


	public CourseClone(String courseName) {
	    this.courseName = courseName;
	  }	  
	  
	
	private String courseName;
	  ArrayList<String> studentList = new ArrayList<>();
	  private int numberOfStudents;
	    
	  
	  public CourseClone addStudent(String student) {
	    studentList.add(student);
	    return null;
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
	  
	  @Override 
	  public Object clone()throws CloneNotSupportedException { 
			return super.clone(); 
		
		}
		
	  
	  
}

