package exercise;

public class TestCircleRectangle {

	public static void main(String[] args) {
		Circle circle=new Circle(2);
		System.out.println("A circle"+circle.toString());
		System.out.println("The radius is "+circle.getRadius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The perimeter is "+circle.getPerimeter());
		
		Rectangle rectangle=new Rectangle(3,4);
		System.out.println("\nA rectangle"+rectangle.toString());
		System.out.println("The area is "+rectangle.getArea());
		System.out.println("The perimeter is "+rectangle.getPerimeter());
	
	
	}

}
