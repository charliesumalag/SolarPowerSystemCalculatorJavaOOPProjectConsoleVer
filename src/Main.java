
public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
			System.out.println("Solar Power System Calculator");
			System.out.println("-----------------------------------");
			int count = UserInput.getInt("How many appliances do you have? : ");
			
			for(int i = 1; i <= count; i++) {
				System.out.println("\nAppliance " + i + ":");
				String name = UserInput.getString("Enter appliance name: ");
				double watts = UserInput.getDouble("Enter Wattage: ");
				int qty = UserInput.getInt("Enter quantity: ");
				int hoursPerDay = UserInput.getInt("Enter hours per day: ");
				
			}
		
		
		

	}

}
