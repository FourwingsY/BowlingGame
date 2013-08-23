import java.util.ArrayList;
import java.util.List;



public class BowlingGame {
	static List<Player> players = new ArrayList<Player>(4);
	
	public static void main(String[] args) {
		// TODO: Player 수 지정 및 초기화
		players.add(new Player());
		players.add(new Player());
		
		for (int frameNum=0; frameNum<9; frameNum++) {
			for (int i=0; i<players.size(); i++) {
				System.out.format("Turn: Player %d ", i+1);
				System.out.format("%dth Frame\n", frameNum+1);
				// TODO: 프레임 시작 혹은 점수 확인 분기
				players.get(i).play();
			}
		}
		for (int i=0; i<players.size(); i++) {
			System.out.format("Turn: Player %d ", i+1);
			System.out.println("Last Frame");
			players.get(i).lastPlay();
		}
		System.out.println("Game SET");
		// TODO: throw GameOverException;
		print();
	}
	
	static void print() {
		int i=1;
		for (Player player : players) {
			System.out.printf("**** Player %d ****\n", i);
			player.printScore();
			i++;
		}
	}
}
