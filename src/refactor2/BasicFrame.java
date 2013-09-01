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
	
	String getDetailScore() {
		StringBuilder result = new StringBuilder();

		result.append("(");
		if (this.isStrike()) {
			result.append("X)");
			return result.toString();
		}
		result.append(results.get(0).score);
		result.append(", ");
		if (this.isSpare()) {
			result.append("/)");
			return result.toString();
		}
		result.append(results.get(1).score);
		result.append(")");
		return result.toString();
	}
}
