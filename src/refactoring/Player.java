package refactoring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player {
	// default frame * 10 + bonus frame * 1
	List<Frame> frames = new ArrayList<Frame>(11);
	List<Frame> waitingFrames = new LinkedList<Frame>();
	int[] waitingCount = new int[2];
	
	void play(int frameNum) {
		Frame f = new Frame();
		
		frames.add(f);
		
		handleWaitings();
		if (f.isSpare() || f.isStrike(0))
			waitingFrames.add(f);
	}

	private void handleWaitings() {
		if (waitingFrames.isEmpty())
			return;
		waitingFrames.get(0);
		
	}
}
