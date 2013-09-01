package frames;

import java.util.Scanner;

public class BonusRoll extends Roll {
	
	BonusRoll(Roll lastRoll) {
		super(lastRoll);
	}

	@Override
	int getResult(int i) {
		System.out.printf("bonus roll : ");
		Scanner sc = new Scanner(System.in);
		while (! sc.hasNextInt()) {
			System.out.println("Must be Int!");
			sc.nextLine();
		}
		score = sc.nextInt();
		return score;
	}
}
