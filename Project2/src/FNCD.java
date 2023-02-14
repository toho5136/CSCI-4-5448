import java.util.ArrayList;
import java.util.Random;
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
	private ArrayList<Mechanic> departedMStaff = new ArrayList<>();
	private ArrayList<Salesperson> departedSStaff = new ArrayList<>();
	private ArrayList<Intern> departedIStaff = new ArrayList<>();
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
		int counter = 0; //counter to create print table
		for (int i = 0; i < mechanicStaff.size(); i++) {
			// Pay each mechanic
			//mechanicStaff.set(i, );
			counter = counter + 1;
		}
		for (int i = 0; i < salespersonStaff.size(); i++) {
			// Pay each salesperson
			counter = counter + 1;
		}
		for (int i = 0; i < internStaff.size(); i++) {
			// Pay each intern
			counter = counter + 1;
		}
		Random ran = new Random();
		int mechanicQuitChance = ran.nextInt(10) + 1; // if mechanicQuitChance = 1; a mechanic quits
		int salespersonQuitChance = ran.nextInt(10) + 1; // if salespersonQuitChance = 1; a salesperson quits
		int internQuitChance = ran.nextInt(10) + 1; // if internQuitChance = 1; a intern quits
		if (mechanicQuitChance == 1) { //mechanic quits
			departedMStaff.add(mechanicStaff.get(0));
			mechanicStaff.remove(0);
		}
		if (salespersonQuitChance == 1) { //salesperson quits
			departedSStaff.add(salespersonStaff.get(0));
			salespersonStaff.remove(0);
		}
		if (internQuitChance == 1) { //intern quits
			departedIStaff.add(internStaff.get(0));
			internStaff.remove(0);
		}
		for (int i = 0; i < departedMStaff.size(); i++) {
			counter = counter + 1;
		}
		for (int i = 0; i < departedSStaff.size(); i++) {
			counter = counter + 1;
		}
		for (int i = 0; i < departedIStaff.size(); i++) {
			counter = counter + 1;
		}
		final Object[][] table = new String[counter][];
		for (int i = 0; i < mechanicStaff.size(); i++) { //adds all working mechanics to table
			table[i] = new String[] {mechanicStaff.get(i).newMechanic.getUniqueName(), Integer.toString(mechanicStaff.get(i).newMechanic.getDaysWorked()), String.valueOf(mechanicStaff.get(i).newMechanic.getNormalPay()), String.valueOf(mechanicStaff.get(i).newMechanic.getBonusPay()), "Working"};
		}
	}
	public static void main(String[] args) {
		FNCD simulation = new FNCD();
		simulation.setOperatingBudget(500000); //Starting off budget at 500k
		//for loop to simulate 30 days
		for (int i = 0; i < 30; i++) {
			if (i != 6 | i != 13 | i != 20 | i != 27) { //FNCD does not open on Sundays, day 0 starts on Monday
				simulation.opening();
				simulation.washing();
				simulation.repairing();
				simulation.selling();
				simulation.ending();
			}
		}
	}

}
