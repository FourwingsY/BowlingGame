package refactor2;

import java.util.Scanner;

public class BonusRoll extends Roll {
	
	BonusRoll(Roll lastRoll) {
		super(lastRoll);
	}

	@Override
	int getResult(int i) {
		System.out.printf("bonus roll : ", i);
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		return score;
	}
}
