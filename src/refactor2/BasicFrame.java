package refactor2;

public class BasicFrame extends Frame {
	
	BasicFrame() {
		
		Roll r1 = new Roll(null);
		results.add(r1);
		
		if (this.isStrike()) {
			frameScore = 10;
			return;
		}
		
		// else
		Roll r2 = new Roll(r1);
		results.add(r2);
		frameScore += r1.score + r2.score;
	}
}
