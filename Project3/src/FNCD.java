import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
public class FNCD {
	// Private Class Variables
	private ArrayList<Mechanic> mechanicStaff = new ArrayList<>();
	private ArrayList<Salesperson> salespersonStaff = new ArrayList<>();
	private ArrayList<Intern> internStaff = new ArrayList<>();
	private ArrayList<Driver> driverStaff = new ArrayList<>(); // driver staff array list
	private ArrayList<PerformanceCars> performanceCarInventory = new ArrayList<>();
	private ArrayList<Cars> carsInventory = new ArrayList<>();
	private ArrayList<Pickups> pickupsInventory = new ArrayList<>();
	private ArrayList<ElectricCars> electricCarsInventory = new ArrayList<>(); // electric car inventory
	private ArrayList<MonsterTrucks> monsterTrucksInventory = new ArrayList<>(); // monster truck inventory
	private ArrayList<Motorcycles> motorcyclesInventory = new ArrayList<>(); // motorcycles inventory
	private ArrayList<Buyer> buyers = new ArrayList<>();
	private ArrayList<Vehicles> soldVehicles = new ArrayList<>();
	private double operatingBudget;
	private double totalSales;
	private double addedFunds = 0;
	private int currentDay = 1;
	private ArrayList<Mechanic> departedMStaff = new ArrayList<>();
	private ArrayList<Salesperson> departedSStaff = new ArrayList<>();
	private ArrayList<Intern> departedIStaff = new ArrayList<>();
	private ArrayList<Driver> departedDStaff = new ArrayList<>(); //driver staff departed
	private int perfID = 0;
	private int carID = 0;
	private int pickupID = 0;
	private int electricID = 0; // electric car ID
	private int monsterID = 0; // monstertruck ID
	private int motorcycleID = 0; // motorcycle ID
	private int mechNames = 0;
	private int salesNames = 0;
	private int internNames = 0;
	private int driverNames = 0; // driver names
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
	public ArrayList<Driver> getDriverStaff() { // get driver staff
		return this.driverStaff;
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
	public ArrayList<ElectricCars> getElectricCarsInventory() { // get electric car inventory
		return this.electricCarsInventory;
	}
	public ArrayList<MonsterTrucks> getMonsterTrucksInventory() { // get monster truck inventory
		return this.monsterTrucksInventory;
	}
	public ArrayList<Motorcycles> getMotorcyclesInventory() { // get motorcycle inventory
		return this.motorcyclesInventory;
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
	public void addDriver(Driver newGuy) { // add new driver
		driverStaff.add(newGuy);
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
	public void addElectricCar(ElectricCars newCar) { // add new electric car
		electricCarsInventory.add(newCar);
	}
	public void addMonsterTruck(MonsterTrucks newCar) { // add new monster truck
		monsterTrucksInventory.add(newCar);
	}
	public void addMotorcycle(Motorcycles newCar) { // add new motorcycle
		motorcyclesInventory.add(newCar);
	}
	public void addBuyer(Buyer newBuyer){
		buyers.add(newBuyer);
	}
	// Creator

	/* Creates the ArrayList of buyers to be used each day for salepersons.
	 * Randomizes all buyers traits (vehiclesWanted/buyChance)
	 * --------------------------------------------------------------------
	 * @param  -> none
	 * @return -> void
	 */
	public void createBuyers() {
		buyers.clear();
		// If the current day is a Satuday or a Sunday
		if (currentDay % 7 == 0 || currentDay % 6 == 0){
			for (int i = 0; i < 2; i++){
				int buyerRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				int wantedRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);

				// Just looking
				if (buyerRoll == 1){
					// Wants Performance
					if (wantedRoll == 1){
						Buyer buy = new Buyer("Just Looking", "PerformanceCars", 10);
						this.addBuyer(buy);
					}
					// Wants Pickups
					else if (wantedRoll == 2){
						Buyer buy = new Buyer("Just Looking", "Pickups", 10);
						this.addBuyer(buy);
					}
					// Wants Cars
					else {
						Buyer buy = new Buyer("Just Looking", "Cars", 10);
						this.addBuyer(buy);
					}
				}
				// Wants One
				else if (buyerRoll == 2){
					// Wants Performance
					if (wantedRoll == 1){
						Buyer buy = new Buyer("Wants One", "PerformanceCars", 40);
						this.addBuyer(buy);
					}
					// Wants Pickups
					else if (wantedRoll == 2){
						Buyer buy = new Buyer("Wants One", "Pickups", 40);
						this.addBuyer(buy);
					}
					// Wants Cars
					else {
						Buyer buy = new Buyer("Wants One", "Cars", 40);
						this.addBuyer(buy);
					}
				}
				else {
					// Wants Performance
					if (wantedRoll == 1){
						Buyer buy = new Buyer("Needs One", "PerformanceCars", 70);
						this.addBuyer(buy);
					}
					// Wants Pickups
					else if (wantedRoll == 2){
						Buyer buy = new Buyer("Needs One", "Pickups", 70);
						this.addBuyer(buy);
					}
					// Wants Cars
					else {
						Buyer buy = new Buyer("Needs One", "Cars", 70);
						this.addBuyer(buy);
					}
				}
			}
			for (int i = 0; i < 6; i++){
				int roll = ThreadLocalRandom.current().nextInt(1, 2 + 1);
				
				if (roll == 1){
					int buyerRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);
					int wantedRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);

					// Just looking
					if (buyerRoll == 1){
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Just Looking", "PerformanceCars", 10);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Just Looking", "Pickups", 10);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Just Looking", "Cars", 10);
							this.addBuyer(buy);
						}
					}
					// Wants One
					else if (buyerRoll == 2){
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Wants One", "PerformanceCars", 40);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Wants One", "Pickups", 40);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Wants One", "Cars", 40);
							this.addBuyer(buy);
						}
					}
					else {
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Needs One", "PerformanceCars", 70);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Needs One", "Pickups", 70);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Needs One", "Cars", 70);
							this.addBuyer(buy);
						}
					}
				}
			}
		}
		// If the current day is a weekday
		else {
			for (int i = 0; i < 5; i++){
				int roll = ThreadLocalRandom.current().nextInt(1, 2 + 1);
				
				if (roll == 1){
					int buyerRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);
					int wantedRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);

					// Just looking
					if (buyerRoll == 1){
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Just Looking", "PerformanceCars", 10);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Just Looking", "Pickups", 10);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Just Looking", "Cars", 10);
							this.addBuyer(buy);
						}
					}
					// Wants One
					else if (buyerRoll == 2){
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Wants One", "PerformanceCars", 40);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Wants One", "Pickups", 40);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Wants One", "Cars", 40);
							this.addBuyer(buy);
						}
					}
					else {
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Needs One", "PerformanceCars", 70);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Needs One", "Pickups", 70);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Needs One", "Cars", 70);
							this.addBuyer(buy);
						}
					}
				}
			}
		}
	}
	public int createVehicleID(){
		return 0;
	}

	/* Opening function first checks to see what day it is. If it is the first day,
	 * it will populate all of the staff lists, vehicle lists as well as set the 
	 * operating budget to $500,000. If it is not the first day, it will make sure 
	 * the vehicle inventories are full and buy new ones if needed. Then it will ensure
	 * the intern staff is full and hire new ones if necessary.
	 * --------------------------------------------------------------------------------
	 * @param  -> none
	 * @return -> void
	 */
	public void opening() {
		System.out.println("Day: " + currentDay);
		//First day, need to add workers, cars, and set budget
		if (currentDay == 1){
			/* Example of identity: multiple mechanics objects are created
			 * in this for loop and added to an ArrayList
			 */
			for (int i = 0; i < 3; i++){
				// Initialize mechanic staff list
				Mechanic mech = new Mechanic("Mechanic" + String.valueOf(mechNames));
				this.addMechanic(mech);
				mechNames += 1;

				// Initialize salesperson staff list
				Salesperson sale = new Salesperson("Salesperson" + String.valueOf(salesNames));
				this.addSalesperson(sale);
				salesNames += 1;

				// Initialize intern staff list
				Intern intern = new Intern("Intern" + String.valueOf(internNames));
				this.addIntern(intern);
				internNames += 1;
				// Initialize driver staff list
				Driver driver = new Driver("Driver" + String.valueOf(driverNames));
				this.addDriver(driver);
				driverNames += 1;
			}

			for (int i = 0; i < 4; i++){
				// Initialize performance car inventory
				PerformanceCars perf = new PerformanceCars("PerformanceCar" + String.valueOf(perfID));
				this.addPerformanceCar(perf);
				perfID += 1;

				// Initialize pickups inventory
				Pickups pick = new Pickups("Pickup" + String.valueOf(pickupID));
				this.addPickups(pick);
				pickupID += 1;

				// Initialize cars inventory
				Cars car = new Cars("Car" + String.valueOf(carID));
				this.addCar(car);
				carID += 1;
				
				// Initialize electric cars inventory
				ElectricCars Ecar = new ElectricCars("ElectricCar" + String.valueOf(electricID));
				this.addElectricCar(Ecar);
				electricID += 1;
				
				// Initialize monster truck inventory
				MonsterTrucks truck = new MonsterTrucks("MonsterTruck" + String.valueOf(monsterID)); // need to add stage name
				this.addMonsterTruck(truck);
				monsterID += 1;
				
				// Initialize motorcycles inventory
				Motorcycles motorcycle = new Motorcycles("Motorcycle" + String.valueOf(motorcycleID));
				this.addMotorcycle(motorcycle);
				motorcycleID += 1;
			}
			this.setOperatingBudget(500000);
			totalSales = 0;
			System.out.println("opened");
		}
		else {
			// If not first day, check too see staff list and vehicle inventory is full
			if (operatingBudget < 0){
				System.out.println("Operating budget is below 0. Adding funds.");
				while (operatingBudget < 0){
					operatingBudget += 250000.0;
					addedFunds += 250000.0;
				}
				System.out.println("Total funds added so far: " + addedFunds);
			}
			// Check to see if intern staff is 3
			if (internStaff.size() < 3){
				int limit = 3 - internStaff.size();
				
				for (int i = 0; i < limit; i++){
					Intern intern = new Intern("Intern" + String.valueOf(internNames));
					System.out.println("Hiring intern " + "Intern" + String.valueOf(internNames));
					this.addIntern(intern);
					internNames += 1;
				}
			}

			// Check to see if performance cars inventory is 4
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

			// Check to see if pickups inventory is 4
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

			// Check to see if cars inventory is 4
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
			
			// Check to see if electric cars inventory is 4
			if (electricCarsInventory.size() < 4){
				int limit = 4 - electricCarsInventory.size();

				for (int i = 0; i < limit; i++){
					ElectricCars Ecar = new ElectricCars("ElectricCar" + String.valueOf(electricID));
					System.out.println("Buying car:" + Ecar.getID());
					this.addElectricCar(Ecar);
					electricID += 1;

					operatingBudget = operatingBudget - Ecar.getCostPrice();
				}
			}
			
			// Check to see if monster trucks inventory is 4
			if (monsterTrucksInventory.size() < 4){
				int limit = 4 - monsterTrucksInventory.size();

				for (int i = 0; i < limit; i++){
					MonsterTrucks truck = new MonsterTrucks("MonsterTruck" + String.valueOf(monsterID)); // need to add stage name
					System.out.println("Buying car:" + truck.getID());
					this.addMonsterTruck(truck);
					monsterID += 1;

					operatingBudget = operatingBudget - truck.getCostPrice();
				}
			}
			
			// Check to see if motorcycles inventory is 4
			if (motorcyclesInventory.size() < 4){
				int limit = 4 - motorcyclesInventory.size();

				for (int i = 0; i < limit; i++){
					Motorcycles motorcycle = new Motorcycles("Motorcycle" + String.valueOf(motorcycleID)); // need to add stage name
					System.out.println("Buying car:" + motorcycle.getID());
					this.addMotorcycle(motorcycle);
					motorcycleID += 1;

					operatingBudget = operatingBudget - motorcycle.getCostPrice();
				}
			}
		}
	}
	public void washing() {
		//Iterate over all 3 interns
		for (int i = 0; i < 3; i++){
			int vehiclesWashed = 0;

			// Iterate over all three vehicles lists (0-3:performance, 4-7:pickups, 8-11:cars, 12-15:electric, 16-19:monster, 20-23:motorcycle)
			for (int j = 0; j < 24; j++){
				// check if reached limit
				if (vehiclesWashed == 2){
					break;
				}
				// Iterate through perforance car inventory
				if (j < 4){
					// Find dirty vehicle
					if (performanceCarInventory.get(j).getCleanliness() == "Dirty"){
						String result = internStaff.get(i).getWashMethod().washCar("Dirty");

						// Successful wash to clean
						if (result == "Clean"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() 
							+ " clean!");
							performanceCarInventory.get(j).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						// Successful wash to sparkling
						if (result == "Sparkling"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() 
							+ " sparkling!($" + performanceCarInventory.get(j).getWashBonus() + " bonus)");

							// Pay bonus to intern
							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + performanceCarInventory.get(j).getWashBonus());
							operatingBudget -= performanceCarInventory.get(j).getWashBonus();
							performanceCarInventory.get(j).setCleanliness("Sparkling");
							vehiclesWashed += 1;
						}
						if (result == "Broken"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() 
							+ " Broken");
							performanceCarInventory.get(j).setCondition("Broken");
						}
					}
				}

				// Iterate through pickups inventory
				else if (j >= 4 && j < 8){
					// Find dirty vehicle
					if (pickupsInventory.get(j-4).getCleanliness() == "Dirty"){
						String result = internStaff.get(i).getWashMethod().washCar("Dirty");
						// Successful wash to clean
						if (result == "Clean"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() 
							+ " clean!");
							pickupsInventory.get(j-4).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						// Successful wash to sparkling
						if (result == "Sparkling"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() 
							+ " sparkling!($" + pickupsInventory.get(j-4).getWashBonus() + " bonus)");

							// Pay bonus to intern
							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + pickupsInventory.get(j-4).getWashBonus());
							operatingBudget -= pickupsInventory.get(j-4).getWashBonus();
							pickupsInventory.get(j-4).setCleanliness("Sparkling");
							vehiclesWashed += 1;
						}
						if (result == "Broken"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() 
							+ " Broken");
							pickupsInventory.get(j-4).setCondition("Broken");
						}
					}
				}
				// Iterate through cars inventory
				else  if (j >= 8 && j < 12){
					if (carsInventory.get(j-8).getCleanliness() == "Dirty"){
						String result = internStaff.get(i).getWashMethod().washCar("Dirty");

						// Successful wash to clean
						if (result == "Clean"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() 
							+ " clean!");
							carsInventory.get(j-8).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						// Successful wash to sparkling
						if (result == "Sparkling"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() 
							+ " sparkling!($" + carsInventory.get(j-8).getWashBonus() + " bonus)");

							// Pay bonus to intern
							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + carsInventory.get(j-8).getWashBonus());
							operatingBudget -= carsInventory.get(j-8).getWashBonus();
							carsInventory.get(j-8).setCleanliness("Sparkling");
							vehiclesWashed += 1;
						}
						if (result == "Broken"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() 
							+ " Broken");
							carsInventory.get(j-8).setCondition("Broken");
						}
					}
				}
				// Iterate through electric cars inventory
				else  if (j >= 12 && j < 16){
					if (electricCarsInventory.get(j-12).getCleanliness() == "Dirty"){
						String result = internStaff.get(i).getWashMethod().washCar("Dirty");
						
						// Successful wash to clean
						if (result == "Clean"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + electricCarsInventory.get(j-12).getID() 
							+ " clean!");
							electricCarsInventory.get(j-12).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						// Successful wash to sparkling
						if (result == "Sparkling"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + electricCarsInventory.get(j-12).getID() 
							+ " sparkling!($" + electricCarsInventory.get(j-12).getWashBonus() + " bonus)");

							// Pay bonus to intern
							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + electricCarsInventory.get(j-12).getWashBonus());
							operatingBudget -= electricCarsInventory.get(j-12).getWashBonus();
							electricCarsInventory.get(j-12).setCleanliness("Sparkling");
							vehiclesWashed += 1;
						}
						if (result == "Broken"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + electricCarsInventory.get(j-12).getID() 
							+ " Broken");
							electricCarsInventory.get(j-12).setCondition("Broken");
						}
					}
				}
				// Iterate through monster truck inventory
				else  if (j >= 16 && j < 20){
					if (monsterTrucksInventory.get(j-16).getCleanliness() == "Dirty"){
						String result = internStaff.get(i).getWashMethod().washCar("Dirty");

						// Successful wash to clean
						if (result == "Clean"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + monsterTrucksInventory.get(j-16).getID() 
							+ " clean!");
							monsterTrucksInventory.get(j-16).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						// Successful wash to sparkling
						if (result == "Sparkling"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + monsterTrucksInventory.get(j-16).getID() 
							+ " sparkling!($" + monsterTrucksInventory.get(j-16).getWashBonus() + " bonus)");

							// Pay bonus to intern
							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + monsterTrucksInventory.get(j-16).getWashBonus());
							operatingBudget -= monsterTrucksInventory.get(j-16).getWashBonus();
							monsterTrucksInventory.get(j-16).setCleanliness("Sparkling");
							vehiclesWashed += 1;
						}
						if (result == "Broken"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + monsterTrucksInventory.get(j-16).getID() 
							+ " Broken");
							monsterTrucksInventory.get(j-16).setCondition("Broken");
						}
					}
				}
				// Iterate through motorcycles inventory
				else {
					if (motorcyclesInventory.get(j-20).getCleanliness() == "Dirty"){
						String result = internStaff.get(i).getWashMethod().washCar("Dirty");
						// Successful wash to clean
						if (result == "Clean"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + motorcyclesInventory.get(j-20).getID() 
							+ " clean!");
							motorcyclesInventory.get(j-20).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						// Successful wash to sparkling
						if (result == "Sparkling"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + motorcyclesInventory.get(j-20).getID() 
							+ " sparkling!($" + motorcyclesInventory.get(j-20).getWashBonus() + " bonus)");

							// Pay bonus to intern
							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + motorcyclesInventory.get(j-20).getWashBonus());
							operatingBudget -= motorcyclesInventory.get(j-20).getWashBonus();
							motorcyclesInventory.get(j-20).setCleanliness("Sparkling");
							vehiclesWashed += 1;
						}
						if (result == "Broken"){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + motorcyclesInventory.get(j-20).getID() 
							+ " Broken");
							motorcyclesInventory.get(j-20).setCondition("Broken");
						}
					}
				}
			}

			// If there are no more clean cars
			if (vehiclesWashed < 2){
				for (int j = 0; j < 24; j++){
					// check if reached limit
					if (vehiclesWashed == 2){
						break;
					}
					//Iterate through perforance car inventory
					if (j < 4){
						if (performanceCarInventory.get(j).getCleanliness() == "Clean"){
							String result = internStaff.get(i).getWashMethod().washCar("Clean");
							// Unsuccsessful clean to dirty
							if (result == "Dirty"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() + " dirty!");
								performanceCarInventory.get(j).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							// Successful clean to sparkling
							if (result == "Sparkling"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() 
								+ " sparkling!($" + performanceCarInventory.get(j).getWashBonus() + " bonus)");

								// Pay bonus to intern
								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + performanceCarInventory.get(j).getWashBonus());
								performanceCarInventory.get(j).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
							if (result == "Broken"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() 
								+ " Broken");
								performanceCarInventory.get(j).setCondition("Broken");
							}
						}
					}

					// Iterate through pickups inventory
					else if (j >= 4 && j < 8){
						if (pickupsInventory.get(j-4).getCleanliness() == "Clean"){
							String result = internStaff.get(i).getWashMethod().washCar("Clean");

							// Unsuccessful clean to dirty
							if (result == "Dirty"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() + " dirty!");
								pickupsInventory.get(j-4).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							// Successful clean to sparkling
							if (result == "Sparkling"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() 
								+ " sparkling!($" + pickupsInventory.get(j-4).getWashBonus() + " bonus)");

								// Pay bonus to intern
								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + pickupsInventory.get(j-4).getWashBonus());
								pickupsInventory.get(j-4).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
							if (result == "Broken"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() 
								+ " Broken");
								pickupsInventory.get(j-4).setCondition("Broken");
							}
						}
					}
					// Iterate through cars inventory
					else  if (j >= 8 && j < 12){
						if (carsInventory.get(j-8).getCleanliness() == "Clean"){
							String result = internStaff.get(i).getWashMethod().washCar("Clean");

							// Unsuccessful wash to dirty
							if (result == "Dirty"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() + " dirty!");
								carsInventory.get(j-8).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							// Successful wash to sparkling
							if (result == "Sparkling"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() 
								+ " sparkling!($" + carsInventory.get(j-8).getWashBonus() + " bonus)");

								// pay intern bonus
								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + carsInventory.get(j-8).getWashBonus());
								carsInventory.get(j-8).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
							if (result == "Broken"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() 
								+ " Broken");
								carsInventory.get(j-8).setCondition("Broken");
							}
						}
					}
					// Iterate through electric cars inventory
					else  if (j >= 12 && j < 16){
						if (electricCarsInventory.get(j-12).getCleanliness() == "Clean"){
							String result = internStaff.get(i).getWashMethod().washCar("Clean");

							// Unsuccessful wash to dirty
							if (result == "Dirty"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + electricCarsInventory.get(j-12).getID() + " dirty!");
								electricCarsInventory.get(j-12).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							// Successful wash to sparkling
							if (result == "Sparkling"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + electricCarsInventory.get(j-12).getID() 
								+ " sparkling!($" + electricCarsInventory.get(j-12).getWashBonus() + " bonus)");

								// pay intern bonus
								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + electricCarsInventory.get(j-12).getWashBonus());
								electricCarsInventory.get(j-12).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
							if (result == "Broken"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + electricCarsInventory.get(j-12).getID() 
								+ " Broken");
								electricCarsInventory.get(j-12).setCondition("Broken");
							}
						}
					}
					// Iterate through monster truck inventory
					else  if (j >= 16 && j < 20){
						if (monsterTrucksInventory.get(j-16).getCleanliness() == "Clean"){
							String result = internStaff.get(i).getWashMethod().washCar("Clean");

							// Unsuccessful wash to dirty
							if (result == "Dirty"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + monsterTrucksInventory.get(j-16).getID() + " dirty!");
								monsterTrucksInventory.get(j-16).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							// Successful wash to sparkling
							if (result == "Sparkling"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + monsterTrucksInventory.get(j-16).getID() 
								+ " sparkling!($" + monsterTrucksInventory.get(j-16).getWashBonus() + " bonus)");

								// pay intern bonus
								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + monsterTrucksInventory.get(j-16).getWashBonus());
								monsterTrucksInventory.get(j-16).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
							if (result == "Broken"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + monsterTrucksInventory.get(j-16).getID() 
								+ " Broken");
								monsterTrucksInventory.get(j-16).setCondition("Broken");
							}
						}
					}
					// Iterate through motorcycles inventory
					else {
						if (motorcyclesInventory.get(j-20).getCleanliness() == "Clean"){
							String result = internStaff.get(i).getWashMethod().washCar("Clean");
							// Unsuccessful wash to dirty
							if (result == "Dirty"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + motorcyclesInventory.get(j-20).getID() + " dirty!");
								motorcyclesInventory.get(j-20).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							// Successful wash to sparkling
							if (result == "Sparkling"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + motorcyclesInventory.get(j-20).getID() 
								+ " sparkling!($" + motorcyclesInventory.get(j-20).getWashBonus() + " bonus)");

								// pay intern bonus
								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + motorcyclesInventory.get(j-20).getWashBonus());
								motorcyclesInventory.get(j-20).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
							if (result == "Broken"){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + motorcyclesInventory.get(j-20).getID() 
								+ " Broken");
								motorcyclesInventory.get(j-20).setCondition("Broken");
							}
						}
					}
				} 
			}
		}
	}

	/* Iterates through all mechanics and rolls for a chance to repair cars (roll on
	 * either broken or used cars). Upon repair roll, car is dropped a class in cleanliness
	 * reguardless of whether or not repair is successful. If repair is successful, mechanic
	 * is paid a bonus (determined by car type).
	 * -------------------------------------------------------------------------------------
	 * @param  -> none
	 * @return -> void
	 */
	public void repairing() {
		// Iterate over mechanics
		for (int i = 0; i < 3; i++){
			int vehiclesFixed = 0;

			// Iterate through all three vehicle inventories
			// Looking for Broken vehicles
			for (int j = 0; j < 12; j++){
				// Check to see if repair limit is reached
				if (vehiclesFixed == 2){
					break;
				}

				// Iterate through performanceCar inventory
				if (j < 4){
					if (performanceCarInventory.get(j).getCondition() == "Broken"){
						int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						// Successful repair
						if (repairRoll <= 80){
							System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Broken car " + performanceCarInventory.get(j).getID() 
							+ " and made it Used!($" + performanceCarInventory.get(j).getRepairBonus() + " bonus)");

							// Set condition to Used
							performanceCarInventory.get(j).setCondition("Used");
							// Pay bonus to mechanic
							mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + performanceCarInventory.get(j).getRepairBonus());
							
							// Adjust cleanliness level
							if (performanceCarInventory.get(j).getCleanliness() == "Sparkling"){
								performanceCarInventory.get(j).setCleanliness("Clean");
							}
							else if (performanceCarInventory.get(j).getCleanliness() == "Clean"){
								performanceCarInventory.get(j).setCleanliness("Dirty");
							}
						}
						// Unsuccessful repair
						else {
							// Adjust cleanliness level
							if (performanceCarInventory.get(j).getCleanliness() == "Sparkling"){
								performanceCarInventory.get(j).setCleanliness("Clean");
							}
							else if (performanceCarInventory.get(j).getCleanliness() == "Clean"){
								performanceCarInventory.get(j).setCleanliness("Dirty");
							}
						}
						vehiclesFixed += 1;
					}
				}
				// Iterate through pickups inventory
				else if (j >= 4 && j < 8){
					if (pickupsInventory.get(j-4).getCondition() == "Broken"){
						int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						// Successful repair
						if (repairRoll <= 80){
							System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Broken car " + pickupsInventory.get(j-4).getID() 
							+ " and made it Used!($" + pickupsInventory.get(j-4).getRepairBonus() + " bonus)");

							// Set condition to Used
							pickupsInventory.get(j-4).setCondition("Used");
							// Pay mechanic bonus
							mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + pickupsInventory.get(j-4).getRepairBonus());
							
							// Adjust cleanliness level
							if (pickupsInventory.get(j-4).getCleanliness() == "Sparkling"){
								pickupsInventory.get(j-4).setCleanliness("Clean");
							}
							else if (pickupsInventory.get(j-4).getCleanliness() == "Clean"){
								pickupsInventory.get(j-4).setCleanliness("Dirty");
							}
						}
						// Unsuccessful repair
						else {
							// Adjust cleanliness level
							if (pickupsInventory.get(j-4).getCleanliness() == "Sparkling"){
								pickupsInventory.get(j-4).setCleanliness("Clean");
							}
							else if (pickupsInventory.get(j-4).getCleanliness() == "Clean"){
								pickupsInventory.get(j-4).setCleanliness("Dirty");
							}
						}
						vehiclesFixed += 1;
					}
				}
				// Iterate through cars inventory
				else {
					if (carsInventory.get(j-8).getCondition() == "Broken"){
						int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						// Successful repair
						if (repairRoll <= 80){
							System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Broken car " + carsInventory.get(j-8).getID() 
							+ " and made it Used!($" + carsInventory.get(j-8).getRepairBonus() + " bonus)");

							// Set condition to Used
							carsInventory.get(j-8).setCondition("Used");
							// Pay mechanic bonus
							mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + carsInventory.get(j-8).getRepairBonus());
							
							// Adjust cleanliness level
							if (carsInventory.get(j-8).getCleanliness() == "Sparkling"){
								carsInventory.get(j-8).setCleanliness("Clean");
							}
							else if (carsInventory.get(j-8).getCleanliness() == "Clean"){
								carsInventory.get(j-8).setCleanliness("Dirty");
							}
						}
						// Unsuccessful repair
						else {
							// Adjust cleanliness level
							if (carsInventory.get(j-8).getCleanliness() == "Sparkling"){
								carsInventory.get(j-8).setCleanliness("Clean");
							}
							else if (carsInventory.get(j-8).getCleanliness() == "Clean"){
								carsInventory.get(j-8).setCleanliness("Dirty");
							}
						}
						vehiclesFixed += 1;
					}
				}
			}

			// Check if limit has been reached
			if (vehiclesFixed < 2){
				// Iterate through all vehicle inventories
				// Looking for Used vehicles
				for (int j = 0; j < 12; j++){
					// Iterate through performanceCar inventory
					if (j < 4){
						if (performanceCarInventory.get(j).getCondition() == "Used"){
							int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
	
							// Successful repair
							if (repairRoll <= 80){
								System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Used car " + performanceCarInventory.get(j).getID() 
								+ " and made it Like New!($" + performanceCarInventory.get(j).getRepairBonus() + " bonus)");
	
								// Set condition to Like New
								performanceCarInventory.get(j).setCondition("Like New");
								// Pay mechanic bonus
								mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + performanceCarInventory.get(j).getRepairBonus());
								
								// Adjust cleanliness level
								if (performanceCarInventory.get(j).getCleanliness() == "Sparkling"){
									performanceCarInventory.get(j).setCleanliness("Clean");
								}
								else if (performanceCarInventory.get(j).getCleanliness() == "Clean"){
									performanceCarInventory.get(j).setCleanliness("Dirty");
								}
							}
							// Unsuccessful repair
							else {
								// Adjust cleanliness level
								if (performanceCarInventory.get(j).getCleanliness() == "Sparkling"){
									performanceCarInventory.get(j).setCleanliness("Clean");
								}
								else if (performanceCarInventory.get(j).getCleanliness() == "Clean"){
									performanceCarInventory.get(j).setCleanliness("Dirty");
								}
							}
							vehiclesFixed += 1;
						}
					}
					// Iterate through pickups inventory
					else if (j >= 4 && j < 8){
						if (pickupsInventory.get(j-4).getCondition() == "Used"){
							int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
	
							// Successful repair
							if (repairRoll <= 80){
								System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Used car " + pickupsInventory.get(j-4).getID() 
								+ " and made it Like New!($" + pickupsInventory.get(j-4).getRepairBonus() + " bonus)");
	
								// Set condition to Like New
								pickupsInventory.get(j-4).setCondition("Like New");
								// Pay mechanic bonus
								mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + pickupsInventory.get(j-4).getRepairBonus());
								
								// Adjust cleanliness level
								if (pickupsInventory.get(j-4).getCleanliness() == "Sparkling"){
									pickupsInventory.get(j-4).setCleanliness("Clean");
								}
								else if (pickupsInventory.get(j-4).getCleanliness() == "Clean"){
									pickupsInventory.get(j-4).setCleanliness("Dirty");
								}
							}
							// Unsuccessful repair
							else {
								// Adjust cleanliness level
								if (pickupsInventory.get(j-4).getCleanliness() == "Sparkling"){
									pickupsInventory.get(j-4).setCleanliness("Clean");
								}
								else if (pickupsInventory.get(j-4).getCleanliness() == "Clean"){
									pickupsInventory.get(j-4).setCleanliness("Dirty");
								}
							}
							vehiclesFixed += 1;
						}
					}
					// Iterate through cars inventory
					else {
						if (carsInventory.get(j-8).getCondition() == "Used"){
							int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
	
							// Successful repair
							if (repairRoll <= 80){
								System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Used car " + carsInventory.get(j-8).getID() 
								+ " and made it Like New!($" + carsInventory.get(j-8).getRepairBonus() + " bonus)");
	
								// Set condition to Like New
								carsInventory.get(j-8).setCondition("Like New");
								// Pay mechanic bonus
								mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + carsInventory.get(j-8).getRepairBonus());
								
								// Adjust cleanliness level
								if (carsInventory.get(j-8).getCleanliness() == "Sparkling"){
									carsInventory.get(j-8).setCleanliness("Clean");
								}
								else if (carsInventory.get(j-8).getCleanliness() == "Clean"){
									carsInventory.get(j-8).setCleanliness("Dirty");
								}
							}
							// Unsuccessful repair
							else {
								// Adjust cleanliness level
								if (carsInventory.get(j-8).getCleanliness() == "Sparkling"){
									carsInventory.get(j-8).setCleanliness("Clean");
								}
								else if (carsInventory.get(j-8).getCleanliness() == "Clean"){
									carsInventory.get(j-8).setCleanliness("Dirty");
								}
							}
							vehiclesFixed += 1;
						}
					}
				}
			}
		}
	}
	/* First calls the createBuyers function generating a new list of buyers.
	 * It will then iterate over that ArrayList of buyers and randomly roll a 
	 * salesperson. It will then look at what vehicle type the buyer wants and 
	 * find the most expensie one in that class. If there are no vehicles of that
	 * type, then it will find the next most expensive car in either type. It will
	 * then adjust the roll chance depending on cleanliness and condition. If the roll
	 * is successful, then the car will be sold to the buyer, adding the funds to 
	 * operating budget, updating totalSales, and paying the bonus to the salesperson.
	 * -------------------------------------------------------------------------------
	 * @param  -> none
	 * @return -> void
	 */
	public void selling() {
		// Initialize buyers ArrayList
		createBuyers();

		// Iterate through buyers
		for (int i = 0; i < buyers.size(); i++){
			// Randomly choose a salesperson
			int salesPersonRoll = ThreadLocalRandom.current().nextInt(0, 2 + 1);

			// Buyer wants performanceCar
			if (buyers.get(i).getVehicleTypeWanted() == "PerformanceCars"){
				// If in stock
				if (performanceCarInventory.size() != 0){
					double maxPrice = 0.0;
					int maxPriceIndex = -1;
					int salesChance = buyers.get(i).getBuyChance();

					// Find most expensive vehicle
					for (int j = 0; j < performanceCarInventory.size(); j++){
						if (maxPrice < performanceCarInventory.get(j).getSalesPrice() && performanceCarInventory.get(j).getCondition() != "Broken"){
							maxPrice = performanceCarInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
						}
					}

					if (maxPriceIndex == -1){
						break;
					}

					// Adjust sales chance
					if (performanceCarInventory.get(maxPriceIndex).getCondition() == "Like New"){
						salesChance += 10;
					}
					if (performanceCarInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
						salesChance += 10;
					}
					int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

					// Successful sales roll
					if (sellRoll <= salesChance){
						System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
						+ performanceCarInventory.get(maxPriceIndex).getCleanliness() + " " 
						+ performanceCarInventory.get(maxPriceIndex).getCondition() + " " + performanceCarInventory.get(maxPriceIndex).getID() 
						+ " to Buyer for $" + performanceCarInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
						+ performanceCarInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

						// Adjust operating budget/total sales/pay bonus
						operatingBudget += performanceCarInventory.get(maxPriceIndex).getSalesPrice();
						totalSales += performanceCarInventory.get(maxPriceIndex).getSalesPrice();
						double bonus = performanceCarInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
						salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

						soldVehicles.add(performanceCarInventory.get(maxPriceIndex));
						performanceCarInventory.remove(maxPriceIndex);
					}
				}
				// Not in stock
				else {
					double maxPrice = 0.0;
					int maxPriceIndex = -1;
					int salesChance = buyers.get(i).getBuyChance() - 20;
					String maxPriceType = "";

					// Find most expensive pickups
					for (int j = 0; j < pickupsInventory.size(); j++){
						if (maxPrice < pickupsInventory.get(j).getSalesPrice() && pickupsInventory.get(j).getCondition() != "Broken"){
							maxPrice = pickupsInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
							maxPriceType = "Pickups";
						}
					}
					// Find most expensive cars
					for (int j = 0; j < carsInventory.size(); j++){
						if (maxPrice < carsInventory.get(j).getSalesPrice() && carsInventory.get(j).getCondition() != "Broken"){
							maxPrice = carsInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
							maxPriceType = "Cars";
						}
					}

					// Pickups is most expensive
					if (maxPriceType == "Pickups"){
						// Adjust sales chance
						if (pickupsInventory.get(maxPriceIndex).getCondition() == "Like New"){
							salesChance += 10;
						}
						if (pickupsInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
							salesChance += 10;
						}
						int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						// Successful sales roll
						if (sellRoll <= salesChance){
							System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
							+ pickupsInventory.get(maxPriceIndex).getCleanliness() + " " 
							+ pickupsInventory.get(maxPriceIndex).getCondition() + " " + pickupsInventory.get(maxPriceIndex).getID() 
							+ " to Buyer for $" + pickupsInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
							+ pickupsInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

							// Adjust operating budget/total sales/pay bonus
							operatingBudget += pickupsInventory.get(maxPriceIndex).getSalesPrice();
							totalSales += pickupsInventory.get(maxPriceIndex).getSalesPrice();
							double bonus = pickupsInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
							salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

							soldVehicles.add(pickupsInventory.get(maxPriceIndex));
							pickupsInventory.remove(maxPriceIndex);
						}
					}
					// Cars is most expensive
					else if (maxPriceType == "Cars"){
						// Adjust sales chance
						if (carsInventory.get(maxPriceIndex).getCondition() == "Like New"){
							salesChance += 10;
						}
						if (carsInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
							salesChance += 10;
						}
						int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						// Successful sales roll
						if (sellRoll <= salesChance){
							System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
							+ carsInventory.get(maxPriceIndex).getCleanliness() + " " 
							+ carsInventory.get(maxPriceIndex).getCondition() + " " + carsInventory.get(maxPriceIndex).getID() 
							+ " to Buyer for $" + carsInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
							+ carsInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

							// Adjust operating budget/total sales/pay bonus
							operatingBudget += carsInventory.get(maxPriceIndex).getSalesPrice();
							totalSales += carsInventory.get(maxPriceIndex).getSalesPrice();
							double bonus = carsInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
							salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

							soldVehicles.add(carsInventory.get(maxPriceIndex));
							carsInventory.remove(maxPriceIndex);
						}
					}
				}
			}
			// Pickups desired
			else if (buyers.get(i).getVehicleTypeWanted() == "Pickups"){
				// If in stock
				if (pickupsInventory.size() != 0){
					double maxPrice = 0.0;
					int maxPriceIndex = -1;
					int salesChance = buyers.get(i).getBuyChance();

					// Find most expensive vehicle
					for (int j = 0; j < pickupsInventory.size(); j++){
						if (maxPrice < pickupsInventory.get(j).getSalesPrice() && pickupsInventory.get(j).getCondition() != "Broken"){
							maxPrice = pickupsInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
						}
					}

					if (maxPriceIndex == -1){
						break;
					}

					// Adjust sales chance
					if (pickupsInventory.get(maxPriceIndex).getCondition() == "Like New"){
						salesChance += 10;
					}
					if (pickupsInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
						salesChance += 10;
					}
					int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

					// Successful sales roll
					if (sellRoll <= salesChance){
						System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
						+ pickupsInventory.get(maxPriceIndex).getCleanliness() + " " 
						+ pickupsInventory.get(maxPriceIndex).getCondition() + " " + pickupsInventory.get(maxPriceIndex).getID() 
						+ " to Buyer for $" + pickupsInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
						+ pickupsInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

						// Adjust operating budget/total sales/pay bonus
						operatingBudget += pickupsInventory.get(maxPriceIndex).getSalesPrice();
						totalSales += pickupsInventory.get(maxPriceIndex).getSalesPrice();
						double bonus = pickupsInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
						salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

						soldVehicles.add(pickupsInventory.get(maxPriceIndex));
						pickupsInventory.remove(maxPriceIndex);
					}
				}
				// Not in stock
				else {
					double maxPrice = 0.0;
					int maxPriceIndex = -1;
					int salesChance = buyers.get(i).getBuyChance() - 20;
					String maxPriceType = "";

					// Find most expensive performanceCar
					for (int j = 0; j < performanceCarInventory.size(); j++){
						if (maxPrice < performanceCarInventory.get(j).getSalesPrice() && performanceCarInventory.get(j).getCondition() != "Broken"){
							maxPrice = performanceCarInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
							maxPriceType = "PerformanceCars";
						}
					}
					// Find most expensive Car
					for (int j = 0; j < carsInventory.size(); j++){
						if (maxPrice < carsInventory.get(j).getSalesPrice() && carsInventory.get(j).getCondition() != "Broken"){
							maxPrice = carsInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
							maxPriceType = "Cars";
						}
					}

					// PerformaceCar is most expensive
					if (maxPriceType == "PerformanceCars"){
						// Adjust sales chance
						if (performanceCarInventory.get(maxPriceIndex).getCondition() == "Like New"){
							salesChance += 10;
						}
						if (performanceCarInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
							salesChance += 10;
						}
						int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						// Successful sales chance
						if (sellRoll <= salesChance){
							System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
							+ performanceCarInventory.get(maxPriceIndex).getCleanliness() + " " 
							+ performanceCarInventory.get(maxPriceIndex).getCondition() + " " + performanceCarInventory.get(maxPriceIndex).getID() 
							+ " to Buyer for $" + performanceCarInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
							+ performanceCarInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

							// Adjust operating budget/total sales/pay bonus
							operatingBudget += performanceCarInventory.get(maxPriceIndex).getSalesPrice();
							totalSales += performanceCarInventory.get(maxPriceIndex).getSalesPrice();
							double bonus = performanceCarInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
							salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

							soldVehicles.add(performanceCarInventory.get(maxPriceIndex));
							performanceCarInventory.remove(maxPriceIndex);
						}
					}
					// Cars is most expensive
					else if (maxPriceType == "Cars"){
						// Adjust sales chance
						if (carsInventory.get(maxPriceIndex).getCondition() == "Like New"){
							salesChance += 10;
						}
						if (carsInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
							salesChance += 10;
						}
						int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						// Successful sales roll
						if (sellRoll <= salesChance){
							System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
							+ carsInventory.get(maxPriceIndex).getCleanliness() + " " 
							+ carsInventory.get(maxPriceIndex).getCondition() + " " + carsInventory.get(maxPriceIndex).getID() 
							+ " to Buyer for $" + carsInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
							+ carsInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

							// Adjust operating budget/total sales/pay bonus
							operatingBudget += carsInventory.get(maxPriceIndex).getSalesPrice();
							totalSales += carsInventory.get(maxPriceIndex).getSalesPrice();
							double bonus = carsInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
							salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

							soldVehicles.add(carsInventory.get(maxPriceIndex));
							carsInventory.remove(maxPriceIndex);
						}
					}
				}
			}

			// Cars desired
			else {
				// In stock
				if (carsInventory.size() != 0){
					double maxPrice = 0.0;
					int maxPriceIndex = -1;
					int salesChance = buyers.get(i).getBuyChance();

					// Find most expensive Car
					for (int j = 0; j < carsInventory.size(); j++){
						if (maxPrice < carsInventory.get(j).getSalesPrice() && carsInventory.get(j).getCondition() != "Broken"){
							maxPrice = carsInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
						}
					}

					if (maxPriceIndex == -1){
						break;
					}

					// Adjust sales chance
					if (carsInventory.get(maxPriceIndex).getCondition() == "Like New"){
						salesChance += 10;
					}
					if (carsInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
						salesChance += 10;
					}
					int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

					// Successful sales roll
					if (sellRoll <= salesChance){
						System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
						+ carsInventory.get(maxPriceIndex).getCleanliness() + " " 
						+ carsInventory.get(maxPriceIndex).getCondition() + " " + carsInventory.get(maxPriceIndex).getID() 
						+ " to Buyer for $" + carsInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
						+ carsInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

						// Adjust operating budget/total sales/pay bonus
						operatingBudget += carsInventory.get(maxPriceIndex).getSalesPrice();
						totalSales += carsInventory.get(maxPriceIndex).getSalesPrice();
						double bonus = carsInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
						salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

						soldVehicles.add(carsInventory.get(maxPriceIndex));
						carsInventory.remove(maxPriceIndex);
					}
				}
				// Not in stock
				else {
					double maxPrice = 0.0;
					int maxPriceIndex = -1;
					int salesChance = buyers.get(i).getBuyChance() - 20;
					String maxPriceType = "";

					// Find most expensive pickup
					for (int j = 0; j < pickupsInventory.size(); j++){
						if (maxPrice < pickupsInventory.get(j).getSalesPrice() && pickupsInventory.get(j).getCondition() != "Broken"){
							maxPrice = pickupsInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
							maxPriceType = "Pickups";
						}
					}
					// Find most expensive performanceCar
					for (int j = 0; j < performanceCarInventory.size(); j++){
						if (maxPrice < performanceCarInventory.get(j).getSalesPrice() && performanceCarInventory.get(j).getCondition() != "Broken"){
							maxPrice = performanceCarInventory.get(j).getSalesPrice();
							maxPriceIndex = j;
							maxPriceType = "PerformanceCars";
						}
					}

					// Pickup is most expensive
					if (maxPriceType == "Pickups"){
						// Adjust sales chance
						if (pickupsInventory.get(maxPriceIndex).getCondition() == "Like New"){
							salesChance += 10;
						}
						if (pickupsInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
							salesChance += 10;
						}
						int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						// Successful sales roll
						if (sellRoll <= salesChance){
							System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
							+ pickupsInventory.get(maxPriceIndex).getCleanliness() + " " 
							+ pickupsInventory.get(maxPriceIndex).getCondition() + " " + pickupsInventory.get(maxPriceIndex).getID() 
							+ " to Buyer for $" + pickupsInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
							+ pickupsInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

							// Adjust operating budget/total sales/pay bonus
							operatingBudget += pickupsInventory.get(maxPriceIndex).getSalesPrice();
							totalSales += pickupsInventory.get(maxPriceIndex).getSalesPrice();
							double bonus = pickupsInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
							salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

							soldVehicles.add(pickupsInventory.get(maxPriceIndex));
							pickupsInventory.remove(maxPriceIndex);
						}
					}
					// PerformanceCar most expensive
					else if (maxPriceType == "PerformanceCars"){

						// Adjust sales chance
						if (performanceCarInventory.get(maxPriceIndex).getCondition() == "Like New"){
							salesChance += 10;
						}
						if (performanceCarInventory.get(maxPriceIndex).getCleanliness() == "Sparkling"){
							salesChance += 10;
						}
						int sellRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						// Successful sales roll
						if (sellRoll <= salesChance){
							System.out.println(salespersonStaff.get(salesPersonRoll).getUniqueName() + " sold " 
							+ performanceCarInventory.get(maxPriceIndex).getCleanliness() + " " 
							+ performanceCarInventory.get(maxPriceIndex).getCondition() + " " + performanceCarInventory.get(maxPriceIndex).getID() 
							+ " to Buyer for $" + performanceCarInventory.get(maxPriceIndex).getSalesPrice() + " (earned $" 
							+ performanceCarInventory.get(maxPriceIndex).getSalesBonus() + " bonus)");

							// Adjust operating budget/total sales/pay bonus
							operatingBudget += performanceCarInventory.get(maxPriceIndex).getSalesPrice();
							totalSales += performanceCarInventory.get(maxPriceIndex).getSalesPrice();
							double bonus = performanceCarInventory.get(maxPriceIndex).getSalesBonus() + salespersonStaff.get(salesPersonRoll).getBonusPay();
							salespersonStaff.get(salesPersonRoll).setBonusPay(bonus);

							soldVehicles.add(performanceCarInventory.get(maxPriceIndex));
							performanceCarInventory.remove(maxPriceIndex);
						}
					}
				}
			}
		}
	}
	public void raceEvent() {
		if (currentDay == 3 || currentDay == 10 || currentDay == 17 || currentDay == 24 || currentDay == 7 || currentDay == 14 || currentDay ==  21 || currentDay == 28) {
			int vehicleType = ThreadLocalRandom.current().nextInt(1, 4 + 1); // out of 4 vehicle types
			if (vehicleType == 1) {
				ArrayList<Motorcycles> racingVehicles = new ArrayList<>();
				for (int i = 0; i < motorcyclesInventory.size(); i++) {
					if (motorcyclesInventory.get(i).getCondition() != "Broken") {
						if (racingVehicles.size() < 3) {
							racingVehicles.add(motorcyclesInventory.get(i));
						}
					}
				}
				int prevChance = 0;
				int vehicleChance = 0;
				for (int i = 0; i < racingVehicles.size(); i++) {
					while (prevChance == vehicleChance) {
						vehicleChance = ThreadLocalRandom.current().nextInt(1, 20 + 1);
					}
					if (vehicleChance == 1 || vehicleChance == 2 || vehicleChance == 3) {
						racingVehicles.get(i).setRacesWon(racingVehicles.get(i).getRacesWon() + 1);
						racingVehicles.get(i).setSalesPrice(racingVehicles.get(i).getSalesPrice() * 1.10);
						driverStaff.get(i).setRacesWon(driverStaff.get(i).getRacesWon() + 1);
						driverStaff.get(i).setBonusPay(driverStaff.get(i).getBonusPay() + 50.0); //$50 for winning
					}
					else if (vehicleChance == 16 || vehicleChance == 17 || vehicleChance == 18 || vehicleChance == 19 || vehicleChance == 20) {
						racingVehicles.get(i).setCondition("Broken");
						int driverChance = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						if (driverChance <= 30) {
							driverStaff.get(i).setCondition("Injured"); //driver is injured, will quit.
						}
					}
					prevChance = vehicleChance;
				}
			}
			else if (vehicleType == 2) {
				ArrayList<MonsterTrucks> racingVehicles = new ArrayList<>();
				for (int i = 0; i < monsterTrucksInventory.size(); i++) {
					if (monsterTrucksInventory.get(i).getCondition() != "Broken") {
						if (racingVehicles.size() < 3) {
							racingVehicles.add(monsterTrucksInventory.get(i));
						}
					}
				}
				int prevChance = 0;
				int vehicleChance = 0;
				for (int i = 0; i < racingVehicles.size(); i++) {
					while (prevChance == vehicleChance) {
						vehicleChance = ThreadLocalRandom.current().nextInt(1, 20 + 1);
					}
					if (vehicleChance == 1 || vehicleChance == 2 || vehicleChance == 3) {
						racingVehicles.get(i).setRacesWon(racingVehicles.get(i).getRacesWon() + 1);
						racingVehicles.get(i).setSalesPrice(racingVehicles.get(i).getSalesPrice() * 1.10);
						driverStaff.get(i).setRacesWon(driverStaff.get(i).getRacesWon() + 1);
						driverStaff.get(i).setBonusPay(driverStaff.get(i).getBonusPay() + 50.0); //$50 for winning
					}
					else if (vehicleChance == 16 || vehicleChance == 17 || vehicleChance == 18 || vehicleChance == 19 || vehicleChance == 20) {
						racingVehicles.get(i).setCondition("Broken");
						int driverChance = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						if (driverChance <= 30) {
							driverStaff.get(i).setCondition("Injured"); //driver is injured, will quit.
						}
					}
					prevChance = vehicleChance;
				}
			}
			else if (vehicleType == 3){
				ArrayList<PerformanceCars> racingVehicles = new ArrayList<>();
				for (int i = 0; i < performanceCarInventory.size(); i++) {
					if (performanceCarInventory.get(i).getCondition() != "Broken") {
						if (racingVehicles.size() < 3) {
							racingVehicles.add(performanceCarInventory.get(i));
						}
					}
				}
				int prevChance = 0;
				int vehicleChance = 0;
				for (int i = 0; i < racingVehicles.size(); i++) {
					while (prevChance == vehicleChance) {
						vehicleChance = ThreadLocalRandom.current().nextInt(1, 20 + 1);
					}
					if (vehicleChance == 1 || vehicleChance == 2 || vehicleChance == 3) {
						racingVehicles.get(i).setRacesWon(racingVehicles.get(i).getRacesWon() + 1);
						racingVehicles.get(i).setSalesPrice(racingVehicles.get(i).getSalesPrice() * 1.10);
						driverStaff.get(i).setRacesWon(driverStaff.get(i).getRacesWon() + 1);
						driverStaff.get(i).setBonusPay(driverStaff.get(i).getBonusPay() + 50.0); //$50 for winning
					}
					else if (vehicleChance == 16 || vehicleChance == 17 || vehicleChance == 18 || vehicleChance == 19 || vehicleChance == 20) {
						racingVehicles.get(i).setCondition("Broken");
						int driverChance = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						if (driverChance <= 30) {
							driverStaff.get(i).setCondition("Injured"); //driver is injured, will quit.
						}
					}
					prevChance = vehicleChance;
				}
			}
			else {
				ArrayList<Pickups> racingVehicles = new ArrayList<>();
				for (int i = 0; i < pickupsInventory.size(); i++) {
					if (pickupsInventory.get(i).getCondition() != "Broken") {
						if (racingVehicles.size() < 3) {
							racingVehicles.add(pickupsInventory.get(i));
						}
					}
				}
				int prevChance = 0;
				int vehicleChance = 0;
				for (int i = 0; i < racingVehicles.size(); i++) {
					while (prevChance == vehicleChance) {
						vehicleChance = ThreadLocalRandom.current().nextInt(1, 20 + 1);
					}
					if (vehicleChance == 1 || vehicleChance == 2 || vehicleChance == 3) {
						racingVehicles.get(i).setRacesWon(racingVehicles.get(i).getRacesWon() + 1);
						racingVehicles.get(i).setSalesPrice(racingVehicles.get(i).getSalesPrice() * 1.10);
						driverStaff.get(i).setRacesWon(driverStaff.get(i).getRacesWon() + 1);
						driverStaff.get(i).setBonusPay(driverStaff.get(i).getBonusPay() + 50.0); //$50 for winning
					}
					else if (vehicleChance == 16 || vehicleChance == 17 || vehicleChance == 18 || vehicleChance == 19 || vehicleChance == 20) {
						racingVehicles.get(i).setCondition("Broken");
						int driverChance = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						if (driverChance <= 30) {
							driverStaff.get(i).setCondition("Injured"); //driver is injured, will quit.
						}
					}
					prevChance = vehicleChance;
				}
			}
			
		}
	}
	public void ending() {
		int counterM = 0; //counter to create print table
		int counterS = 0;
		int counterI = 0;
		int counterD = 0; //counter for driver
		int counterDM = 0;
		int counterDS = 0;
		int counterDI = 0;
		int counterDD = 0; //counter for departed drivers
		int counterPC = 0;
		int counterC = 0;
		int counterP = 0;
		int counterMO = 0; //counter for monster trucks
		int counterMot = 0; //counter for motorcycles
		int counterEC = 0; //counter for electric cars
		for (int i = 0; i < mechanicStaff.size(); i++) {
			// Pay each mechanic
			mechanicStaff.get(i).setNormalPay(mechanicStaff.get(i).getNormalPay() + 20.5);
			mechanicStaff.get(i).setDaysWorked(mechanicStaff.get(i).getDaysWorked() + 1);
			counterM = counterM + 1;
		}
		for (int i = 0; i < salespersonStaff.size(); i++) {
			// Pay each salesperson
			salespersonStaff.get(i).setNormalPay(salespersonStaff.get(i).getNormalPay() + 22.5);
			salespersonStaff.get(i).setDaysWorked(salespersonStaff.get(i).getDaysWorked() + 1);
			counterS = counterS + 1;
		}
		for (int i = 0; i < internStaff.size(); i++) {
			// Pay each intern
			internStaff.get(i).setNormalPay(internStaff.get(i).getNormalPay() + 10.5);
			internStaff.get(i).setDaysWorked(internStaff.get(i).getDaysWorked() + 1);
			counterI = counterI + 1;
		}
		for (int i = 0; i < driverStaff.size(); i++) {
			// Pay each intern
			driverStaff.get(i).setNormalPay(driverStaff.get(i).getNormalPay() + 15.5);
			driverStaff.get(i).setDaysWorked(driverStaff.get(i).getDaysWorked() + 1);
			counterD = counterD + 1;
			if (driverStaff.get(i).getCondition() == "Injured") {
				departedDStaff.add(driverStaff.get(i));
				Driver newDriver = new Driver("Driver" + String.valueOf(driverNames));
				driverStaff.set(i, newDriver);
				counterDD = counterDD + 1;
				driverNames += 1;
			}
		}
		for (int i = 0; i < performanceCarInventory.size(); i++) {
			// count each PC
			counterPC = counterPC + 1;
		}
		for (int i = 0; i < carsInventory.size(); i++) {
			// count each C
			counterC = counterC + 1;
		}
		for (int i = 0; i < pickupsInventory.size(); i++) {
			// count each P
			counterP = counterP + 1;
		}
		for (int i = 0; i < monsterTrucksInventory.size(); i++) {
			// count each MO
			counterMO = counterMO + 1;
		}
		for (int i = 0; i < motorcyclesInventory.size(); i++) {
			// count each Mot
			counterMot = counterMot + 1;
		}
		for (int i = 0; i < electricCarsInventory.size(); i++) {
			// count each EC
			counterEC = counterEC + 1;
		}
		int mechanicQuitChance = ThreadLocalRandom.current().nextInt(1, 10 + 1); // if mechanicQuitChance = 1; a mechanic quits
		int salespersonQuitChance = ThreadLocalRandom.current().nextInt(1, 10 + 1); // if salespersonQuitChance = 1; a salesperson quits
		int internQuitChance = ThreadLocalRandom.current().nextInt(1, 10 + 1); // if internQuitChance = 1; a intern quits
		if (mechanicQuitChance == 1) { //mechanic quits
			departedMStaff.add(mechanicStaff.get(0));
			Mechanic promotedIntern = new Mechanic("Mechanic" + String.valueOf(mechNames));
			promotedIntern.setUniqueName(internStaff.get(0).getUniqueName());
			promotedIntern.setBonusPay(internStaff.get(0).getBonusPay());
			promotedIntern.setDaysWorked(internStaff.get(0).getDaysWorked());
			promotedIntern.setNormalPay(internStaff.get(0).getNormalPay());
			promotedIntern.setSalary(internStaff.get(0).getSalary());
			mechanicStaff.set(0, promotedIntern);
			internStaff.remove(0);
			counterI = counterI - 1;
			mechNames += 1;
		}
		if (salespersonQuitChance == 1) { //salesperson quits
			departedSStaff.add(salespersonStaff.get(0));
			Salesperson promotedIntern = new Salesperson("Salesperson" + String.valueOf(salesNames));
			promotedIntern.setUniqueName(internStaff.get(0).getUniqueName());
			promotedIntern.setBonusPay(internStaff.get(0).getBonusPay());
			promotedIntern.setDaysWorked(internStaff.get(0).getDaysWorked());
			promotedIntern.setNormalPay(internStaff.get(0).getNormalPay());
			promotedIntern.setSalary(internStaff.get(0).getSalary());
			salespersonStaff.set(0, promotedIntern);
			internStaff.remove(0);
			counterI = counterI - 1;
			salesNames += 1;
		}
		if (internQuitChance == 1) { //intern quits
			departedIStaff.add(internStaff.get(0));
			internStaff.remove(0);
			counterI = counterI - 1;
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
		final Object[][] tableD = new String[counterD][]; // table for driver
		final Object[][] tableDM = new String[counterDM][];
		final Object[][] tableDS = new String[counterDS][];
		final Object[][] tableDI = new String[counterDI][];
		final Object[][] tableDD = new String[counterDD][]; // table for departed driver
		final Object[][] tablePC = new String[counterPC][];
		final Object[][] tableC = new String[counterC][];
		final Object[][] tableP = new String[counterP][];
		final Object[][] tableMO = new String[counterMO][]; // table for monster truck
		final Object[][] tableMot = new String[counterMot][]; //table for motorcycles
		final Object[][] tableEC = new String[counterEC][]; //table for EC
		final Object[][] tableSales = new String[1][];
		for (int i = 0; i < mechanicStaff.size(); i++) { //adds all working mechanics to table
			tableM[i] = new String[] {mechanicStaff.get(i).getUniqueName(), Integer.toString(mechanicStaff.get(i).getDaysWorked()), String.valueOf(mechanicStaff.get(i).getNormalPay()), String.valueOf(mechanicStaff.get(i).getBonusPay()), "Working"};
		}
		 for (int i = 0; i < salespersonStaff.size(); i++) { //adds all working salesperson to table
			tableS[i] = new String[] {salespersonStaff.get(i).getUniqueName(), Integer.toString(salespersonStaff.get(i).getDaysWorked()), String.valueOf(salespersonStaff.get(i).getNormalPay()), String.valueOf(salespersonStaff.get(i).getBonusPay()), "Working"};
		}
		for (int i = 0; i < internStaff.size(); i++) { //adds all working interns to table
			tableI[i] = new String[] {internStaff.get(i).getUniqueName(), Integer.toString(internStaff.get(i).getDaysWorked()), String.valueOf(internStaff.get(i).getNormalPay()), String.valueOf(internStaff.get(i).getBonusPay()), "Working"};
		}
		for (int i = 0; i < driverStaff.size(); i++) { //adds all working interns to table
			tableD[i] = new String[] {driverStaff.get(i).getUniqueName(), Integer.toString(driverStaff.get(i).getDaysWorked()), String.valueOf(driverStaff.get(i).getNormalPay()), String.valueOf(driverStaff.get(i).getBonusPay()), "Working"};
		}
		for (int i = 0; i < departedMStaff.size(); i++) { //adds all working quit mechanics to table
			tableDM[i] = new String[] {departedMStaff.get(i).getUniqueName(), Integer.toString(departedMStaff.get(i).getDaysWorked()), String.valueOf(departedMStaff.get(i).getNormalPay()), String.valueOf(departedMStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < departedMStaff.size(); i++) {
			departedMStaff.remove(i);
		}
		for (int i = 0; i < departedSStaff.size(); i++) { //adds all working quit salesperson to table
			tableDS[i] = new String[] {departedSStaff.get(i).getUniqueName(), Integer.toString(departedSStaff.get(i).getDaysWorked()), String.valueOf(departedSStaff.get(i).getNormalPay()), String.valueOf(departedSStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < departedSStaff.size(); i++) {
			departedSStaff.remove(i);
		}
		for (int i = 0; i < departedIStaff.size(); i++) { //adds all working quit intern to table
			tableDI[i] = new String[] {departedIStaff.get(i).getUniqueName(), Integer.toString(departedIStaff.get(i).getDaysWorked()), String.valueOf(departedIStaff.get(i).getNormalPay()), String.valueOf(departedIStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < departedIStaff.size(); i++) {
			departedIStaff.remove(i);
		}
		for (int i = 0; i < departedDStaff.size(); i++) { //adds all working quit intern to table
			tableDD[i] = new String[] {departedDStaff.get(i).getUniqueName(), Integer.toString(departedDStaff.get(i).getDaysWorked()), String.valueOf(departedDStaff.get(i).getNormalPay()), String.valueOf(departedDStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < departedDStaff.size(); i++) {
			departedDStaff.remove(i);
		}
		for (int i = 0; i < performanceCarInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", performanceCarInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", performanceCarInventory.get(i).getSalesPrice());
			tablePC[i] = new String[] {performanceCarInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, performanceCarInventory.get(i).getCondition(), performanceCarInventory.get(i).getCleanliness(), "In Stock"};
		}
		for (int i = 0; i < carsInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", carsInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", carsInventory.get(i).getSalesPrice());
			tableC[i] = new String[] {carsInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, carsInventory.get(i).getCondition(), carsInventory.get(i).getCleanliness(), "In Stock"};
		}
		for (int i = 0; i < pickupsInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", pickupsInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", pickupsInventory.get(i).getSalesPrice());
			tableP[i] = new String[] {pickupsInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, pickupsInventory.get(i).getCondition(), pickupsInventory.get(i).getCleanliness(), "In Stock"};
		}
		for (int i = 0; i < monsterTrucksInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", monsterTrucksInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", monsterTrucksInventory.get(i).getSalesPrice());
			tableMO[i] = new String[] {monsterTrucksInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, monsterTrucksInventory.get(i).getCondition(), monsterTrucksInventory.get(i).getCleanliness(), "In Stock"};
		}
		for (int i = 0; i < motorcyclesInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", motorcyclesInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", motorcyclesInventory.get(i).getSalesPrice());
			tableMot[i] = new String[] {motorcyclesInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, motorcyclesInventory.get(i).getCondition(), motorcyclesInventory.get(i).getCleanliness(), "In Stock"};
		}
		for (int i = 0; i < electricCarsInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", electricCarsInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", electricCarsInventory.get(i).getSalesPrice());
			tableEC[i] = new String[] {electricCarsInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, electricCarsInventory.get(i).getCondition(), electricCarsInventory.get(i).getCleanliness(), "In Stock"};
		}
		String newOperatingBudget = String.format("%.2f", operatingBudget);
		String newTotalSales = String.format("%.2f", totalSales);
		tableSales[0] = new String[] {"$" + newOperatingBudget, "$" + newTotalSales};
		System.out.println("Staff Members: ");
		for (final Object[] row : tableM) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableS) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableI) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableD) {
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
		for (final Object[] row : tableDD) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		System.out.println("Vehicle Inventory:");
		if (performanceCarInventory.size() == 0) {
			tablePC[0] = new String[] {"PerformanceCar", "$0", "$0", "null", "null", "Out of Stock"};
		}
		if (carsInventory.size() == 0) {
			tableC[0] = new String[] {"Car", "$0", "$0", "null", "null", "Out of Stock"};
		}
		if (pickupsInventory.size() == 0) {
			tableP[0] = new String[] {"Pickup", "$0", "$0", "null", "null", "Out of Stock"};
		}
		if (monsterTrucksInventory.size() == 0) {
			tableP[0] = new String[] {"MonsterTruck", "$0", "$0", "null", "null", "Out of Stock"};
		}
		if (motorcyclesInventory.size() == 0) {
			tableP[0] = new String[] {"Motorcycle", "$0", "$0", "null", "null", "Out of Stock"};
		}
		if (electricCarsInventory.size() == 0) {
			tableP[0] = new String[] {"ElectricCar", "$0", "$0", "null", "null", "Out of Stock"};
		}
		for (final Object[] row : tablePC) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableC) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableP) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableMO) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableMot) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableEC) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		System.out.println("Total Budget and Sales:");
		for (final Object[] row : tableSales) {
			System.out.format("%15s%15s%n", row);
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream o = new PrintStream(new File("SimResults.txt"));
		//PrintStream console = System.out;
		System.setOut(o);
		FNCD sim = new FNCD();
		for (int i = 0; i < 30; i++){
			sim.opening();
			sim.washing();
			sim.repairing();
			sim.selling();
			sim.raceEvent();
			sim.ending();
			sim.updateCurrentDay();
		}
	}

}
