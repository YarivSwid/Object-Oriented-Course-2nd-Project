import Turtle.*;
public class DrunkTurtle extends Turtle{
	public void moveForward(double x) {//this function makes the turtle move forward like a drunk
		double random = Math.random();
		double dist = (random*x);//walk in a random distance between 0 to x
		super.moveForward(dist);
		double probabillity = Math.random();
		if(probabillity <= 0.3) {//the turtle will turn left if the probability is less then 0.3
			turnLeft((int)x);
		}
		random = Math.random();
		dist = ((x/2)*random);//walk in a random distance between 0 to x/2
		super.moveForward(dist);
	}
	public void moveSahi(double x) {//this function makes the turtle move forward like a simple turtle
		super.moveForward(x);
	}
	public void turnRight(int degree) {//this function makes the turtle turn right like a drunk
		double random = Math.random();
		degree = ((int)(1.5*random*degree));
		super.turnRight(degree);
	}
	public void turnLeft(int degree) {//this function makes the turtle turn left like a drunk
		double random = Math.random();
		degree = ((int)(1.5*random*degree));
		super.turnLeft(degree);
	}
	public void turnLeftSahi(int degree) {//this function makes the turtle to turn left like a normal turtle
		super.turnLeft(degree);
	}
	public void turnRightSahi(int degree) {//this function makes the turtle to turn right like a normal turtle
		super.turnRight(degree);
	}
	
}
