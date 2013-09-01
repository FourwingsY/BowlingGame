package frames;

import java.util.ArrayList;
import java.util.List;

public abstract class Frame {
	List<Roll> results = new ArrayList<Roll>(2);
	protected int frameScore = 0;
	
	Frame() {
		
	}
	
	public boolean isStrike() {
		return results.get(0).isStrike();
	}
	public boolean isSpare() {
		if (isStrike())
			return false;
		if (results.get(0).score + results.get(1).score == 10)
			return true;
		return false;
	}
	public int getRollScore(int i) {
		if (results.size() <= i)
			return -1;
		return results.get(i).score;
	}

	public abstract String getDetailScore();

	public int getFrameScore() {
		return frameScore;
	}
}
