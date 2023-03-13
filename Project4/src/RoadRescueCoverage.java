
public class RoadRescueCoverage extends Vehicles{
	Vehicles vehicle;
	public RoadRescueCoverage(Vehicles vehicle) {
		this.vehicle = vehicle;
	}
	public double getSalesPrice() {
		return vehicle.getSalesPrice()*1.02;
	}
}
