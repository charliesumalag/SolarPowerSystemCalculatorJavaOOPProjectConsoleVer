import java.util.ArrayList;
public class SolarCalculator {
	private ArrayList<Appliance> appliance = new ArrayList<>();
	private SystemParameters parameters;
	
		
	
	public void setSystemParameters(SystemParameters parameters) {
	    this.parameters = parameters;
	}
	
	//add appliance
	public void addAppliance(Appliance a) {
		appliance.add(a);
	}
	
	 public double computeTotalDailyEnergy() {
	        double total = 0;
	        for (Appliance a : appliance) {
	            total += a.getQty() * a.getPower() * a.getHours();
	        }
	        return total;
	 }
	 
	 
	 
	 
	 public double computeRequiredSolarPanelEnergy() {
	        if (parameters == null) return 0;
	        double totalLoad = computeTotalDailyEnergy();
	        return (totalLoad / parameters.getPSH()) / 0.8; 
	 }
	
	
	 
	 public double computeBatteryCapacityWh() {
	        if (parameters == null) return 0;
	        double totalLoad = computeTotalDailyEnergy();
	        double energyNeeded = totalLoad * parameters.getDaysOfAutonomy();
	        return energyNeeded / parameters.getDoD(); 
	 }

	 
	 
	 public double computeBatteryCapacityAh() {
		    if (parameters == null) return 0;
		    double batteryWh = computeBatteryCapacityWh();
		    return batteryWh / parameters.getSystemVoltage();
	}
	
	 
	
	 public double computeRecommendedInverterSize() {
		    if (parameters == null) return 0;
		    double panelPower = computeRequiredSolarPanelEnergy(); // or computeRequiredSolarPanelPower if you rename
		    // Use panelPower as proxy for average system power; add margin
		    return panelPower * 1.25;
	}
	 
	 
	 public double computeChargeControllerSize() {
		    if (parameters == null) return 0;
		    double panelPower = computeRequiredSolarPanelEnergy();
		    double systemVoltage = parameters.getSystemVoltage();
		    if (systemVoltage == 0) return 0;
		    double current = panelPower / systemVoltage;
		    return current * 1.25; // 25% margin
		}
	 
	 
	 //view appliance
	 public void viewAppliances() {

	        System.out.println("-----------------------------------------------------");
	        System.out.println("       SOLAR POWER SYSTEM CALCULATION SUMMARY       ");
	        System.out.println("-----------------------------------------------------");

	        // Section 1: Appliances
	        System.out.println("-APPLIANCES-");
	        for (Appliance a : appliance) {
	            double dailyEnergy = a.dailyEnergy();
	            System.out.print(a.getQty() + " x " + a.getName());
	            System.out.println(" @ " + String.format("%.2f", a.getPower()) + " W"
	                    + " = " + String.format("%.2f", dailyEnergy) + " Wh"
	                    + " (" + a.getHours() + " hrs/day)");
	        }

	        // Section 2: System Parameters
	        System.out.println("\n-SYSTEM PARAMETERS-");
	        System.out.println("Peak Sun Hours (PSH): " + String.format("%.2f", parameters.getPSH()));
	        System.out.println("System Voltage: " + String.format("%.2f", parameters.getSystemVoltage()) + " V");
	        System.out.println("Depth of Discharge (DoD): " + String.format("%.2f", parameters.getDoD()));
	        System.out.println("Days of Autonomy: " + parameters.getDaysOfAutonomy());

	        // Section 3: Results
	        System.out.println("\n-RESULTS-");
	        if (parameters != null) {
	            System.out.println("Total Daily Energy Consumption: " + String.format("%.2f", computeTotalDailyEnergy()) + " Wh/day");
	            System.out.println("Required Solar Panel Power: " + String.format("%.2f", computeRequiredSolarPanelEnergy()) + " W");
	            System.out.println("Required Battery Capacity: " + String.format("%.2f", computeBatteryCapacityWh()) + " Wh");
	            System.out.println("Battery Capacity: " + String.format("%.2f", computeBatteryCapacityAh()) + " Ah");
	            System.out.println("Recommended Inverter Size: " + String.format("%.2f", computeRecommendedInverterSize()) + " W");
	            System.out.println("Recommended Charge Controller: " + String.format("%.2f", computeChargeControllerSize()) + " A");
	        }

	        System.out.println("-----------------------------------------------------");
	    }

}
