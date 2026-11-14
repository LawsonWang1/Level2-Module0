package arrays;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		int x = 0;
		Random a = new Random();

		// 2. create an array of 5 robots.
		Color[] colors = { Color.red, Color.YELLOW, Color.green, Color.BLUE, Color.MAGENTA };
		Robot[] arr = new Robot[5];
		int[] stepsTaken = new int[5];
		// 3. use a for loop to initialize the robots.
		for (x = 0; x < arr.length; x++) {
			arr[x] = new Robot();
			arr[x].penDown();
			arr[x].setY(900);
			arr[x].setX(600);
			arr[x].setSpeed(100);
			arr[x].setAngle(90);
			arr[x].setPenColor(colors[x]);
		}
		Robot.setWindowSize(1200, 1000);
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		//		OUTER: while (true) {
		//			for (x = 0; x < arr.length; x++) {
		//				arr[x].move(a.nextInt(50));
		//				if (arr[x].getY() < 0) {
		//					break OUTER;
		//				}
		//			}
		//		

		OUTER: while (true) {
			for (int i = 0; i < 36; i++) {
				for (x = 0; x < arr.length; x++) {
					if (a.nextBoolean()) {
						arr[x].move(70);
						arr[x].turn(-10);
						stepsTaken[x]++;

						if(stepsTaken[x] == 36) {
							break OUTER;
						}

					} 
				}
			}
		}
	

	JOptionPane.showMessageDialog(null, "The winner is Robot " + (x + 1));
	arr[x].turn(10000);
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
}
