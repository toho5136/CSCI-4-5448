
public class Undercoating extends VehiclesDecorator{
	Vehicles vehicle;
	public Undercoating(Vehicles vehicle) {
		this.vehicle = vehicle;
	}
	public double getSalesPrice() {
		return vehicle.getSalesPrice()*1.05;
	}
}
