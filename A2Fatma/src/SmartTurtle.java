import Turtle.*;
public class SmartTurtle extends Turtle{
	public void draw(int sides,double size) {//this function makes the turtle draw a shpe
		int degree = ((180*(sides-2))/sides);//the size of the angles
		tailDown();
		turnRight(90);
		for(int i=0;i<sides;i++) 
		{
			moveForward(size);
			turnLeft(180-degree);
		}
	}
}
