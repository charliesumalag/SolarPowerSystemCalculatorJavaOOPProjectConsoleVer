public class Main {

    public static void main(String[] args) {
    	

        printHeader("SOLAR POWER SYSTEM CALCULATOR");

        // Step 1: Create calculator
        SolarCalculator calc = new SolarCalculator();

        // Step 2: Input appliances
        inputAppliances(calc);

        // Step 3: Input system parameters
        SystemParameters parameters = inputSystemParameters();
        calc.setSystemParameters(parameters);
        
        // Step 4: Display results
        calc.viewAppliances();
        
      
        printFooter("End of Calculation");
    }

    // ------------------- Helper Methods -------------------

    private static void printHeader(String title) {
    	 System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("  " + title + "        ");
        System.out.println("-----------------------------------");
    }

    private static void printFooter(String title) {
        System.out.println("--------------------------------------");
        System.out.println(" " + title + "        ");
     
    }

    private static void inputAppliances(SolarCalculator calc) {
        int count = UserInput.getInt("\nHow many appliances do you have: ");
        System.out.println("\nLoad Input");    
        System.out.println("-----------------------------------");

        for (int i = 1; i <= count; i++) {
            System.out.println("Appliance #" + i + ":");
            String name = UserInput.getString("Name: ");
            double watts = UserInput.getDouble("Power (W): ");
            int qty = UserInput.getInt("Quantity: ");
            int hoursPerDay = UserInput.getInt("Daily Usage (hours/day): ");    
            System.out.println();
            calc.addAppliance(new Appliance(name, watts, qty, hoursPerDay));
        }
    }

    private static SystemParameters inputSystemParameters() {
        System.out.println("\nSystem Parameters");    
        System.out.println("-----------------------------------");

        double psh = UserInput.getDouble("Peak Sun Hours (PSH, hours/day): ");
        double systemVoltage = UserInput.getDouble("System Voltage (V): ");
        double dod = UserInput.getDouble("Depth of Discharge (%): ");
        int days = UserInput.getInt("Days of Autonomy (backup days): ");
        System.out.println();

        return new SystemParameters(psh, systemVoltage, dod, days);
    }
}
