package proj7;
import java.util.concurrent.ThreadLocalRandom;

public class HorseFactory {
	public static Horse createHorse(String name) {
		int breedRoll = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		int speedRoll = ThreadLocalRandom.current().nextInt(20, 50 + 1);
		int agilityRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int enduranceRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int traitRoll = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		int ageRoll = ThreadLocalRandom.current().nextInt(2, 5 + 1);
		
		Horse horse = new Horse();
		switch (breedRoll) {
		case 1:
			return horse.new Thoroughbred(name, speedRoll, agilityRoll, enduranceRoll, traitRoll, ageRoll);
		case 2:
			return horse.new Arabian(name, speedRoll, agilityRoll, enduranceRoll, traitRoll, ageRoll);
		case 3:
			return horse.new QuarterHouse(name, speedRoll, agilityRoll, enduranceRoll, traitRoll, ageRoll);
		case 4:
			return horse.new Andalusian(name, speedRoll, agilityRoll, enduranceRoll, traitRoll, ageRoll);
		default:
			return horse.new Clydesdale(name, speedRoll, agilityRoll, enduranceRoll, traitRoll, ageRoll);
		}
	}
}
