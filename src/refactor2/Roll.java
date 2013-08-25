package refactor2;

import java.util.Scanner;

public class Roll {
	int score;
	
	Roll(Roll lastRoll) {
		if (lastRoll == null) {
			while (! isIncreasingOrder(0, getResult(1), 10) )
				System.out.println("Wrong Value!");
			return;
		}
		while (! isIncreasingOrder(0, getResult(2), 10 - lastRoll.score) )
			System.out.println("Wrong Value!");
		return;
	}
	
	int getResult(int i) {
		System.out.printf("%dth roll : ", i);
		Scanner sc = new Scanner(System.in);
		while (! sc.hasNextInt()) {
			System.out.println("Must be Int!");
			sc.nextLine();
		}
		score = sc.nextInt();
		return score;
	}
	
	public boolean isStrike() {
		if (score == 10)
			return true;
		return false;
	}
	private boolean isIncreasingOrder(int i, int j, int k) {
		if (i > j)
			return false;
		if (j > k)
			return false;
		return true;
	}
}
