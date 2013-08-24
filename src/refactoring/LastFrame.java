package refactoring;

public class LastFrame extends Frame {

	LastFrame() {
		score = new int[3];
	}
	
	@Override
	void start() {
		super.roll(0);
		super.roll(1);
		if (isStrike(1) || isSpare())
			roll(2);
	}

	@Override
	boolean isValid(int temp) {
		if (temp < 0)
			return false;
		if (temp > 10)
			return false;
		
		// for roll(2)
		if (isStrike(1))
			return true;
		if (isSpare())
			return true;
		
		// for roll(1, 2)
		if (isStrike(0)) {
			if (score[1] + temp > 10)
				return false;
			return true;
		}
		// for roll(1)
		if (score[0] + temp > 10)
			return false;
		return true;
	}
}
