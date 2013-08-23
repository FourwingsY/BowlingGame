import java.util.Scanner;


public class Frame {
	
	int score[] = {0,0};
	int totalScore = 0;
	
	
	Frame() {
		roll(0);
		if (this.isStrike(0))
			return;
		roll(1);
	}
	
	Frame(int i) {
		score = new int[i];
	}
	
	void roll (int i){
		Scanner sc = new Scanner(System.in);
		// System.out.format("Roll your Bowl, %dth time!\n", i);
		// System.out.print("how many pins knocked over? ");
		System.out.format("%dth roll : ", i);
		
		int temp = sc.nextInt();
		if (isValid(temp)) {
			score[i] = temp;
			totalScore += temp;
		}
		else  {
			System.out.println("You may typed it wrong. try again");
			roll(i);
		}
	}
	
	boolean isValid(int temp) {
		if (!isInRange(temp))
			return false;
		if (score[0] + temp > 10)
			return false;
		return true;
	}
	
	boolean isStrike(int i) {
		if (score[i] == 10)
			return true;
		return false;
	}
	boolean isClear() {
		if (score[0] + score[1] == 10)
			return true;
		return false;
	}
	boolean isSpare() {
		if (isStrike(0))
			return false;
		return isClear();
	}

	boolean isInRange(int temp) {
		if (temp < 0)
			return false;
		if (temp > 10)
			return false;
		return true;
	}
}
