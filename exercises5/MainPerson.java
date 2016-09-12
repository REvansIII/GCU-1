package exercises5;

//exercise 11.2

import java.util.*;

public class MainPerson {

	public static void main(String[] args) {
		Person p1= new Person();
		Student s1 = new Student();
		Employee e1 = new Employee();
		Faculty f1 = new Faculty();
		Staff st1 = new Staff();
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(e1.toString());
		System.out.println(f1.toString());
		System.out.println(st1.toString());
	}

}
class Person {
	  protected String name;
	  protected String address;
	  protected String phoneNumber;
	  protected String email;

	  @Override
	  public String toString() {
	    return "Person";
	  }
	}

	class Student extends Person {
	  public static int FRESHMAN = 1;
	  public static int SOPHOMORE = 2;
	  public static int JUNIOR = 3;
	  public static int SENIOR = 4;

	  protected int status;

	  @Override
	  public String toString() {
	    return "Student";
	  }
	}

	class Employee extends Person {
	  protected String office;
	  protected int salary;
	  protected Calendar dateHired;

	  @Override
	  public String toString() {
	    return "Employee";
	  }
	}

	class Faculty extends Employee {
	  public static int LECTURER = 1;
	  public static int ASSISTANT_PROFESSOR = 2;
	  public static int ASSOCIATE_PROFESSOR = 3;
	  public static int PROFESSOR = 4;

	  protected String officeHours;
	  protected int rank;

	  @Override
	  public String toString() {
	    return "Faculty";
	  }
	}

	class Staff extends Employee {
	  protected String title;

	  @Override
	  public String toString() {
	    return "Staff's title is " + title;
	  }
	}
