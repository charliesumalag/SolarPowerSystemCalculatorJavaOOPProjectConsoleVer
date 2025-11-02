
public class Main {

	public static void main(String[] args) {
		
		
		//creating object for SolarCalculator
		SolarCalculator calc = new SolarCalculator();
		
		
		
		System.out.println("-----------------------------------");
		System.out.println("Solar Power System Calculator");
		System.out.println("-----------------------------------");
		int count = UserInput.getInt("\nHow many appliances do you have : ");
		
		System.out.println("\nLoad Input");	
		System.out.println("-----------------------------------");
		for(int i = 1; i <= count; i++) {
			System.out.println("Appliance " + "#" + i + ":");
			String name = UserInput.getString("Name: ");
			double watts = UserInput.getDouble("Wattage: ");
			int qty = UserInput.getInt("Quantity: ");
			int hoursPerDay = UserInput.getInt("Hours/Day: ");	
			System.out.println("                            ");
			calc.addAppliance(new Appliance(name, watts, qty, hoursPerDay));	
		}
		
		calc.viewAppliances();
		
		System.out.println("\nSystem Parameters");	
		System.out.println("-----------------------------------");
		int PSH = UserInput.getInt("Enter Peak Sun Hours: ");
		calc.setPSH(PSH);

			
		

	}

}
