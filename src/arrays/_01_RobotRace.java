package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		int x = 0;
		Random a = new Random();
		// 2. create an array of 5 robots.
		Robot[] arr = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (x = 0; x < arr.length; x++) {
			arr[x] = new Robot();
			arr[x].setWindowSize(800, 800);
			arr[x].setY(750);
			arr[x].setX(150 * x + 100);
			arr[x].setSpeed(5);

		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		OUTER: while (true) {
			for (x = 0; x < arr.length; x++) {
				arr[x].move(a.nextInt(50));
				if (arr[x].getY() < 0) {
					break OUTER;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "The winner is Robot " + (x+1));
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
