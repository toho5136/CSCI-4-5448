
public class SatelliteRadio extends Vehicles{
	Vehicles vehicle;
	public SatelliteRadio(Vehicles vehicle) {
		this.vehicle = vehicle;
	}
	public double getSalesPrice() {
		return vehicle.getSalesPrice()*1.05;
	}
}
