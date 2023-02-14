
public class Staff {
	// Private Class Variables
	private String uniqueName;
	private double salary;
	private int daysWorked;
	private double totalNormalPay;
	private double totalBonusPay;
	// Setters
	public void setUniqueName(String name) {
		uniqueName = name;
	}
	public void setDaysWorked(int days) {
		daysWorked = days;
	}
	public void setNormalPay(double norm) {
		totalNormalPay = norm;
	}
	public void setBonusPay(double bonus) {
		totalBonusPay = bonus;
	}
	// Getters
	public String getUniqueName() {
		return this.uniqueName;
	}
	public double getSalary() {
		return this.salary;
	}
	public int getDaysWorked() {
		return this.daysWorked;
	}
	public double getNormalPay() {
		return this.totalNormalPay;
	}
	public double getBonusPay() {
		return this.totalBonusPay;
	}
	public static void main(String[] args) {
	}

}
