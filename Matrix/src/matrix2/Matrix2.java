package matrix2;

import java.util.Scanner;

/*
 * Crea una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primera fila con la segunda. Imprimir luego la matriz.
 */
public class Matrix2 {
	private static Scanner inputData = new Scanner(System.in);

	private int row , column ;
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
				System.out.println("Enter the next number in Matrix on position ["+ (row + 1) +"]["+(column + 1 ) +"]:");
				matrix[row][column] = inputData.nextInt();
			}
		}
	}

	private void switchData() {
		for (int column = 0; column < this.column; column++) {
			int aux = matrix[0][column];
			matrix[0][column] = matrix[1][column];
			matrix[1][column] = aux;
		}
	}

	private void printData() {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String Args[]) {
		Matrix2 myMatrix = new Matrix2();
		myMatrix.matrixSize();
		myMatrix.loadData();
		myMatrix.printData();
		System.out.println("---- Switching ----");
		myMatrix.switchData();
		myMatrix.printData();
	}
}