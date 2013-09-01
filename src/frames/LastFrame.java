package frames;

public class LastFrame extends BasicFrame {
	Frame bonus = null;
	public LastFrame() {
		// automatically call BasicFrame
		if (this.isStrike())
			bonus = new BonusFrame(2);
		else if (this.isSpare())
			bonus = new BonusFrame(1);
	}
	
	@Override
	public String getDetailScore() {
		StringBuilder result = new StringBuilder();

		result.append("(");
		
		
		if (this.isStrike())
			result.append("X, ");
		else result.append(results.get(0).score+ ", ");
		
		if (this.isSpare())
			result.append("/, ");
		
		if (bonus != null)
			result.append(bonus.getDetailScore());
		else result.append(results.get(1).score);
		
		result.append(")");
		
		return result.toString();
	}
	
	public Frame getBonusFrame() {
		return bonus;
	}
}
