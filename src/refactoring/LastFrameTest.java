package refactoring;

import junit.framework.TestCase;

public class LastFrameTest extends TestCase {
	public void testLastFrame1() {
		Frame f = new LastFrame();
		f.start();
		assertEquals(10, f.score[0]);
		assertEquals(0, f.score[1]);
		assertEquals(0, f.score[2]);
	}
	public void testLastFrame2() {
		Frame f = new LastFrame();
		f.start();
		assertEquals(10, f.score[0]);
		assertEquals(10, f.score[1]);
		assertEquals(8, f.score[2]);
	}
	public void testLastFrame3() {
		Frame f = new LastFrame();
		f.start();
		assertEquals(9, f.score[0]);
		assertEquals(1, f.score[1]);
		assertEquals(6, f.score[2]);
	}
	public void testLastFrame4() {
		Frame f = new LastFrame();
		f.start();
		assertEquals(8, f.score[0]);
		assertEquals(1, f.score[1]);
		assertEquals(0, f.score[2]);
	}
}
