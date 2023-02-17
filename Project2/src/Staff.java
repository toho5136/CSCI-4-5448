
/* Example of encapsulation: all methods that are used only by Staff 
 * can be found exclusively in this class. Only Staff and its 
 * subclasses use the related functions.
 */
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
	// Although we don't necessarily have an example of polymorphism in our code,
	// If this function were to have different implementations in each child class,
	// then it would be an example of polymorphism
	public void setBonusPay(double bonus) {
		totalBonusPay = bonus;
	}
	public void setSalary(double pay) {
		salary = pay;
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
