package proj6;
import java.util.concurrent.ThreadLocalRandom;

public class Horse {
	private String horseName;
	private String breed;
	private int speed;
	private int agility;
	private int endurance;
	private String trait;
	private int wins;
	private int losses;
	private double winloss;
	private int age;
	
	public String getHorseName() {
		return this.horseName;
	}
	public void setHorseName(String name) {
		horseName = name;
	}
	
	public String getBreed() {
		return this.breed;
	}
	public void setBreed(String bred) {
		breed = bred;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int sped) {
		speed = sped;
	}
	
	public int getAgility() {
		return this.agility;
	}
	public void setAgility(int agil) {
		agility = agil;
	}
	
	public int getEndurance() {
		return this.endurance;
	}
	public void setEndurance(int endur) {
		endurance = endur;
	}
	
	public String getTrait() {
		return this.trait;
	}
	public void setTrait(String tra) {
		trait = tra;
	}
	
	public int getWins() {
		return this.wins;
	}
	public void setWins(int win) {
		wins = win;
	}
	
	public int getLosses() {
		return this.losses;
	}
	public void setLosses(int los) {
		losses = los;
	}
	
	public double getWinLoss() {
		return this.winloss;
	}
	public void setWinLoss(int wi, int lo) {
		winloss = wi/lo;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int ag) {
		age = ag;
	}
	
	public Horse(String nam){
		setHorseName(nam);
		int breedRoll = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		int speedRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int agilityRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int enduranceRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int traitRoll = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		int ageRoll = ThreadLocalRandom.current().nextInt(2, 5 + 1); // Horses typically start racing at 2 and retire at 6.
		
		if (breedRoll == 1) {
			setBreed("Thoroughbred"); //known for speed and athleticism, often used for horse racing
			if (speedRoll < 60) {
				setSpeed(speedRoll + 30);
			}
			else {
				setSpeed(speedRoll);
			}
			if (agilityRoll < 40) {
				setAgility(agilityRoll + 10);
			}
			else {
				setAgility(agilityRoll);
			}
			setEndurance(enduranceRoll);
			setAge(ageRoll);
		}
		else if (breedRoll == 2) {
			setBreed("Arabian"); //high energy and endurance, used for long-distance trail riding
			setSpeed(speedRoll);
			if (agilityRoll < 40) {
				setAgility(agilityRoll + 10);
			}
			else {
				setAgility(agilityRoll);
			}
			if (enduranceRoll < 60) {
				setEndurance(enduranceRoll + 30);
			}
			else {
				setEndurance(enduranceRoll);
			}
			setAge(ageRoll);
		}
		
		else if (breedRoll == 3) {
			setBreed("Quarter House"); //versatility, used for rodeo events, ranch work, and trail riding
			if (speedRoll < 40) {
				setSpeed(speedRoll + 10);
			}
			else {
				setSpeed(speedRoll);
			}
			if (agilityRoll < 40) {
				setAgility(agilityRoll + 15);
			}
			else {
				setAgility(agilityRoll);
			}
			if (enduranceRoll < 40) {
				setEndurance(enduranceRoll + 15);
			}
			else {
				setEndurance(enduranceRoll);
			}
			setAge(ageRoll);
		}
		else if (breedRoll == 4) {
			setBreed("Andalusian"); //elegant movement and strong build. used for classical riding
			if (speedRoll < 40) {
				setSpeed(speedRoll + 10);
			}
			else {
				setSpeed(speedRoll);
			}
			if (agilityRoll < 60) {
				setAgility(agilityRoll + 30);
			}
			else {
				setAgility(agilityRoll);
			}
			setEndurance(enduranceRoll);
			setAge(ageRoll);
		}
		else {
			setBreed("Clydesdale"); //size and strength, used for pulling wagons and plows.
			setSpeed(speedRoll);
			if (agilityRoll < 40) {
				setAgility(agilityRoll + 10);
			}
			else {
				setAgility(agilityRoll);
			}
			if (enduranceRoll < 60) {
				setEndurance(enduranceRoll + 30);
			}
			else {
				setEndurance(enduranceRoll);
			}
			setAge(ageRoll);
		}
		if (traitRoll == 1) {
			setTrait("Feisty");
			setSpeed(getSpeed() + 10);
			setAgility(getAgility() - 10);
		}
		else if (traitRoll == 2) {
			setTrait("Speedy");
			setSpeed(getSpeed() + 15);
			setEndurance(getEndurance() - 10);
		}
		else if (traitRoll == 3) {
			setTrait("Strong");
			setSpeed(getSpeed() - 10);
			setEndurance(getEndurance() + 15);
		}
		else if (traitRoll == 4) {
			setTrait("Unlucky");
			setSpeed(getSpeed() - 5);
			setAgility(getAgility() - 5);
			setEndurance(getEndurance() - 5);
		}
		else {
			setTrait("Perfect");
			setSpeed(getSpeed() + 10);
			setAgility(getAgility() + 10);
			setEndurance(getEndurance() + 10);
		}
	}
}
