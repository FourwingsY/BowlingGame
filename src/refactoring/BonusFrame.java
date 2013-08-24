package refactoring;

public class BonusFrame extends Frame {
	int chance;
	
	BonusFrame(int bonusChance) {
		rollNum = 0;
		this.chance = bonusChance;
	}
	
	BonusFrame(int rollNum, int bonusChance) {
		this.rollNum = rollNum;
		this.chance = bonusChance;
	}
	
	@Override
	void start() {
		roll(0);
		if (chance == 2) {
			if (this.isStrike(0)) {
				Frame bf = new BonusFrame(1, 1);
				bf.start();
				this.score[1] = bf.score[0];
				System.out.println(this.score[0]+","+this.score[1]);
			}
			else
				roll(1);
		}
	}
	
}
