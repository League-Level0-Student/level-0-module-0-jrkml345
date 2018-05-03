import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	// Make a new robot
	Robot jei = new Robot();
	// Pen down
	jei.penDown();
	jei.setSpeed(10);
	jei.setRandomPenColor();
	// Move
	jei.move(200);
	// Turn
	jei.turn(90);
	jei.move(100);
	jei.turn(90);
	jei.move(75);
	jei.turn(90);
	jei.move(100);
	jei.turn(225);
	jei.move(150);
	
	}
}
