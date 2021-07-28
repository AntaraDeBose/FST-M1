package activities;

public class Activity1 {

	public static void main(String[] args) {
		//creating an Object of the Car class
Car Maruti= new Car();
Maruti.make= 2014;
Maruti.color="Black";
Maruti.transmission="Manual";

//Car class methods

Maruti.displayCharacteristics();
Maruti.accelarate();
Maruti.brake();

	}

}
