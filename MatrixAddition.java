import java.util.Scanner;
public class  MatrixAddition {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size N for the matrices:");
		int n = scanner.next Int();
		int[][] matrixA = new int [n][n];
		int[][] matrixB = new int [n][n];
		int[][] sunMatrix = new int[n][n];
		System.out.printIn("Enter the elements of Matrix A:");
		for (int i = 0; i < n; i++){         
			for(int j = 0; j< n; j++){
				matrixA[i][j] = scanner .nextInt();
			}
		}
		System.out.printIn("Enter the elemsnts of Matrix B:");
		for(int i =0; i < n; i++) {
			for(int j = 0; j < n; j++){
				matrixB[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sum Matrix[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		System.out.printIn("\nsum of the two matrices (A + b):");
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++) {
				System.out.print(sumMatrix[i][j] + "\t");
			}
			scanner.close();
		}
	}
				