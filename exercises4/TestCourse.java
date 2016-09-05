package exercises4;

public class TestCourse {

	public static void main(String[] args) {
		 Course course1 = new Course("Java Intro");
		    
		    course1.addStudent("Peter Jones");
		    course1.addStudent("Brian Smith");
		    course1.addStudent("Anne Kennedy");
		    
		    System.out.println("Number of students in course1 prior to change " + 
		     course1.getNumberOfStudents())	;
		    String[] mystudents = course1.getStudents();
		    for (int i = 0; i < course1.getNumberOfStudents(); i++)
			      System.out.print(mystudents[i] + ", ");
		    
		    course1.dropStudent("Anne Kennedy");
		    
		    
		    System.out.println("\nNumber of students in course1 following change "
		      + course1.getNumberOfStudents());
		   String [] students = course1.getStudents();
		    for (int i = 0; i < course1.getNumberOfStudents(); i++)
		      System.out.print(students[i] + ", ");
		    
		  }
		

	}


