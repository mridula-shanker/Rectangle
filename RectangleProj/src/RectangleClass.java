
import java.awt.Rectangle;

public class RectangleClass {

	public static void main(String[] args)
	{
		//look in Rectangle API under constructors to find what Rectangle(5,10,20,30) does
		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println("It creates a rectangle object named box at the coordinate x=5,y=10, with a dimension of width=20 and height=30");
		
		//TODO Move the rectangle (use a method from the API to move the rectangle
		//                          by changing both the x and y coordinates)
		box.setLocation(25, 30);
		System.out.println("It moves the box object to the new coordinate x=25,y=30, with a dimension of width=20 and height=30");
		//TODO Print the following information in the following format
		/*
		 * Expected new x value: ... (print what you expect the x value to be)
		 * Actual x value: ...  (use a method from the API to print the actual x value)
		 * Expected new y value: ... (print what you expect the new y value to be)
		 * Actual y value: ...  (use a method from the API to print the actual y value)
		 */
		System.out.println("Expected x value is 25");
		System.out.println("Expected y value is 30");		
		double xval = box.getX();
		double yval = box.getY();
		System.out.println("Actual x value " + xval);
		System.out.println("Actual y value " + yval);
	}

}