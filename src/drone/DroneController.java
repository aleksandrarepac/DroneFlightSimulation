package drone;

public class DroneController {

	public static void main(String[] args) {
		
		Drone drone= new Drone();
		System.out.println("Dron ide gore!");
		while(drone.coordinates[1]<10){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje desno!");
		while(drone.coordinates[0]<50){
			drone.moveRight();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Podizanje gore 2!");
		while(drone.coordinates[1]<50){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Drone ide napred");
		while(drone.coordinates[2]>15)
		{
			drone.moveForth();
			System.out.println(drone.getFormatedCoordinates());
			
		}
		System.out.println("Drone ide levo");
		while(drone.coordinates[0]>30)
		{
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
			
		}
		System.out.println("Drone je na kocki");
		while(drone.coordinates[2]<30)
		{
			drone.moveBack();
			System.out.println(drone.getFormatedCoordinates());
			
		}
		System.out.println("Drone ide opet levo");
		while(drone.coordinates[0]>0)
		{
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
			
		}
		System.out.println("Drone ide na cilj");
		while(drone.coordinates[1]>30)
		{
			drone.moveDown();
			System.out.println(drone.getFormatedCoordinates());
			
		}
		
	}
}