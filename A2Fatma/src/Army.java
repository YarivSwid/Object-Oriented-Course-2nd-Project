import java.util.Scanner;

import Turtle.*;
public class Army extends Turtle{
	public static void main(String[] args) {
		Turtle[] army = new Turtle[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the type of a turte:");
		System.out.println("1.Simple");
		System.out.println("2.Smart");
		System.out.println("3.Drunk"); 
		System.out.println("4.Jumpy");
		System.out.println("5.Eight");
		System.out.println("6.Satlan");
		for(int i=0;i<5;i++) {// this loop create the army of turtles and sets them in a row
			int turtle = sc.nextInt();
			if(turtle==1) {
				army[i] = new Turtle();
			}
			if(turtle==2) {
				army[i] = new SmartTurtle();
			}
			if(turtle==3) {
				army[i] = new DrunkTurtle();
			}
			if(turtle==4) {
				army[i] = new JumpyTurtle();
			}
			if(turtle==5) {
				army[i] = new EightTurtle();
			}
			if(turtle==6) {
				army[i] = new SatlanTurtle();
			}
			if(army[i] instanceof SatlanTurtle) {
				((SatlanTurtle)army[i]).tailUpSahi();
				((SatlanTurtle)army[i]).hideSahi();
			}
			else {
				army[i].tailUp();
				army[i].hide();
			}
			if(army[i] instanceof JumpyTurtle) {
				army[i].turnRight(90);
				((JumpyTurtle)army[i]).moveNormally(120*i);
				army[i].turnLeft(90);
				army[i].show();
			}
			else if(army[i] instanceof SatlanTurtle) {
				((SatlanTurtle)army[i]).turnRightSahi(90);
				((SatlanTurtle)army[i]).moveSahi(120*i);
				((SatlanTurtle)army[i]).turnLeftSahi(90);
				((SatlanTurtle)army[i]).showSahi();
			}
			else if(army[i] instanceof DrunkTurtle) {
				((DrunkTurtle)army[i]).turnRightSahi(90);
				((DrunkTurtle)army[i]).moveSahi(120*i);
				((DrunkTurtle)army[i]).turnLeftSahi(90);
				army[i].show();
			}

			else {
				army[i].turnRight(90);
				army[i].moveForward(120*i);
				army[i].turnLeft(90);
				army[i].show();
			}
		}
		for(int i=0;i<6;i++) {//this loop makes the turtles do the orders
			for(int j=0; j<5; j++) {
				if(i == 0) {
					army[j].tailDown();
				}
				if(i==1) {
					army[j].moveForward(65);
				}
				if(i==2) {
					army[j].turnLeft(40);
				}
				if(i==3) {
					army[j].moveForward(75);
				}
				if(i==4) {
					if(army[j] instanceof SmartTurtle) {
						((SmartTurtle)army[j]).draw(6,40);
					}
				}
				if(i==5) {
					if(army[j] instanceof SatlanTurtle) {
						((SatlanTurtle)army[j]).hideSahi();
					}else {
						army[j].hide();
					}
				}
			}
		}sc.close();
	}
}
