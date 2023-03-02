
public class ExtendedWarranty extends VehiclesDecorator{
	Vehicles vehicle;
	public ExtendedWarranty(Vehicles vehicle) {
		this.vehicle = vehicle;
	}
	public double getSalesPrice() {
		return vehicle.getSalesPrice()*1.20;
	}
}
