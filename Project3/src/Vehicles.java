
public class Vehicles {
	// Private Class Variables
	private String ID;
	private String carType;
	private double salesBonus;
	private double repairBonus;
	private double washBonus;
	private double costPrice;
	private double salesPrice;
	private String condition;
	private String cleanliness;
	private int racesWon;
	// Getters
	public String getID() {
		return this.ID;
	}
	public String getCarType() {
		return this.carType;
	}
	public double getSalesBonus() {
		return this.salesBonus;
	}
	public double getRepairBonus() {
		return this.repairBonus;
	}
	public double getWashBonus() {
		return this.washBonus;
	}
	public double getCostPrice() {
		return this.costPrice;
	}
	public double getSalesPrice() {
		return this.salesPrice;
	}
	public String getCondition() {
		return this.condition;
	}
	public String getCleanliness() {
		return this.cleanliness;
	}
	public int getRacesWon() {
		return this.racesWon;
	}
	// Setters
	public void setID(String identity) {
		ID = identity;
	}
	public void setCostPrice(double cost) {
		costPrice = cost;
	}
	public void setSalesPrice(double cost) {
		salesPrice = cost;
	}
	public void setCondition(String conditio) {
		condition = conditio;
	}
	public void setCleanliness(String clean) {
		cleanliness = clean;
	}
	public void setCarType(String type){
		carType = type;
	}
	public void setSalesBonus(double bonus){
		salesBonus = bonus;
	}
	public void setRepairBonus(double bonus){
		repairBonus = bonus;
	}
	public void setWashBonus(double bonus){
		washBonus = bonus;
	}
	public void setRacesWon(int race){
		washBonus = race;
	}
	public static void main(String[] args) {
	}

}
