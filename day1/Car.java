package week1.day1;

public class Car {
	
	public void drivecar() {
		System.out.println("drive the car");
	}

	public void applybrake() {
		System.out.println("brake is appliesd upon needed");
	}
	
	public void soundhorn() {
		System.out.println("blow horn for warning");
	}
	
	public void ispuncher() {
		System.out.println("my car is punchered");
	}
	
	
	public static void main(String[] args) {
		
     Car vehicle=new Car();
     vehicle.drivecar();
     vehicle.applybrake();
     vehicle.soundhorn();
     vehicle.ispuncher();
     
	}
	
}
   
