import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[] args) {
	int big = 250;
	int medium= 120;
	int small = 60;
	Tortoise.getBackgroundWindow().setColor(Color.black);
	Tortoise.setSpeed(10);
	Tortoise.penUp();
	Tortoise.setY(430);
	Tortoise.setX(10);
	Tortoise.show();
	
	BuildHouse("medium", Color.red);
	BuildHouse("small",Color.white);
	BuildHouse("big", Color.MAGENTA);
	BuildHouse("medium",Color.PINK);
	BuildHouse("big",Color.YELLOW);
	BuildHouse("medium",Color.CYAN);
	BuildHouse("small",Color.GRAY);
	BuildHouse("medium",Color.DARK_GRAY);
	BuildHouse("medium",Color.PINK);
	BuildHouse("small",Color.BLUE);
	BuildHouse("medium",Color.PINK);
	BuildHouse("big",Color.YELLOW);
	BuildHouse("medium",Color.CYAN);
	
}


private static void BuildHouse( String size, Color color) {
	int height = 0;
	
	if (size.equalsIgnoreCase("big")) {
		height=250;
		
		
	}
	if (size.equalsIgnoreCase("medium")) {
		height=120;
	}
	if (size.equalsIgnoreCase("small")) {
		height=60;
	}
	Tortoise.penDown();
	Tortoise.setPenColor(color);
	Tortoise.move(height);
	if (size.equals("big")) {
		DrawFlatRoof();
		}
	else {
	DrawPointyRoof();	
	}
	
	
	Tortoise.move(height);
	Tortoise.setAngle(90);
	Tortoise.setPenColor(color.GREEN);
	Tortoise.move(30);
	Tortoise.setAngle(0);
	Tortoise.show();
}


private static void DrawPointyRoof() {
	Tortoise.turn(45);
	Tortoise.move(15);
	Tortoise.turn(90);
	Tortoise.move(15);
	Tortoise.turn(45);
}
private static void DrawFlatRoof (){
	Tortoise.setAngle(90);
	Tortoise.move(30);
	Tortoise.setAngle(180);
	
}
}

