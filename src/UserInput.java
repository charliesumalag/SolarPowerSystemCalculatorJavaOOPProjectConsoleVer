
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
	        while (true) {
	            try {
	                int value = Integer.parseInt(scan.nextLine());
	                if (value < 0) {
	                    System.out.println("Please enter a non-negative number.");
	                    System.out.print(message);
	                    continue;
	                }
	                return value;
	            } catch (NumberFormatException e) {
	                System.out.println("Please enter a valid number.");
	                System.out.print(message);
	            }
	        }
	    }
	
	//getting double
	 public static double getDouble(String message) {
	        System.out.print(message);
	        while (true) {
	            try {
	                double value = Double.parseDouble(scan.nextLine());
	                if (value < 0) {
	                    System.out.println("Please enter a non-negative number.");
	                    System.out.print(message);
	                    continue;
	                }
	                return value;
	            } catch (NumberFormatException e) {
	                System.out.println("Please enter a valid number.");
	                System.out.print(message);
	            }
	        }
	    }

}
