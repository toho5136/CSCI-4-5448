
public class Buyer {
	// Private Class Variables
	private String buyerType;
	private String vehicleTypeWanted;
	private int buyChance;

	public Buyer(String type, String wanted, int chance){
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
	public int getBuyChance(){
		return this.buyChance;
	}
	public static void main(String[] args) {
	}

}
