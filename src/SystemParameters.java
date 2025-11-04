
public class SystemParameters {
	private double PSH;
	private double systemVoltage;
	private double DoD;
	private int daysOfAutonomy;  
	
	
	
	public SystemParameters(double psh, double sysVol, double DoD, int daysOfAutonomy) {
		this.PSH = psh;
		this.systemVoltage = sysVol;
		this.DoD = DoD / 100;
		this.daysOfAutonomy = daysOfAutonomy;
	}
	
	//geetter
	public double getPSH(){ return PSH;}
	public double getSystemVoltage(){ return systemVoltage;}
	public double getDoD() {return DoD;}
	public int getDaysOfAutonomy() { return daysOfAutonomy; }
	
	
	
	//setter
	public void setPSH(double PSH) {
		this.PSH = PSH;
	}
	public void setSystemVoltage(double systemVol) {
		this.systemVoltage = systemVol;
	}
	public void setDoD(double DoD) {
		this.DoD = DoD;
	}
	public void setDaysOfAutonomy(int daysOfAutonomy) {
		this.daysOfAutonomy = daysOfAutonomy; 
	}
}
