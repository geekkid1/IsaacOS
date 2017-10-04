package reference;

public class Car {
	int wheels = 4;
	String make;
	String model;
	int doors;
	double mpg;
	int fuelCap;
	double mileage;
	double fuel; {
		if (fuel > fuelCap)	 {
			fuel = fuelCap;
		}
}
	public double getMileage() {
		this.mileage = mpg * fuel;
		return this.mileage;
	}
}