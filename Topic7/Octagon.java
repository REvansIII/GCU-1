package exercises6;

//exercise 13.11

import java.util.*;


public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	
   public static void main(String[] args) throws CloneNotSupportedException {
		Octagon oct1 = new Octagon(5.0); 
		Octagon oct2 = (Octagon)oct1.clone();
		
		
		System.out.println("The perimeter of the octagon is " + oct1.getPerimeter() + "  and the area is  " + oct1.getArea());
		System.out.println(oct1.compareTo(oct2));		
	}
	
	double side;
	double area;

	public Octagon() {
		
	}
	
	public Octagon(double side){
		super();
		this.side =side;
	}
	
	void setSide(double side){
		this.side= side;
	}
	
	double getSide(double side){
		return side;
	}
	
	public double getArea(){
		area = (2+4/Math.sqrt(2))*side*side;
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = side * 8;
		return perimeter;
	}
	
	@Override
	
	public Object clone()throws CloneNotSupportedException { 
		return super.clone(); 
	
	}
	
	 @Override 
	 
	 public int compareTo(Octagon o) { 
		 if (area > o.area) 
			 return 1; 
		 else if (area < o.area) 
			 return -1;
		 else return 0;
	 }
	
	
	}


