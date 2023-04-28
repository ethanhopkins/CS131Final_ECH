/**
* Application class for MoonGoer
* Executes MoonGoer by making new rocket and screen objects.
*
* @author Ethan Hopkins
* @version 1.0
* MoonGoer Game
* Spring Semester/Freshman Year
*/

public class Application extends Screen{

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		/**
		 * This is the title screen.
		 * The map has a scale of 30 x 14 characters.
		 */
		Rocket r12 = new Rocket(125000, 85000); //creates a new rocket object with fuel of 125000 and weight of 85000
		System.out.println(r12.fuel);
		System.out.println(r12.weight);
		
		Screen s = new Screen(); //creates a new screen object s
		
	/**
	 * game loop
	 * repeats until a gameOver screen is present.
	 */
	while (gameOver == false) {
		if (s.getActive() == true) {
			r12.checkGravity();
			r12.thrustersOn();
			
		} else {
			r12.checkGravity();
			r12.thrustersOff();
			s.update();
		}
		
	}//end game loop
	if (gameOver == true) {
		s.height = 28;
		s.update();
		}
		
	}

//end program
}
