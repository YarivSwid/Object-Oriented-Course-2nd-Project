
public class SatlanTurtle extends DrunkTurtle {
	public SatlanTurtle() {//this constructor will make sure that the we can see the turtle when we create it
		showSahi();
	}
	public void moveForward(double x) {//move forward like a satlan
		double r = Math.random();
		if(r<=0.3) {//the turtle will walk like a drunk turtle
			super.moveForward(x);
		}
		else if(r>0.3 && r<=0.7){//the turtle will walk like a simple turtle
			moveSahi(x);
		}
	}
	public void moveSahi(double x) {//move forward like a simple turtle
		super.moveSahi(x);
	}
	public void turnRightSahi(int degree) {//turn right like a simple turtle
		super.turnRightSahi(degree);
	}
	public void turnRight(int x) {//turn right like a satlan turtle
		double random = Math.random();
		if(random<=0.3) {
			super.turnRight(x);
		}
		else if(random>0.3 && random<=0.7){
			turnRightSahi(x);
		}
	}
	public void turnLeft(int x) {//turn left like a satlan turtle
		double random =Math.random();
		if(random<=0.3) {
			super.turnLeft(x);
		}
		else if(random>0.3 && random<=0.7){
			turnLeftSahi(x);
		}
	}
	public void turnLeftSahi(int degree) {//turn left like a simple turtle
		super.turnLeftSahi(degree);
	}
	public void tailUp() {//lift the tail like a satlan turtle
		double random = Math.random();
		if(random <= 0.7) {
			super.tailUp();
		}
	}
	public void tailUpSahi() {//lift the tail like a simple turtle
		super.tailUp();
	}
	public void tailDown() {//low the tail like a satlan turtle
		double random = Math.random();
		if(random <= 0.7) {
			super.tailDown();
		}
	}
	public void tailDownSahi() {//low the tail like a simple turtle
		super.tailDown();
	}
	public long show() {//show like a satlan turtle
		double random = Math.random();
		if(random <= 0.7) {
			return super.show();
		}
		return 0;
	}
	public long hide() {//hide like a satlan turtle
		double random = Math.random();
		if(random <= 0.7) {
			return super.hide();
		}
		return 0;
	}
	public long showSahi() {//show like a simple turtle
		return super.show();
	}
	public long hideSahi() {//hide like a simple turtle
		return super.hide();
	}
}			

