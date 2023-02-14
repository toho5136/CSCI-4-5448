import java.util.ArrayList;

public class FNCD {
	// Private Class Variables
	private ArrayList<Mechanic> mechanicStaff = new ArrayList<>();
	private ArrayList<Salesperson> salespersonStaff = new ArrayList<>();
	private ArrayList<Intern> internStaff = new ArrayList<>();
	private ArrayList<PerformanceCars> performanceCarInventory = new ArrayList<>();
	private ArrayList<Cars> carsInventory = new ArrayList<>();
	private ArrayList<Pickups> pickupsInventory = new ArrayList<>();
	private ArrayList<Buyer> buyers = new ArrayList<>();
	private double operatingBudget;
	private String currentDay;
	// Getters
	public ArrayList<Mechanic> getMechanicStaff() {
		return this.mechanicStaff;
	}
	public ArrayList<Salesperson> getSalespersonStaff() {
		return this.salespersonStaff;
	}
	public ArrayList<Intern> getInternStaff() {
		return this.internStaff;
	}
	public ArrayList<PerformanceCars> getPerformanceCarInventory() {
		return this.performanceCarInventory;
	}
	public ArrayList<Cars> getCarsInventory() {
		return this.carsInventory;
	}
	public ArrayList<Pickups> getPickupsInventory() {
		return this.pickupsInventory;
	}
	public ArrayList<Buyer> getBuyer() {
		return this.buyers;
	}
	public double getOperatingBudget() {
		return this.operatingBudget;
	}
	public String getCurrentDay() {
		return this.currentDay;
	}
	// Setters
	public void setOperatingBudget(double budget) {
		operatingBudget = budget;
	}
	// Updater
	public void updateCurrentDay(String day) {
		currentDay = day;
	}
	// Adders
	public void addMechanic(Mechanic newGuy) {
		newGuy = new Mechanic();
		mechanicStaff.add(newGuy);
	}
	public void addSalesperson(Salesperson newGuy) {
		newGuy = new Salesperson();
		salespersonStaff.add(newGuy);
	}
	public void addIntern(Intern newGuy) {
		newGuy = new Intern();
		internStaff.add(newGuy);
	}
	public void addPerformanceCar(PerformanceCars newCar) {
		newCar = new PerformanceCars();
		performanceCarInventory.add(newCar);
	}
	public void addCar(Cars newCar) {
		newCar = new Cars();
		carsInventory.add(newCar);
	}
	public void addPickups(Pickups newCar) {
		newCar = new Pickups();
		pickupsInventory.add(newCar);
	}
	// Creator
	public void createBuyers() {
		
	}
	// Other Functions
	public void opening() {
		
	}
	public void washing() {
		
	}
	public void repairing() {
		
	}
	public void selling() {
		
	}
	public void ending() {
		
	}
	public static void main(String[] args) {
	}

}
