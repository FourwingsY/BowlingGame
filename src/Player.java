import java.util.ArrayList;
import java.util.List;


public class Player {
	// frame 1 to 10, and 11
	List<Frame> frames = new ArrayList<Frame>(10);
	Frame waitingForCount;
	
	void play() {
		Frame thisTurn = new Frame();
		frames.add(thisTurn);
		
		if (waitingForCount != null) {
			countWaiting(thisTurn);
			waitingForCount = null;
		}
		if (thisTurn.isClear()) {
			waitingForCount = thisTurn;
		}
	}
	void lastPlay() {
		Frame thisTurn = new LastFrame();
	}
	private void countWaiting(Frame thisTurn) {
		waitingForCount.totalScore += thisTurn.score[0];
		if (waitingForCount.isStrike(0))
			waitingForCount.totalScore += thisTurn.score[1];
	}
	
	void printScore() {
		for (int i=0; i<frames.size(); i++) {
			Frame f = frames.get(i);
			System.out.format("Frame %d, %d %d = %d \n", i+1, f.score[0], f.score[1], f.totalScore);
			// TODO: check status for BonusRound;
		}
	}
}
