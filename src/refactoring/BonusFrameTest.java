package refactoring;

import junit.framework.TestCase;

public class BonusFrameTest extends TestCase {
	public void testBonusFrame1() {
		Frame f = new BonusFrame(1);
		f.start();
		assertEquals(10, f.score[0]);
		assertEquals(0, f.score[1]);
	}
	public void testBonusFrame2() {
		Frame f = new BonusFrame(1);
		f.start();
		assertEquals(8, f.score[0]);
		assertEquals(0, f.score[1]);
	}
	public void testBonusFrame3() {
		Frame f = new BonusFrame(2);
		f.start();
		assertEquals(10, f.score[0]);
		assertEquals(7, f.score[1]);
	}
	public void testBonusFrame4() {
		Frame f = new BonusFrame(2);
		f.start();
		assertEquals(7, f.score[0]);
		assertEquals(2, f.score[1]);
	}

}
