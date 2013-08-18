import java.util.ArrayList;
import java.util.List;



public class BowlingGame {
	static List<Frame> game = new ArrayList<Frame>(10);
	
	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.printf("%dth Frame\n", i);
			game.add(new Frame(i));
		}
		System.out.println("Game SET");
		print();
	}
	
	static void print() {
		for (Frame f : game) {
			System.out.println(game.indexOf(f)+1);
			System.out.println(f.point[0] +","+ f.point[1]);
		}
	}
}
