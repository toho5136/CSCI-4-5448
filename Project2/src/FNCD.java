import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
	private int currentDay = 1;
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
	public void addBuyer(Buyer newBuyer){
		buyers.add(newBuyer);
	}
	// Creator
	public void createBuyers() {
		buyers.clear();
		if (currentDay % 7 == 0 || currentDay % 6 == 0){
			for (int i = 0; i < 2; i++){
				int buyerRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);
				int wantedRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);

				// Just looking
				if (buyerRoll == 1){
					// Wants Performance
					if (wantedRoll == 1){
						Buyer buy = new Buyer("Just Looking", "PerformanceCars", 0.1);
						this.addBuyer(buy);
					}
					// Wants Pickups
					else if (wantedRoll == 2){
						Buyer buy = new Buyer("Just Looking", "Pickups", 0.1);
						this.addBuyer(buy);
					}
					// Wants Cars
					else {
						Buyer buy = new Buyer("Just Looking", "Cars", 0.1);
						this.addBuyer(buy);
					}
				}
				// Wants One
				else if (buyerRoll == 2){
					// Wants Performance
					if (wantedRoll == 1){
						Buyer buy = new Buyer("Wants One", "PerformanceCars", 0.4);
						this.addBuyer(buy);
					}
					// Wants Pickups
					else if (wantedRoll == 2){
						Buyer buy = new Buyer("Wants One", "Pickups", 0.4);
						this.addBuyer(buy);
					}
					// Wants Cars
					else {
						Buyer buy = new Buyer("Wants One", "Cars", 0.4);
						this.addBuyer(buy);
					}
				}
				else {
					// Wants Performance
					if (wantedRoll == 1){
						Buyer buy = new Buyer("Needs One", "PerformanceCars", 0.7);
						this.addBuyer(buy);
					}
					// Wants Pickups
					else if (wantedRoll == 2){
						Buyer buy = new Buyer("Needs One", "Pickups", 0.7);
						this.addBuyer(buy);
					}
					// Wants Cars
					else {
						Buyer buy = new Buyer("Needs One", "Cars", 0.7);
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
							Buyer buy = new Buyer("Just Looking", "PerformanceCars", 0.1);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Just Looking", "Pickups", 0.1);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Just Looking", "Cars", 0.1);
							this.addBuyer(buy);
						}
					}
					// Wants One
					else if (buyerRoll == 2){
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Wants One", "PerformanceCars", 0.4);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Wants One", "Pickups", 0.4);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Wants One", "Cars", 0.4);
							this.addBuyer(buy);
						}
					}
					else {
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Needs One", "PerformanceCars", 0.7);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Needs One", "Pickups", 0.7);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Needs One", "Cars", 0.7);
							this.addBuyer(buy);
						}
					}
				}
			}
		}
		else {
			System.out.println("Curr day: " + currentDay);
			for (int i = 0; i < 5; i++){
				int roll = ThreadLocalRandom.current().nextInt(1, 2 + 1);
				
				if (roll == 1){
					int buyerRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);
					int wantedRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);

					// Just looking
					if (buyerRoll == 1){
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Just Looking", "PerformanceCars", 0.1);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Just Looking", "Pickups", 0.1);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Just Looking", "Cars", 0.1);
							this.addBuyer(buy);
						}
					}
					// Wants One
					else if (buyerRoll == 2){
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Wants One", "PerformanceCars", 0.4);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Wants One", "Pickups", 0.4);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Wants One", "Cars", 0.4);
							this.addBuyer(buy);
						}
					}
					else {
						// Wants Performance
						if (wantedRoll == 1){
							Buyer buy = new Buyer("Needs One", "PerformanceCars", 0.7);
							this.addBuyer(buy);
						}
						// Wants Pickups
						else if (wantedRoll == 2){
							Buyer buy = new Buyer("Needs One", "Pickups", 0.7);
							this.addBuyer(buy);
						}
						// Wants Cars
						else {
							Buyer buy = new Buyer("Needs One", "Cars", 0.7);
							this.addBuyer(buy);
						}
					}
				}
			}
		}
		System.out.println(buyers.size());
	}
	public int createVehicleID(){
		return 0;
	}
	// Other Functions
	public void opening() {
		System.out.println("Day: " + currentDay);
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
			this.setOperatingBudget(500000);
			System.out.println("opened");
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
	}
	public void washing() {
		//Iterate over all 3 interns
		for (int i = 0; i < 3; i++){
			int vehiclesWashed = 0;

			//Iterate over all three vehicles lists (0-3:performance, 4-7:pickups, 8-11:cars)
			for (int j = 0; j < 12; j++){
				// check if reached limit
				if (vehiclesWashed == 2){
					break;
				}
				//Iterate through perforance car inventory
				if (j < 4){
					if (performanceCarInventory.get(j).getCleanliness() == "Dirty"){
						int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						if (washRoll < 81){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() 
							+ " clean!");
							performanceCarInventory.get(j).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						if (washRoll <= 100 && washRoll > 90){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() 
							+ " sparkling!($" + performanceCarInventory.get(j).getWashBonus() + " bonus)");

							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + performanceCarInventory.get(j).getWashBonus());
							operatingBudget -= performanceCarInventory.get(j).getWashBonus();
							performanceCarInventory.get(j).setCleanliness("Sparkling");
							vehiclesWashed += 1;
						}
					}
				}

				else if (j >= 4 && j < 8){
					if (pickupsInventory.get(j-4).getCleanliness() == "Dirty"){
						int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						if (washRoll < 81){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() 
							+ " clean!");
							pickupsInventory.get(j-4).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						if (washRoll <= 100 && washRoll > 90){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() 
							+ " sparkling!($" + pickupsInventory.get(j-4).getWashBonus() + " bonus)");

							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + pickupsInventory.get(j-4).getWashBonus());
							operatingBudget -= pickupsInventory.get(j-4).getWashBonus();
							pickupsInventory.get(j-4).setCleanliness("Sparkling");
							vehiclesWashed += 1;

						}
					}
				}
				else {
					if (carsInventory.get(j-8).getCleanliness() == "Dirty"){
						int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
						if (washRoll < 81){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() 
							+ " clean!");
							carsInventory.get(j-8).setCleanliness("Clean");
							vehiclesWashed += 1;
						}
						if (washRoll <= 100 && washRoll > 90){
							System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() 
							+ " sparkling!($" + carsInventory.get(j-8).getWashBonus() + " bonus)");

							internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + carsInventory.get(j-8).getWashBonus());
							operatingBudget -= carsInventory.get(j-8).getWashBonus();
							carsInventory.get(j-8).setCleanliness("Sparkling");
							vehiclesWashed += 1;
						}
					}
				}
			}

			if (vehiclesWashed < 2){
				for (int j = 0; j < 12; j++){
					// check if reached limit
					if (vehiclesWashed == 2){
						break;
					}
					//Iterate through perforance car inventory
					if (j < 4){
						if (performanceCarInventory.get(j).getCleanliness() == "Clean"){
							int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
							if (washRoll <= 5){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() + " dirty!");
								performanceCarInventory.get(j).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							if (washRoll <= 100 && washRoll > 70){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + performanceCarInventory.get(j).getID() 
								+ " sparkling!($" + performanceCarInventory.get(j).getWashBonus() + " bonus)");

								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + performanceCarInventory.get(j).getWashBonus());
								performanceCarInventory.get(j).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
						}
					}
	
					else if (j >= 4 && j < 8){
						if (pickupsInventory.get(j-4).getCleanliness() == "Clean"){
							int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
							if (washRoll <= 5){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() + " dirty!");
								pickupsInventory.get(j-4).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							if (washRoll <= 100 && washRoll > 70){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + pickupsInventory.get(j-4).getID() 
								+ " sparkling!($" + pickupsInventory.get(j-4).getWashBonus() + " bonus)");

								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + pickupsInventory.get(j-4).getWashBonus());
								pickupsInventory.get(j-4).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
						}
					}
					else {
						if (carsInventory.get(j-8).getCleanliness() == "Clean"){
							int washRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
							if (washRoll <= 5){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() + " dirty!");
								carsInventory.get(j-8).setCleanliness("Dirty");
								vehiclesWashed += 1;
							}
							if (washRoll <= 100 && washRoll > 70){
								System.out.println(internStaff.get(i).getUniqueName() + " has made " + carsInventory.get(j-8).getID() 
								+ " sparkling!($" + carsInventory.get(j-8).getWashBonus() + " bonus)");

								internStaff.get(i).setBonusPay(internStaff.get(i).getBonusPay() + carsInventory.get(j-8).getWashBonus());
								carsInventory.get(j-8).setCleanliness("Sparkling");
								vehiclesWashed += 1;
							}
						}
					}
				} 
			}
		}
	}
	public void repairing() {
		for (int i = 0; i < 3; i++){
			int vehiclesFixed = 0;

			for (int j = 0; j < 12; j++){
				if (vehiclesFixed == 2){
					break;
				}

				//
				if (j < 4){
					if (performanceCarInventory.get(j).getCondition() == "Broken"){
						int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						if (repairRoll <= 80){
							System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Broken car " + performanceCarInventory.get(j).getID() 
							+ " and made it Used!($" + performanceCarInventory.get(j).getRepairBonus() + " bonus)");

							performanceCarInventory.get(j).setCondition("Used");
							mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + performanceCarInventory.get(j).getRepairBonus());
							
							if (performanceCarInventory.get(j).getCleanliness() == "Sparkling"){
								performanceCarInventory.get(j).setCleanliness("Clean");
							}
							else if (performanceCarInventory.get(j).getCleanliness() == "Clean"){
								performanceCarInventory.get(j).setCleanliness("Dirty");
							}
						}
						else {
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
				else if (j >= 4 && j < 8){
					if (pickupsInventory.get(j-4).getCondition() == "Broken"){
						int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						if (repairRoll <= 80){
							System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Broken car " + pickupsInventory.get(j-4).getID() 
							+ " and made it Used!($" + pickupsInventory.get(j-4).getRepairBonus() + " bonus)");

							pickupsInventory.get(j-4).setCondition("Used");
							mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + pickupsInventory.get(j-4).getRepairBonus());
							
							if (pickupsInventory.get(j-4).getCleanliness() == "Sparkling"){
								pickupsInventory.get(j-4).setCleanliness("Clean");
							}
							else if (pickupsInventory.get(j-4).getCleanliness() == "Clean"){
								pickupsInventory.get(j-4).setCleanliness("Dirty");
							}
						}
						else {
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
				else {
					if (carsInventory.get(j-8).getCondition() == "Broken"){
						int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

						if (repairRoll <= 80){
							System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Broken car " + carsInventory.get(j-8).getID() 
							+ " and made it Used!($" + carsInventory.get(j-8).getRepairBonus() + " bonus)");

							carsInventory.get(j-8).setCondition("Used");
							mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + carsInventory.get(j-8).getRepairBonus());
							
							if (carsInventory.get(j-8).getCleanliness() == "Sparkling"){
								carsInventory.get(j-8).setCleanliness("Clean");
							}
							else if (carsInventory.get(j-8).getCleanliness() == "Clean"){
								carsInventory.get(j-8).setCleanliness("Dirty");
							}
						}
						else {
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
			if (vehiclesFixed < 2){
				for (int j = 0; j < 12; j++){
					if (j < 4){
						if (performanceCarInventory.get(j).getCondition() == "Used"){
							int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
	
							if (repairRoll <= 80){
								System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Used car " + performanceCarInventory.get(j).getID() 
								+ " and made it Like New!($" + performanceCarInventory.get(j).getRepairBonus() + " bonus)");
	
								performanceCarInventory.get(j).setCondition("Like New");
								mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + performanceCarInventory.get(j).getRepairBonus());
								
								if (performanceCarInventory.get(j).getCleanliness() == "Sparkling"){
									performanceCarInventory.get(j).setCleanliness("Clean");
								}
								else if (performanceCarInventory.get(j).getCleanliness() == "Clean"){
									performanceCarInventory.get(j).setCleanliness("Dirty");
								}
							}
							else {
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
					else if (j >= 4 && j < 8){
						if (pickupsInventory.get(j-4).getCondition() == "Used"){
							int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
	
							if (repairRoll <= 80){
								System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Used car " + pickupsInventory.get(j-4).getID() 
								+ " and made it Like New!($" + pickupsInventory.get(j-4).getRepairBonus() + " bonus)");
	
								pickupsInventory.get(j-4).setCondition("Like New");
								mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + pickupsInventory.get(j-4).getRepairBonus());
								
								if (pickupsInventory.get(j-4).getCleanliness() == "Sparkling"){
									pickupsInventory.get(j-4).setCleanliness("Clean");
								}
								else if (pickupsInventory.get(j-4).getCleanliness() == "Clean"){
									pickupsInventory.get(j-4).setCleanliness("Dirty");
								}
							}
							else {
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
					else {
						if (carsInventory.get(j-8).getCondition() == "Used"){
							int repairRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
	
							if (repairRoll <= 80){
								System.out.println(mechanicStaff.get(i).getUniqueName() + " has repaired Used car " + carsInventory.get(j-8).getID() 
								+ " and made it Like New!($" + carsInventory.get(j-8).getRepairBonus() + " bonus)");
	
								carsInventory.get(j-8).setCondition("Like New");
								mechanicStaff.get(i).setBonusPay(mechanicStaff.get(i).getBonusPay() + carsInventory.get(j-8).getRepairBonus());
								
								if (carsInventory.get(j-8).getCleanliness() == "Sparkling"){
									carsInventory.get(j-8).setCleanliness("Clean");
								}
								else if (carsInventory.get(j-8).getCleanliness() == "Clean"){
									carsInventory.get(j-8).setCleanliness("Dirty");
								}
							}
							else {
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
	public void selling() {

	}
	public void ending() {
		int counterM = 0; //counter to create print table
		int counterS = 0;
		int counterI = 0;
		int counterDM = 0;
		int counterDS = 0;
		int counterDI = 0;
		int counterPC = 0;
		int counterC = 0;
		int counterP = 0;
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
		Random ran = new Random();
		int mechanicQuitChance = ran.nextInt(10) + 1; // if mechanicQuitChance = 1; a mechanic quits
		int salespersonQuitChance = ran.nextInt(10) + 1; // if salespersonQuitChance = 1; a salesperson quits
		int internQuitChance = ran.nextInt(10) + 1; // if internQuitChance = 1; a intern quits
		if (mechanicQuitChance == 1) { //mechanic quits
			departedMStaff.add(mechanicStaff.get(0));
			mechanicStaff.remove(0);
			counterM = counterM - 1;
		}
		if (salespersonQuitChance == 1) { //salesperson quits
			departedSStaff.add(salespersonStaff.get(0));
			salespersonStaff.remove(0);
			counterS = counterS - 1;
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
		final Object[][] tableDM = new String[counterDM][];
		final Object[][] tableDS = new String[counterDS][];
		final Object[][] tableDI = new String[counterDI][];
		final Object[][] tablePC = new String[counterPC][];
		final Object[][] tableC = new String[counterC][];
		final Object[][] tableP = new String[counterP][];
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
		for (int i = 0; i < departedMStaff.size(); i++) { //adds all working quit mechanics to table
			tableDM[i] = new String[] {departedMStaff.get(i).getUniqueName(), Integer.toString(departedMStaff.get(i).getDaysWorked()), String.valueOf(departedMStaff.get(i).getNormalPay()), String.valueOf(departedMStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < departedSStaff.size(); i++) { //adds all working quit salesperson to table
			tableDS[i] = new String[] {departedSStaff.get(i).getUniqueName(), Integer.toString(departedSStaff.get(i).getDaysWorked()), String.valueOf(departedSStaff.get(i).getNormalPay()), String.valueOf(departedSStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < departedIStaff.size(); i++) { //adds all working quit intern to table
			tableDI[i] = new String[] {departedIStaff.get(i).getUniqueName(), Integer.toString(departedIStaff.get(i).getDaysWorked()), String.valueOf(departedIStaff.get(i).getNormalPay()), String.valueOf(departedIStaff.get(i).getBonusPay()), "Quit"};
		}
		for (int i = 0; i < performanceCarInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", performanceCarInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", performanceCarInventory.get(i).getSalesPrice());
			tablePC[i] = new String[] {performanceCarInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, performanceCarInventory.get(i).getCondition(), performanceCarInventory.get(i).getCleanliness(), "In Stock"};
		}
		for (int i = 0; i < carsInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", performanceCarInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", performanceCarInventory.get(i).getSalesPrice());
			tableC[i] = new String[] {carsInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, carsInventory.get(i).getCondition(), carsInventory.get(i).getCleanliness(), "In Stock"};
		}
		for (int i = 0; i < pickupsInventory.size(); i++) {
			String carCostPrice = String.format("%.2f", performanceCarInventory.get(i).getCostPrice());
			String carSalesPrice = String.format("%.2f", performanceCarInventory.get(i).getSalesPrice());
			tableP[i] = new String[] {pickupsInventory.get(i).getID(), "$" + carCostPrice, "$" + carSalesPrice, pickupsInventory.get(i).getCondition(), pickupsInventory.get(i).getCleanliness(), "In Stock"};
		}
		String newOperatingBudget = String.format("%.2f", operatingBudget);
		tableSales[0] = new String[] {"$" + newOperatingBudget, "$ Total Sales"}; //INCOMPLETE
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
		for (final Object[] row : tableDM) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableDS) {
			System.out.format("%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableDI) {
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
		for (final Object[] row : tablePC) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableC) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		for (final Object[] row : tableP) {
			System.out.format("%15s%15s%15s%15s%15s%15s%n", row);
		}
		System.out.println("Total Budget and Sales:");
		for (final Object[] row : tableSales) {
			System.out.format("%15s%15s%n", row);
		}
	}
	public static void main(String[] args) {
		FNCD sim = new FNCD();

		sim.opening();

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
