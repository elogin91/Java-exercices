package matrix3;

import java.util.Scanner;

/**
 * Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los
 * cuatro valores que se encuentran en los vértices de la misma (mat[0][0] etc.)
 *
 */
public class Matrix3 {
	private static Scanner inputData = new Scanner(System.in);

	private int row, column;
	private int[][] matrix;

	private void matrixSize() {
		System.out.println("Enter the row number, please:");
		row = inputData.nextInt();
		System.out.println("Enter the column number, please:");
		column = inputData.nextInt();
		matrix = new int[row][column];

	}

	private void loadData() {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.println(
						"Enter the next number in Matrix on position [" + (row + 1) + "][" + (column + 1) + "]:");
				matrix[row][column] = inputData.nextInt();
			}
		}
	}

	private void printData() {

		System.out.print(matrix[0][0] + " ");
		System.out.println(matrix[0][matrix[0].length-1] + " ");
		System.out.print(matrix[matrix.length-1][0] + " ");
		System.out.println(matrix[matrix.length-1][matrix[0].length-1] + " ");

	}

	public static void main(String Args[]) {
		Matrix3 myMatrix = new Matrix3();
		myMatrix.matrixSize();
		myMatrix.loadData();
		myMatrix.printData();
	}
}
