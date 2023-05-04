package proj6;

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
	private int stat;
	
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
	
	public int getStat() {
		return this.stat;
	}
	public void setStat() {
		stat = 0;
		if (speed > stat) {
			stat = speed;
		}
		if (agility > stat) {
			stat = agility;
		}
		if (endurance > stat) {
			stat = endurance;
		}
	}
	
	class Thoroughbred extends Horse {
		public Thoroughbred(String name, int speed, int agility, int endurance, int trait, int age) {
			this.setHorseName(name);
			this.setBreed("Thoroughbred");
			if (speed < 60) {
				this.setSpeed(speed + 30);
			}
			else {
				this.setSpeed(speed);
			}
			if (agility < 40) {
				this.setAgility(agility + 10);
			}
			else {
				this.setAgility(agility);
			}
			this.setEndurance(endurance);
			this.setAge(age);
			if (trait == 1) {
				this.setTrait("Feisty");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() - 10);
			}
			else if (trait == 2) {
				this.setTrait("Speedy");
				this.setSpeed(getSpeed() + 15);
				this.setEndurance(getEndurance() - 10);
			}
			else if (trait == 3) {
				this.setTrait("Strong");
				this.setSpeed(getSpeed() - 10);
				this.setEndurance(getEndurance() + 15);
			}
			else if (trait == 4) {
				this.setTrait("Unlucky");
				this.setSpeed(getSpeed() - 5);
				this.setAgility(getAgility() - 5);
				this.setEndurance(getEndurance() - 5);
			}
			else {
				this.setTrait("Perfect");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() + 10);
				this.setEndurance(getEndurance() + 10);
			}
			this.setStat();
		}
	}
	class Arabian extends Horse {
		public Arabian(String name, int speed, int agility, int endurance, int trait, int age) {
			this.setHorseName(name);
			this.setBreed("Arabian");
			this.setSpeed(speed);
			if (agility < 40) {
				this.setAgility(agility + 10);
			}
			else {
				this.setAgility(agility);
			}
			if (endurance < 60) {
				this.setEndurance(endurance + 30);
			}
			else {
				this.setEndurance(endurance);
			}
			this.setAge(age);
			if (trait == 1) {
				this.setTrait("Feisty");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() - 10);
			}
			else if (trait == 2) {
				this.setTrait("Speedy");
				this.setSpeed(getSpeed() + 15);
				this.setEndurance(getEndurance() - 10);
			}
			else if (trait == 3) {
				this.setTrait("Strong");
				this.setSpeed(getSpeed() - 10);
				this.setEndurance(getEndurance() + 15);
			}
			else if (trait == 4) {
				this.setTrait("Unlucky");
				this.setSpeed(getSpeed() - 5);
				this.setAgility(getAgility() - 5);
				this.setEndurance(getEndurance() - 5);
			}
			else {
				this.setTrait("Perfect");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() + 10);
				this.setEndurance(getEndurance() + 10);
			}
			this.setStat();
		}
	}
	class QuarterHouse extends Horse {
		public QuarterHouse(String name, int speed, int agility, int endurance, int trait, int age) {
			this.setHorseName(name);
			this.setBreed("QuarterHouse");
			if (speed < 40) {
				this.setSpeed(speed + 10);
			}
			else {
				this.setSpeed(speed);
			}
			if (agility < 40) {
				this.setAgility(agility + 15);
			}
			else {
				this.setAgility(agility);
			}
			if (endurance < 40) {
				this.setEndurance(endurance + 15);
			}
			else {
				this.setEndurance(endurance);
			}
			this.setAge(age);
			if (trait == 1) {
				this.setTrait("Feisty");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() - 10);
			}
			else if (trait == 2) {
				this.setTrait("Speedy");
				this.setSpeed(getSpeed() + 15);
				this.setEndurance(getEndurance() - 10);
			}
			else if (trait == 3) {
				this.setTrait("Strong");
				this.setSpeed(getSpeed() - 10);
				this.setEndurance(getEndurance() + 15);
			}
			else if (trait == 4) {
				this.setTrait("Unlucky");
				this.setSpeed(getSpeed() - 5);
				this.setAgility(getAgility() - 5);
				this.setEndurance(getEndurance() - 5);
			}
			else {
				this.setTrait("Perfect");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() + 10);
				this.setEndurance(getEndurance() + 10);
			}
			this.setStat();
		}
	}
	class Andalusian extends Horse {
		public Andalusian(String name, int speed, int agility, int endurance, int trait, int age) {
			this.setHorseName(name);
			this.setBreed("Andalusian");
			if (speed < 40) {
				this.setSpeed(speed + 10);
			}
			else {
				this.setSpeed(speed);
			}
			if (agility < 60) {
				this.setAgility(agility + 30);
			}
			else {
				this.setAgility(agility);
			}
			this.setEndurance(endurance);
			this.setAge(age);
			if (trait == 1) {
				this.setTrait("Feisty");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() - 10);
			}
			else if (trait == 2) {
				this.setTrait("Speedy");
				this.setSpeed(getSpeed() + 15);
				this.setEndurance(getEndurance() - 10);
			}
			else if (trait == 3) {
				this.setTrait("Strong");
				this.setSpeed(getSpeed() - 10);
				this.setEndurance(getEndurance() + 15);
			}
			else if (trait == 4) {
				this.setTrait("Unlucky");
				this.setSpeed(getSpeed() - 5);
				this.setAgility(getAgility() - 5);
				this.setEndurance(getEndurance() - 5);
			}
			else {
				this.setTrait("Perfect");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() + 10);
				this.setEndurance(getEndurance() + 10);
			}
			this.setStat();
		}
	}
	class Clydesdale extends Horse {
		public Clydesdale(String name, int speed, int agility, int endurance, int trait, int age) {
			this.setHorseName(name);
			this.setBreed("Clydesdale");
			this.setSpeed(speed);
			if (agility < 40) {
				this.setAgility(agility + 10);
			}
			else {
				this.setAgility(agility);
			}
			if (endurance < 60) {
				this.setEndurance(endurance + 30);
			}
			else {
				this.setEndurance(endurance);
			}
			this.setAge(age);
			if (trait == 1) {
				this.setTrait("Feisty");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() - 10);
			}
			else if (trait == 2) {
				this.setTrait("Speedy");
				this.setSpeed(getSpeed() + 15);
				this.setEndurance(getEndurance() - 10);
			}
			else if (trait == 3) {
				this.setTrait("Strong");
				this.setSpeed(getSpeed() - 10);
				this.setEndurance(getEndurance() + 15);
			}
			else if (trait == 4) {
				this.setTrait("Unlucky");
				this.setSpeed(getSpeed() - 5);
				this.setAgility(getAgility() - 5);
				this.setEndurance(getEndurance() - 5);
			}
			else {
				this.setTrait("Perfect");
				this.setSpeed(getSpeed() + 10);
				this.setAgility(getAgility() + 10);
				this.setEndurance(getEndurance() + 10);
			}
			this.setStat();
		}
	}
}
