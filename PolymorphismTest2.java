interface CityGasGuage {
	int getMonthlyGasAmountUsed();
}

abstract class Building implements CityGasGuage {
	private int floorCount;
	private int monthlyGasAmountUsed;

	public Building(int _floorCount) {
		floorCount = _floorCount;
	}

	public int getFloorCount() {
		return floorCount;
	}

	public int getMonthlyGasAmountUsed() {
		return monthlyGasAmountUsed;
	}

	public void setMonthlyGasAmountUsed(int _gasAmountUsed) {
		monthlyGasAmountUsed = _gasAmountUsed;
	}

	abstract public int getParkingCount();
}

class Villa extends Building {
	public Villa(int _floorCount) {
		super(_floorCount);
	}

	public int getParkingCount() {
		return 0;
	}
}

class StoreBuilding extends Building {

	public StoreBuilding(int _floorCount) {
		super(_floorCount);
	}

	public int getParkingCount() {
		return 5;
	}

}

class Apartment extends Building {
	int parkingA, parkingB, parkingC;

	public Apartment(int _floorCount, int _parkingA, int _parkingB,
			int _parkingC) {
		super(_floorCount);

		parkingA = _parkingA;
		parkingB = _parkingB;
		parkingC = _parkingC;
	}

	public int getParkingACount() {
		return parkingA;
	}

	public int getParkingCount() {
		return parkingA + parkingB + parkingC;
	}

}

public class PolymorphismTest2 {
	public static void main(String[] args) {
		Building villa = new Villa(5);
		Building stores = new StoreBuilding(7);
		Building apart = new Apartment(20, 10, 20, 30);

		System.out.println("빌라: " + villa.getFloorCount() + "층, 주차: "
				+ villa.getParkingCount());
		System.out.println("상가: " + stores.getFloorCount() + "층, 주차: "
				+ stores.getParkingCount());
		System.out.println("아파트: " + apart.getFloorCount() + "층, 주차: "
				+ apart.getParkingCount());

		villa.setMonthlyGasAmountUsed(50);
		stores.setMonthlyGasAmountUsed(150);
		apart.setMonthlyGasAmountUsed(250);

		System.out.println(":::::");

		printGasAmount(villa, "빌라 가스사용량: ");
		printGasAmount(stores, "상가 가스사용량: ");
		printGasAmount(apart, "아파트 가스사용량: ");
	}

	private static void printGasAmount(CityGasGuage gasGuage, String title) {
		System.out.println(title + gasGuage.getMonthlyGasAmountUsed());
	}
}
