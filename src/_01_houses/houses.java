package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
Robot rob = new Robot();
rob.setX(3);
rob.setY(500);
rob.penDown();
rob.setSpeed(500);
Random r = new Random();
for ( int i = 0; i < 10; i ++) {
	int size = r.nextInt(3); 
	if (size == 0) {
    drawHouse(rob, "small");
	}
    else if (size == 1) {
    drawHouse(rob, "medium");	
    }
    else if (size == 2) {
        drawHouse(rob, "large");	
        }
}
}

static void drawHouse(Robot rob, String height ) {
	int length = 0;
	if(height.equals("small")) {
	length = 60;
	}
	else if (height.equals("medium")) {
	length = 120;
	}
	else if (height.equals("large")) {
		length = 250;
		}
	rob.setPenColor(Color.pink);
	rob.move(length);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(length);
	rob.turn(270);
	rob.setPenColor(Color.green);
	rob.move(30);
	rob.turn(270);
	rob.setPenColor(Color.pink);
}
}
