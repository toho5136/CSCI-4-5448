import java.util.concurrent.ThreadLocalRandom;

public class Intern extends Staff{
	private Washer washMethod;

	public Intern(String name){
		setSalary(10.50);
		setUniqueName(name);
		setDaysWorked(0);
		setNormalPay(0.0);
		setBonusPay(0.0);

		int washRoll = ThreadLocalRandom.current().nextInt(1, 3 + 1);

		if (washRoll == 1){
			this.washMethod = new ChemicalWasher();
		}
		else if (washRoll == 2){
			this.washMethod = new ElbowGreaseWasher();
		}
		else if (washRoll == 3){
			this.washMethod = new DetailedWasher();
		}
	}

	public Washer getWashMethod(){
		return washMethod;
	}
}
