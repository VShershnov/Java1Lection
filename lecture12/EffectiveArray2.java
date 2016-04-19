package ua.com.glybovets.java1_1.lecture12;
import acm.program.ConsoleProgram;

public class EffectiveArray2 extends ConsoleProgram{

	private static final int SENTINEL = -1;

	public void run(){

		int maxLength = readInt("Input array length: ");
		int[] midtermScores = new int[maxLength];
	
		int numActualScores = 0;

		for (int i = 0; i < maxLength; i++) {
			int score = readInt("Input number " + (i + 1)
					+ "-1 for end: ");
			if (score == SENTINEL)
				break;
			midtermScores[numActualScores++]=score;
		}

		System.out.println(computeAverage(midtermScores, numActualScores));
	}

	private static double computeAverage(int[] midtermScores,
			int numActualScores) {
		double sum = 0;
		for (int i = 0; i < numActualScores; i++) {
			sum += midtermScores[i];
		}

		return sum / numActualScores;
	}

}
