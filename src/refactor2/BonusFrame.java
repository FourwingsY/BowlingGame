package refactor2;

public class BonusFrame extends Frame {
	
	BonusFrame(int count) {
		
		Roll r1 = new BonusRoll(null);
		results.add(r1);
		
		if (count == 1)
			return;
		
		Roll r2 = null;
		System.out.printf("Frame %d ", count+1);
		
		if (r1.isStrike())
			r2 = new BonusRoll(null);
		else
			r2 = new BonusRoll(r1);
		
		results.add(r2);
	}
}
