package SkillBuilders;

public class Rectangle {
	private double length, width;
	
	public Rectangle () { //default constructor
		length = 1;
		width = 1;
	}
	
	public Rectangle(double l, double w) { //overloading the default constructor method
		length = l;
		width = w;
	}
	
	//Modifier methods start with set
	public  void setlength(double newL) {
		length = newL;
	}
	
	public void setWidth(double newW) {
		width = newW;
	}
	
	//Accesser methods start with get
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return length;
	}
	
	//Area
	public double area() {
		double rectArea;
		rectArea = length * width;
		return rectArea;
	}
	
	public boolean equals(Object r) {
		Rectangle textObj = (Rectangle)r;
		
		if(textObj.getLength()== length && testObj.getwidth() == width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Object r) {
		Rectangle textObj = (Rectangle)r;
		
		if(length < test.Obj.getLength() || width < test.Obj.getWidth) {
			return(-1);
		}
		
		if(length < test.Obj.getLength() || width < test.Obj.getWidth) {
			return(-1);
		}
	}
	
	public 

}
