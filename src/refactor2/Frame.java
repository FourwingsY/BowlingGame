package refactor2;

import java.util.ArrayList;
import java.util.List;

public abstract class Frame {
	List<Roll> results = new ArrayList<Roll>(2);
	int frameScore = 0;
	
	Frame() {
		
	}
	
	boolean isStrike() {
		return results.get(0).isStrike();
	}
	boolean isSpare() {
		if (isStrike())
			return false;
		if (results.get(0).score + results.get(1).score == 10)
			return true;
		return false;
	}
	int getRollScore(int i) {
		if (results.size() <= i)
			return -1;
		return results.get(i).score;
	}

	abstract String getDetailScore();
}
