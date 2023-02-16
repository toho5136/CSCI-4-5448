
public class Buyer {
	// Private Class Variables
	private String buyerType;
	private String vehicleTypeWanted;
	private double buyChance;

	public Buyer(String type, String wanted, double chance){
		buyerType = type;
		vehicleTypeWanted = wanted;
		buyChance = chance;
	}
	// Getters
	public String getBuyerType() {
		return this.buyerType;
	}
	public String getVehicleTypeWanted() {
		return this.vehicleTypeWanted;
	}
	public double getBuyChance(){
		return this.buyChance;
	}
	public static void main(String[] args) {
	}

}
