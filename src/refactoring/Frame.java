package refactoring;

import java.util.Scanner;

public class Frame {
	int[] score;
	int totalScore = 0;
	int rollNum;
	
	Frame() {
		rollNum = 0;
		score = new int[2];
	}

	void start() {
		roll(rollNum);
		rollNum++;
		if (! this.isStrike(0))
			roll(1);
	}


	int roll(int rollIdx) {
		int result;
		inform();
		Scanner sc = new Scanner(System.in);
		result = sc.nextInt();
		
		if (this.isValid(result)) {
			System.out.println(this);
			score[rollIdx] = result;
			return result;
		}
		
		// if it is not valid result
		System.out.println("Wrong Input!");
		return roll(rollIdx);
	}

	private void inform() {
		System.out.format("%dth roll : ", rollNum);
	}
	
	boolean isStrike(int i) {
		if (score[i] == 10)
			return true;
		return false;
	}
	
	boolean isSpare() {
		if (isStrike(0))
			return false;
		if (score[0] + score[1] == 10)
			return true;
		return false;
	}
	
	boolean isValid(int temp) {
		if (temp < 0)
			return false;
		if (temp > 10)
			return false;
		if (score[0] + temp > 10)
			return false;
		return true;
	}
}
