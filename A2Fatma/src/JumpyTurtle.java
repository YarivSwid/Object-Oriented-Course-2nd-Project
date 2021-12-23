
public class JumpyTurtle extends SmartTurtle {
	public void moveForward(double x) {//this function makes the turtle walk in a jumpy way
		boolean tailUp =true;
		boolean tailDown = false;
		int jumpTimes = (((int)x)/5);
		for(int i=0;i<jumpTimes;i++) {//the turtle will move 5 steps with his tail down and 5 steps with his tail up
			if(tailUp) {
				super.moveForward(5);
				tailUp =false;
				tailDown =true;
				tailUp();
			}
			else if(tailDown) {
				super.moveForward(5);
				tailUp =true;
				tailDown =false;
				tailDown();
			}
			if(i == jumpTimes -1) {//when the turtle finish to walk, his tail will go down
				tailDown();
			}
		}
	}
	public void moveNormally(double x) {//move forward like a simple turtle
		super.moveForward(x);
	}
}
