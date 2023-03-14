
public class Driver extends Staff{
	private String condition;
	private int racesWon;
	public String getCondition() {
		return this.condition;
	}
	public int getRacesWon() {
		return this.racesWon;
	}
	public void setCondition(String cond) {
		condition = cond;
	}
	public void setRacesWon(int race) {
		racesWon = race;
	}
	public Driver(String name){
		setSalary(20.50);
		setUniqueName(name);
		setDaysWorked(0);
		setNormalPay(0.0);
		setBonusPay(0.0);
		setCondition("Good");
		setRacesWon(0);
	}
}