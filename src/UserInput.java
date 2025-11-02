
import java.util.Scanner;


public class UserInput {

	private static Scanner scan = new Scanner(System.in);
	
	
	public static String getString(String message) {
		System.out.print(message);
		return scan.nextLine();
	}
	
	
	//getting int
	public static int getInt(String message) {
		System.out.print(message);
		while(true) {
			try {
				return Integer.parseInt(scan.nextLine());
			}catch(NumberFormatException e){
				System.out.println("Please enter a valid integer");
			}
		}
		
	}
	
	//getting double
	public static double getDouble(String message) {
		System.out.print(message);
		while(true) {
			try {
				return Double.parseDouble(scan.nextLine());
			}catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
			}
		}
		
	}

}
