package refactoring;
import junit.framework.TestCase;


public class FrameTest extends TestCase {
	
	public void testStrike() {
		Frame f = new Frame();
		
		assertEquals(10, f.score[0]);
		assertEquals(0, f.score[1]);
	}
	public void testSpare() {
		Frame f = new Frame();
		
		assertEquals(8, f.score[0]);
		assertEquals(2, f.score[1]);
	}
	public void testNormalRoll() {
		Frame f = new Frame();
		
		assertEquals(7, f.score[0]);
		assertEquals(2, f.score[1]);
	}
	public void testNormalRoll2() {
		Frame f = new Frame();
		
		assertEquals(0, f.score[0]);
		assertEquals(4, f.score[1]);
	}
}
