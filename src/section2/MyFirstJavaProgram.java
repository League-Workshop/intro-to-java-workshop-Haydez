package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ultron = new Robot();
	ultron.penDown();
	ultron.setSpeed(100);
	for(int i=0;i<4;i++) {
		ultron.move(100);
		ultron.turn(90);
	}
		
	}
		
	}
