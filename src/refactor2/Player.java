package refactor2;

import java.util.ArrayList;
import java.util.List;

public class Player {

	String name;
	// default frame * 10
	List<Frame> frames = new ArrayList<Frame>();

	Player(int index) {
		this.name = "Player "+index;
	}
	Player(String name) {
		this.name = name;
	}
	public void play(int frameNum) {
		// TODO: Play로 프레임 실행.
		System.out.printf("%s, Frame: %d\n", name, frameNum);
		if (frameNum == 9) {
			frames.add(new LastFrame());
			return;
		}
		frames.add(new BasicFrame());
		
	}
	public void printScores() {
		System.out.printf("Player %s :\n", name);
		for (int i=0; i<frames.size(); i++) {
			Frame f = frames.get(i);
			if (f.isStrike())
				System.out.printf("%d: %d(X) \n", i, getStrikeScores(f));
			else if (f.isSpare())
				System.out.printf("%d: %d(%d, /) \n", i, getSpareScores(f), f.getRollScore(0));
			else System.out.printf("%d: %d(%d, %d) \n", i, f.frameScore, f.getRollScore(0), f.getRollScore(1));
		}
	}
	
	private int getStrikeScores(Frame f) {
		int result = f.frameScore;
		Frame nf = getNextFrame(f);
		if (nf == null)
			return -1;
	
		if (nf.isStrike()) {
			Frame nnf = getNextFrame(nf);
			if (nnf == null)
				return -1;
			result += nf.getRollScore(0);
			result += nnf.getRollScore(0);
			return result;
		}
		result += nf.frameScore;
		return result;
	}
	
	private int getSpareScores(Frame f) {
		int result = f.frameScore;
		Frame nf = getNextFrame(f);
		if (nf == null)
			return -1;
		result += nf.getRollScore(0);
		return result;
	}
	
	private Frame getNextFrame(Frame f) {
		int i = frames.indexOf(f);
		if (i+1 < frames.size())
			return frames.get(i+1);
		return null;
	}
}
