package proj6;
import java.util.concurrent.ThreadLocalRandom;

import proj6.Horse.Andalusian;
import proj6.Horse.Arabian;
import proj6.Horse.Clydesdale;
import proj6.Horse.QuarterHouse;
import proj6.Horse.Thoroughbred;

public class HorseFactory {
	public static Horse createHorse(String name) {
		int breedRoll = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		int speedRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int agilityRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int enduranceRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int traitRoll = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		int ageRoll = ThreadLocalRandom.current().nextInt(2, 5 + 1);
		
		switch (breedRoll) {
		case 1:
			return new Thoroughbred(name, speedRoll, agilityRoll, enduranceRoll, ageRoll);
		case 2:
			return new Arabian(name, speedRoll, agilityRoll, enduranceRoll, ageRoll);
		case 3:
			return new QuarterHouse(name, speedRoll, agilityRoll, enduranceRoll, ageRoll);
		case 4:
			return new Andalusian(name, speedRoll, agilityRoll, enduranceRoll, ageRoll);
		default:
			return new Clydesdale(name, speedRoll, agilityRoll, enduranceRoll, ageRoll);
		}
	}
}
