package rectangle;

import java.util.Scanner;

public class Rectangleroom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char userInput = 'y';
		
			while (userInput == 'y') {
		
			System.out.print("To solve the area of your room, we need to ask some questions! ");
		   System.out.println("Enter the length of the room:");
		   double length = scanner.nextDouble();
		   System.out.println("Enter the width of the room:");
		   double width = scanner.nextDouble();
		   //Area = length*width;
		   
		   double area = length*width;
	          
	       double  perimeter=(2*(length+ width));
		   System.out.println("Area of Rectangle is:"+area);
		   
		   System.out.println("Perimeter of room is:"+perimeter);
		   
		   System.out.println("Do you have another room?");
		   userInput = scanner.next().charAt(0);   
			}
	
		
		// TODO Auto-generated method stub

	}

}
