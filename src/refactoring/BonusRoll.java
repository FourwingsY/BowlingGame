package refactoring;

import java.util.Scanner;

public class BonusRoll {
	int[] score;
	int totalScore = 0;
	
	BonusRoll(int count) {
		score = new int[count];
		roll(0);
		if (count == 2)
			roll(1);
	}
	
	int roll(int rollIdx) {
		int result;
		System.out.print("Bonus roll : ");
		Scanner sc = new Scanner(System.in);
		result = sc.nextInt();
		
		if (rollIdx == 1) {
			if (score[0] == 10)
				if (isIncreasingOrder(0,result,10)) {
					score[1] = result;
					return result;
				}
			if (score[0] < 10)
				if (isIncreasingOrder(0,result,10-score[0])) {
					score[1] = result;
					return result;
				}
		}
		
		if (rollIdx == 0) {
			if (isIncreasingOrder(0,result,10)) {
				score[0] = result;
				return result;
			}
		}
		
		// if it is not valid result
		System.out.println("Wrong Input!");
		return roll(rollIdx);
	}

	private boolean isIncreasingOrder(int i, int j, int k) {
		if (i > j)
			return false;
		if (j > k)
			return false;
		return true;
	}
}
