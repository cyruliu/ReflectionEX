package exercise;

public class Rectangle extends GeometricObject{
	private double height;
	private double width;
	
	public Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	
	public Rectangle(double height,double width,String color,
			boolean filled){
		this.height=height;
		this.width=width;
		setColor(color);
		setFilled(filled);		
	}
	
	
	public Rectangle(){
		this(1.0,2.0);
	}
	
	public double getHeight(){
		return height;
	}	
	public void setHeight(double height){
		this.height=height;
	}
	
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	
	@Override
	public double getArea() {
		return this.height*this.width;
	}

	@Override
	public double getPerimeter() {
		return 2*(this.height+this.width);
	}

}
