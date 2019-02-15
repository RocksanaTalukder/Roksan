package abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car Corolla = new Toyota();
		Corolla.Shape();
		Corolla.Start();
		Corolla.Stop();
		
		
		Toyota Lexus = new Toyota();
		Lexus.color();
		
		MotorVehicle mv = new Toyota();
		mv.AutoStart();
		mv.engine();
		
		
	

	}

}
