package SkillBuilders;

public class Circle {
	
	private static final double PI = 3.14;
	private double radius;
	
	public Circle() { //constructor
		radius = 1;
	}
	
	public Circle(double r) { //constructor
		radius = r;	
		
	}
	
	public void setRadius(double newRadius) { //changes radius of circle
		radius = newRadius;
	}
	
	public double getRadius() {
		return(radius);
	}
	
	public double area() {  //returns the area of the circle
		double circleArea;
		
		circleArea = PI * radius * radius;
		return(circleArea);
	}
	
	public double circumference() { //returns the circumference of the circle
		double circleCirc;
		circleCirc = 2 * PI * radius;
		return(circleCirc);
	}
	
	public static void displayAreaFormula() {
		System.out.println("The formula for the area of a circle is a = Pi * r * r");
	}
	
	public 
}
