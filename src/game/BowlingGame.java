package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BowlingGame {

	static List<Player> players = new ArrayList<Player>(4);
	
	public static void main(String[] args) throws GameOverException {
		initPlayer(getPlayerNum());
		
		for (int frameNum=0; frameNum<10; frameNum++) {
			for (Player p : players)
				p.play(frameNum);
		}
		printBoard();
		throw new GameOverException();
	}

	private static int getPlayerNum() {
		int playerNum = 0;
		while (playerNum < 1 || playerNum > 4) {
			System.out.printf("How many Players in game?(1-4) : ");
			Scanner sc = new Scanner(System.in);
			while (!sc.hasNextInt()) {
				System.out.printf("Must be int! Again : ");
				sc.nextLine();
			}
			playerNum = sc.nextInt();
		}
		return playerNum;
	}
	
	private static void initPlayer(int playerNum) {
		for (int i=0; i<playerNum; i++) {
			System.out.printf("Name of Player%d (input 0 for default) : ", i);
			Scanner sc = new Scanner(System.in);
			String playerName = sc.next();
			if ("0".equals(playerName))	
				players.add(new Player(i));
			else players.add(new Player(playerName));
		}
	}

	static void printBoard() {
		for (Player p : players) {
			p.printScores();
		}
	}
}
