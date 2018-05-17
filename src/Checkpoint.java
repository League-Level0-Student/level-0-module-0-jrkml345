import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, color + " is my favorite color too!");
	
	Robot Mei = new Robot ();
	Mei.penDown();
	Mei.setPenColor(color);
	Mei.setSpeed(10);
	Mei.turn(45);
	Mei.move(200);
	
	
	
	
}
}
