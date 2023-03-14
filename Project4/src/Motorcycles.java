import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Motorcycles extends Vehicles{
	private double engineSize;
	public double getEngineSize() {
		return this.engineSize;
	}
	public void setEngineSize(double engine) {
		engineSize = engine;
	}
	public Motorcycles(String identity){
		setID(identity);
		setCarType("Motorcycles");
		setSalesBonus(700.0); //copied from pickups
		setRepairBonus(75.0); //copied from pickups
		setWashBonus(15.0); //copied from pickups
		setRacesWon(0);
		boolean over50 = true;
		Random randomEngine = new Random();
		double setEngine = 0;
		while(over50) {
			setEngine = randomEngine.nextGaussian(700, 300);
			if(setEngine>=50) {
				over50 = false; //setEngine is over 50, breaks out of while loop
			}
		}
		setEngineSize(setEngine);

		Random r = new Random();
        double rand = 10000 + (40000 - 10000) * r.nextDouble();
		int conditionRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		int cleanlinessRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

		if (conditionRoll == 1){
			setCondition("Like New");
			setCostPrice(rand);
			setSalesPrice(rand * 2.0);
		}
		else if (conditionRoll == 2){
			setCondition("Used");
			setCostPrice(0.8 * rand);
			setSalesPrice((0.8 * rand) * 2.0);
		}
		else if (conditionRoll == 3){
			setCondition("Broken");
			setCostPrice(0.5 * rand);
			setSalesPrice(rand);
		}

		if (cleanlinessRoll <= 5){
			setCleanliness("Sparkling");
		}
		else if (cleanlinessRoll > 5 && cleanlinessRoll <= 40){
			setCleanliness("Clean");
		}
		else if (cleanlinessRoll > 40 && cleanlinessRoll <= 100){
			setCleanliness("Dirty");
		}
	}
}
