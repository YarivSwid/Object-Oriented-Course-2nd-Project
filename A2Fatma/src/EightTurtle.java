
public class EightTurtle extends SmartTurtle {
	public void draw(int sides,double size) {//this function makes the turtle draw a shape
		double probabillity = Math.random();
		if(probabillity >= 0.7) {
			super.draw(8, size);
		}
		else {
			super.draw(sides, 18);
		}		
	}
}
