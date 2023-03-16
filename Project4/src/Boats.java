import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Boats extends Vehicles{
	private int baitCount; //EC unique attribute
	public int getBaitCount() {
		return this.baitCount;
	}
	public void setBaitCount(int rang) {
		baitCount = rang;
	}
	public Boats(String identity){
		setID(identity);
		setCarType("Boats");
		setSalesBonus(500.0); //price copied from Cars
		setRepairBonus(50.0); //copied from cars
		setWashBonus(10.0); //copied from cars
		setBaitCount(ThreadLocalRandom.current().nextInt(60, 400+1)); //Setting initially as 60-400

		Random r = new Random();
        double rand = 10000 + (20000 - 10000) * r.nextDouble();
		int conditionRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		int cleanlinessRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);

		if (conditionRoll == 1){
			setCondition("Like New");
			setCostPrice(rand);
			setSalesPrice(rand * 2.0);
			setBaitCount(getBaitCount() + 100); //Increases by 100 if Like New
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
