package exercise;

public class Circle extends GeometricObject{
	private double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	public Circle(){
		this(1.0);
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	public Circle(double radius,String color,boolean filled){
		this.radius=radius;
		setColor(color);
		setFilled(filled);
	}

    @Override
	public double getArea() {		
		return this.radius*this.radius*Math.PI;
	}
    
    @Override
	public double getPerimeter() {		
		return 2*this.radius*Math.PI;
	}
    
    public double getDiameter(){
    	return 2*radius;
    }    
    
    public void printCirle(){
    	System.out.println("The circle is created"+getDateCreated()
    			+"and the radius is "+radius);
    }

}
