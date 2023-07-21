package rensyu21niti;

public class Car {
//	ガソリンの残量(リットル)
	double fuelRest;
//	燃費(キロメートル/リットル)
	double fuelRatio;
//	タンク容量のフィールド変数
	double fuelMax;
	
	public Car(double fuelRest,double fuelRatio,double fuelMax) {
		this.fuelRest = fuelRest;
		this.fuelRatio = fuelRatio;
		this.fuelMax = fuelMax;
	}
	//ガソリン残量を表示:
	public void displayFuel() {
		System.out.println("現在の燃料は"+this.fuelRest+"リットルです");
	}
	public void addFuel(double fuel) {
		if()
	}
}
