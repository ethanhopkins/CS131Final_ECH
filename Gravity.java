/**
* Gravity class for MoonGoer
* Adjusts value of gravity determined by current height.
*
* @author Ethan Hopkins
* @version 1.0
* MoonGoer Game
* Spring Semester/Freshman Year
*/
public class Gravity extends Screen{
	public double gravity = 9.8;
	
	
	/**
	 * Set gravity function
	 * @param gravity sets a new value for gravity
	 */
	public void setGravity(double gravity) {
		gravity = this.gravity;
	}//end setGravity function
	
	
	//conditional to check location of rocket to determine gravity?
	public void checkGravity() {
		if (height >= 10 && height < 21) {
			setGravity(0);
		} else if (height >= 21) {
			setGravity(1.625);
		}
	}
}
