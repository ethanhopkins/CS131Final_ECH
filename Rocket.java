/**
* Rocket class for MoonGoer
* Allows for the creation of a rocket object with the attributes of weight and fuel.
* Uses functions thrustersOn and thrustersOff to adjust rocket's position based on its velocity.
*
* @author Ethan Hopkins
* @version 1.0
* MoonGoer Game
* Spring Semester/Freshman Year
*/
import java.util.Random;
import java.util.Scanner;

public class Rocket extends Gravity {
	double fuel; //fuel variable to hold fuel
	double velocity = 0; //velocity variable to hold the rocket's velocity
	double weight; //weight will contribute to the velocity calculation.
	boolean active = true; //tracks whether or not the user has activated/deactivated thrusters.
	Random generator = new Random();
	
	
	Scanner scan = new Scanner(System.in);
	
	/**
	 * Default constructor
	 */
	public Rocket() {
		fuel = 0;
		weight = 0;
	}//end default constructor
		
		
	/**
	 * preferred constructor
	 * @param fuel passes a new value for fuel
	 * @param weight passes a new value for weight
	 */
	public Rocket(double fuel, double weight) {
		this.fuel = fuel;
		this.weight = weight;
	}//end preferred constructor
	
	
	/**
	 * Calculate velocity function
	 * @return velocity
	 */
	public double calcVelocity() {
		velocity = ((fuel + weight) / weight) - gravity * .1;
		return velocity;
	}//end calcVelocity function
	
	
	/**
	 * thrustersOn function
	 * turns on the rockets' thrusters, launching the rocket.
	 */
	public void thrustersOn() {
		calcVelocity();
		if (velocity >= 2) {
			height = height + 3;
			fuel = fuel - 10000;
			update();
			
		} else if (velocity < 2 && velocity > 1) {
			height = height + 2;
			fuel = fuel - 10000;
			update();
			
		} else {
			height++;
			fuel = fuel - 10000;
			update();
			
		}
	}//end thrustersOn function
	
	
	/**
	 * thrustersOff function
	 * turns off the rockets' thrusters, dropping the rocket.
	 */
	public void thrustersOff() {
		calcVelocity();
		if (velocity >= 2) {
			height = height - 2;
			update();
			
		} else if (velocity < 2 && velocity > 1) {
			height = height--;
			update();
			
		} else {
			update();
			
		}
	}//end thrustersOff function
	
	
//end program
}
