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
	}
}
