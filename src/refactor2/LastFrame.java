package refactor2;

public class LastFrame extends BasicFrame {
	Frame bonus;
	LastFrame() {
		// automatically call BasicFrame
		if (this.isStrike())
			bonus = new BonusFrame(2);
		else if (this.isSpare())
			bonus = new BonusFrame(1);
	}
}
