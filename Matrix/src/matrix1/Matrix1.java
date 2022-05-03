package matrix1;

import java.util.Scanner;

/**
 * 
 * Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes
 * por columna (es decir primero ingresar toda la primer columna, luego la
 * segunda columna y así sucesivamente) Imprimir luego la matriz.
 *
 */
public class Matrix1 {
	private final static int ROWS = 2, COLUMNS = 5;

	private int[][] matrix = new int[ROWS][COLUMNS];

	private void loadData() {
		try (Scanner inputData = new Scanner(System.in)) {
			for (int column = 0; column < COLUMNS; column++) {
				for (int row = 0; row < ROWS; row++) {
					System.out.print("Please, Insert the " + (row + 1) + " element of the " + (column + 1) + " column :");
					matrix[row][column] = inputData.nextInt();
				}
			}
		}
	}

	private void printData() {
		for (int row = 0; row < ROWS; row++) {
			for (int column = 0; column < COLUMNS; column++) {
				if (column > 0) {
					System.out.print("-");
				}
				System.out.print(matrix[row][column]);
			}
			System.out.println(" ");
		}
	}

	static public void main(String[] args) {
		Matrix1 myMatrix = new Matrix1();
		myMatrix.loadData();
		myMatrix.printData();
	}
}