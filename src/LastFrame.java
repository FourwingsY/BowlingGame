import java.util.Scanner;


public class LastFrame extends Frame {
	int score[] = {0,0,0};
	int totalScore = 0;
	
	LastFrame() {
		roll(0);
		roll(1);
		if (isStrike(1) || isSpare())
			roll(2);
	}
	
	@Override
	void roll (int i){
		Scanner sc = new Scanner(System.in);
		// System.out.format("Roll your Bowl, %dth time!\n", i);
		// System.out.print("how many pins knocked over? ");
		System.out.format("%dth roll : ", i);
		
		int temp = sc.nextInt();
		
		if (i==2) {
			// check only
			if (super.isInRange(temp)) {
				ok(i, temp);
			}
		}
		
		else if (this.isStrike(0)) {
			if (super.isInRange(temp)) {
				ok(i, temp);
			}
		}
		else if (isValid(temp)) {
			ok(i, temp);
		}
		
		else  {
			System.out.println("You may typed it wrong. try again");
			roll(i);
		}
	}

	private void ok(int i, int temp) {
		score[i] = temp;
		totalScore += temp;
	}
}
