/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    private static Color red;

	public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot jay = new Robot();



        // 3. Put the robot's pen down
jay.penDown();

        // 6. Make the robot move as fast as possible
jay.setSpeed(10);

        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	

jay.microTurn(6);
        //         2. Move your robot 200 pixels
jay.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
jay.turn(90);
}
    }
}
