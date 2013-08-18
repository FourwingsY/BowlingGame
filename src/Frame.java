import java.util.Scanner;


public class Frame {
	
	int numOfRoll;
	int point[];
	
	Frame(int number) {
		numOfRoll = 2;
		if (number == 10)
			numOfRoll = 3;
		point = new int[numOfRoll];
		
		for (int i=0; i<numOfRoll; i++)  {
			roll(i);
		}
	}
	void roll (int i){
		Scanner sc = new Scanner(System.in);
		System.out.format("Roll your Bowl, %dth time!\n", i);
		System.out.print("how many pins knocked over? ");
		
		point[i] = sc.nextInt();
	}
}
