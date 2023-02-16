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
	private double addedFunds = 0;
	private int currentDay = 0;
	private ArrayList<Mechanic> departedMStaff = new ArrayList<>();
	private ArrayList<Salesperson> departedSStaff = new ArrayList<>();
	private ArrayList<Intern> departedIStaff = new ArrayList<>();
	private int perfID = 0;
	private int carID = 0;
	private int pickupID = 0;
	private int mechNames = 0;
	private int salesNames = 0;
	private int internNames = 0;
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
	public int getCurrentDay() {
		return this.currentDay;
	}
	// Setters
	public void setOperatingBudget(double budget) {
		operatingBudget = budget;
	}
	// Updater
	public void updateCurrentDay() {
		currentDay += 1;
	}
	// Adders
	public void addMechanic(Mechanic newGuy) {
		mechanicStaff.add(newGuy);
	}
	public void addSalesperson(Salesperson newGuy) {
		salespersonStaff.add(newGuy);
	}
	public void addIntern(Intern newGuy) {
		internStaff.add(newGuy);
	}
	public void addPerformanceCar(PerformanceCars newCar) {
		performanceCarInventory.add(newCar);
	}
	public void addCar(Cars newCar) {
		carsInventory.add(newCar);
	}
	public void addPickups(Pickups newCar) {
		pickupsInventory.add(newCar);
	}
	// Creator
	public void createBuyers() {
		
	}
	public int createVehicleID(){
		return 0;
	}
	// Other Functions
	public void opening() {
		//First day, need to add workers, cars, and set budget
		if (currentDay == 0){
			for (int i = 0; i < 3; i++){
				Mechanic mech = new Mechanic("Mechanic" + String.valueOf(mechNames));
				this.addMechanic(mech);
				mechNames += 1;

				Salesperson sale = new Salesperson("Salesperson" + String.valueOf(salesNames));
				this.addSalesperson(sale);
				salesNames += 1;

				Intern intern = new Intern("Intern" + String.valueOf(internNames));
				this.addIntern(intern);
				internNames += 1;
			}

			for (int i = 0; i < 4; i++){
				PerformanceCars perf = new PerformanceCars("PerformanceCar" + String.valueOf(perfID));
				this.addPerformanceCar(perf);
				perfID += 1;

				Pickups pick = new Pickups("Pickup" + String.valueOf(pickupID));
				this.addPickups(pick);
				pickupID += 1;

				Cars car = new Cars("Car" + String.valueOf(carID));
				this.addCar(car);
				carID += 1;
			}
			this.setOperatingBudget(250000);
			System.out.println("opened");
			performanceCarInventory.remove(0);
		}
		else {
			if (operatingBudget < 0){
				System.out.println("Operating budget is below 0. Adding funds.");
				while (operatingBudget < 0){
					operatingBudget += 250000.0;
					addedFunds += 250000.0;
				}
				System.out.println("Total funds added so far: " + addedFunds);
			}
			//Check to see if intern staff is 3
			if (internStaff.size() < 3){
				int limit = 3 - internStaff.size();
				
				for (int i = 0; i < limit; i++){
					Intern intern = new Intern("Intern" + String.valueOf(internNames));
					System.out.println("Hiring intern " + "Intern" + String.valueOf(internNames));
					this.addIntern(intern);
					internNames += 1;
				}
			}

			//Check to see if performance cars inventory is 4
			if (performanceCarInventory.size() < 4){
				int limit = 4 - performanceCarInventory.size();

				for (int i = 0; i < limit; i++){
					PerformanceCars perf = new PerformanceCars("PerformanceCar" + String.valueOf(perfID));
					System.out.println("Buying car: " + perf.getID());
					this.addPerformanceCar(perf);
					perfID += 1;

					operatingBudget = operatingBudget - perf.getCostPrice();
				}
			}

			//Check to see if pickups inventory is 4
			if (pickupsInventory.size() < 4){
				int limit = 4 - pickupsInventory.size();

				for (int i = 0; i < limit; i++){
					Pickups pickup = new Pickups("Pickup" + String.valueOf(pickupID));
					System.out.println("Buying car:" + pickup.getID());
					this.addPickups(pickup);
					pickupID += 1;

					operatingBudget = operatingBudget - pickup.getCostPrice();
				}
			}

			//Check to see if cars inventory is 4
			if (carsInventory.size() < 4){
				int limit = 4 - carsInventory.size();

				for (int i = 0; i < limit; i++){
					Cars car = new Cars("Car" + String.valueOf(carID));
					System.out.println("Buying car:" + car.getID());
					this.addCar(car);
					carID += 1;

					operatingBudget = operatingBudget - car.getCostPrice();
				}
			}
		}
		currentDay += 1;
	}
	public void washing() {
		
	}
	public void repairing() {
		
	}
	public void selling() {
		
	}
	public void ending() {
		int counterM = 0; //counter to create print table
		int counterS = 0;
		int counterI = 0;
		int counterDM = 0;
		int counterDS = 0;
		int counterDI = 0;
		for (int i = 0; i < mechanicStaff.size(); i++) {
			// Pay each mechanic
			//mechanicStaff.set(i, );
			counterM = counterM + 1;
		}
		for (int i = 0; i < salespersonStaff.size(); i++) {
			// Pay each salesperson
			counterS = counterS + 1;
		}
		for (int i = 0; i < internStaff.size(); i++) {
			// Pay each intern
			counterI = counterI + 1;
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
			counterDM = counterDM + 1;
		}
		for (int i = 0; i < departedSStaff.size(); i++) {
			counterDS = counterDS + 1;
		}
		for (int i = 0; i < departedIStaff.size(); i++) {
			counterDI = counterDI + 1;
		}
		
		final Object[][] tableM = new String[counterM][];
		final Object[][] tableS = new String[counterS][];
		final Object[][] tableI = new String[counterI][];
		final Object[][] tableDM = new String[counterDM][];
		final Object[][] tableDS = new String[counterDS][];
		final Object[][] tableDI = new String[counterDI][];
		for (int i = 0; i < mechanicStaff.size(); i++) { //adds all working mechanics to table
			tableM[i] = new String[] {mechanicStaff.get(i).getUniqueName(), Integer.toString(mechanicStaff.get(i).getDaysWorked()), String.valueOf(mechanicStaff.get(i).getNormalPay()), String.valueOf(mechanicStaff.get(i).getBonusPay()), "Working"};
		}
		 for (int i = 0; i < salespersonStaff.size(); i++) { //adds all working salesperson to table
			tableS[i] = new String[] {salespersonStaff.get(i).getUniqueName(), Integer.toString(salespersonStaff.get(i).getDaysWorked()), String.valueOf(salespersonStaff.get(i).getNormalPay()), String.valueOf(salespersonStaff.get(i).getBonusPay()), "Working"};
		}
		for (int i = 0; i < internStaff.size(); i++) { //adds all working interns to table
			tableI[i] = new String[] {internStaff.get(i).getUniqueName(), Integer.toString(internStaff.get(i).getDaysWorked()), String.valueOf(internStaff.get(i).getNormalPay()), String.valueOf(internStaff.get(i).getBonusPay()), "Working"};
		}
		for (int i = 0; i < departedMStaff.size(); i++) { //adds all working interns to table
			tableDM[i] = new String[] {departedMStaff.get(i).getUniqueName(), Integer.toString(departedMStaff.get(i).getDaysWorked()), String.valueOf(departedMStaff.get(i).getNormalPay()), String.valueOf(departedMStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < departedSStaff.size(); i++) { //adds all working interns to table
			tableDS[i] = new String[] {departedSStaff.get(i).getUniqueName(), Integer.toString(departedSStaff.get(i).getDaysWorked()), String.valueOf(departedSStaff.get(i).getNormalPay()), String.valueOf(departedSStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < departedIStaff.size(); i++) { //adds all working interns to table
			tableDI[i] = new String[] {departedIStaff.get(i).getUniqueName(), Integer.toString(departedIStaff.get(i).getDaysWorked()), String.valueOf(departedIStaff.get(i).getNormalPay()), String.valueOf(departedIStaff.get(i).getBonusPay()), "Quit"};
		}
		for (final Object[] row : tableM) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableS) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableI) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableDM) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableDS) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableDI) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		
	}
	public static void main(String[] args) {
		FNCD sim = new FNCD();

		sim.opening();
		sim.opening();
		sim.ending();
		/* 
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
		*/
	}

}
