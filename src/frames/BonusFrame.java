package frames;

public class BonusFrame extends Frame {
	
	BonusFrame(int count) {
		
		Roll r1 = new BonusRoll(null);
		results.add(r1);
		frameScore = getFrameScore() + r1.score;
		
		if (count == 1)
			return;
		
		Roll r2 = null;
		
		if (r1.isStrike())
			r2 = new BonusRoll(null);
		else
			r2 = new BonusRoll(r1);
		frameScore = getFrameScore() + r2.score;
		
		results.add(r2);
	}
	
	public String getDetailScore() {
		StringBuilder result = new StringBuilder();

		if (results.size() == 1) {
			if (this.isStrike()) {
				result.append("X");
				return result.toString();
			}
			else {
				result.append(results.get(0).score);
				return result.toString();
			}
		} else {
			if (this.isStrike())
				result.append("X, ");
			else
				result.append(results.get(0).score + ", ");
			
			if (results.get(1).isStrike()) {
				result.append("X");
				return result.toString();
			}
			if (this.isSpare()) {
				result.append("/");
				return result.toString();
			} else
				result.append(results.get(1).score);
			return result.toString();
		}
	}
}
