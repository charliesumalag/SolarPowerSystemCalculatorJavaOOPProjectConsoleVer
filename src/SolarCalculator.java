import java.util.ArrayList;
public class SolarCalculator {
	private ArrayList<Appliance> appliance = new ArrayList<>();
	
	private int sunlightHours;
	
	public SolarCalculator() {
		this.sunlightHours = 0;
	}
	
	public SolarCalculator(int sunlightHours) {
		this.sunlightHours = sunlightHours;
	}
	
	//setter
    public void setPSH(int PSH) {
        this.sunlightHours = PSH;
    }

	
	
	//add appliance
	public void addAppliance(Appliance app) {
		appliance.add(app);
	}
	
	//view appliance
	public void viewAppliances() {
		System.out.println("--List of Appliances--");
		for(Appliance a: appliance) {
			System.out.println(a.getName() + "-" + a.getPower() + "-" + a.getQty() + "-" + a.getHours() );
		}
	}

}
