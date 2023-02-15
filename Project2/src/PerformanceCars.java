import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class PerformanceCars extends Vehicles{
	public PerformanceCars(String name){
		setUniqueName(name);
		setCarType("PerformanceCars");
		setSalesBonus(1000.0);
		setRepairBonus(100.0);
		setWashBonus(25.0);

		Random r = new Random();
        double rand = 20000 + (40000 - 20000) * r.nextDouble();
		int conditionRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		int cleanlinessRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

		setCostPrice(rand);
		setSalesPrice(rand * 2.0);
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
