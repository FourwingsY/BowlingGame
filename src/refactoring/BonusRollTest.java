package refactoring;

import junit.framework.TestCase;

public class BonusRollTest extends TestCase {
	public void testBonus() {
		BonusRoll br = new BonusRoll(1);
		assertEquals(3, br.score[0]);
	}
	public void testBonus2() {
		BonusRoll br = new BonusRoll(1);
		assertEquals(10, br.score[0]);
	}
	public void testBonus3() {
		BonusRoll br = new BonusRoll(2);
		assertEquals(7, br.score[0]);
		assertEquals(3, br.score[1]);
	}
	public void testBonus4() {
		BonusRoll br = new BonusRoll(2);
		assertEquals(10, br.score[0]);
		assertEquals(6, br.score[1]);
	}
}
