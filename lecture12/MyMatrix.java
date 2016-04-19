package ua.com.glybovets.java1_1.lecture12;
import acm.program.ConsoleProgram;



public class MyMatrix extends ConsoleProgram{

	public void run(){
		int[][] matrix = new int[2][2];
		inputMatrix(matrix);
		printMatrix(matrix);

	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void inputMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = readInt("input‚ " + i + ","
						+ j + ":");
			}
		}
	}
}
