
public class Appliance {
	private String name;
	private double power;
	private int quantity;
	private int hours;
	
	public Appliance(String name, double power, int quantity, int hours){
		this.name = name;
		this.power = power;
		this.quantity = quantity;
		this.hours = hours;
	}
	
	public double dailyEnergy() {
		return (power * hours * quantity) / 100;
	}
	
	
	//getters

	public String getName() { return name; }
	public double getPower() { return power; }
	public int getQty() { return quantity; }
	public int getHours() { return hours; }

}
