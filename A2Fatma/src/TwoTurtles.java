import Turtle.*;

public class TwoTurtles  extends Turtle{
	public static void main(String[] args) {
	Turtle Mario = new Turtle();//create Mario 
	Turtle Luigi = new Turtle();//create Luigi 
	Luigi.hide();
	Luigi.tailUp();
	Luigi.turnRight(90);
	Luigi.moveForward (150);
	Luigi.turnLeft (180);
	//Mario begin to draw the letter m
	Mario.moveForward (100);
	Mario.turnLeft (135); 
	Mario.moveForward (75);
	Mario.turnRight (90);
	Mario.moveForward (75);
	Mario.turnLeft (135);
	Mario.moveForward (100);
	Mario.hide();
	//Mario finish to draw the letter m
	Luigi.show();
	Luigi.tailDown();
	//Luigi to draw the letter l
	Luigi.moveForward (75);
	Luigi.turnRight(90);
	Luigi.moveForward (100);
	Luigi.hide();
	//Luigi finish to draw the letter l
	}

}
