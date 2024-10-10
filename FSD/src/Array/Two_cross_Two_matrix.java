package Array;
import java.util.Scanner;
	public class Two_cross_Two_matrix { 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input for first matrix
	        System.out.println("Enter elements of first matrix (2x2):");
	        int[][] matrix1 = inputMatrix(scanner);
	        
	        // Input for second matrix
	        System.out.println("Enter elements of second matrix (2x2):");
	        int[][] matrix2 = inputMatrix(scanner);
	        
	        // Matrix multiplication
	        int[][] result = multiplyMatrices(matrix1, matrix2);
	        
	        // Display result
	        System.out.println("Result of matrix multiplication:");
	        displayMatrix(result);
	        
	        scanner.close();
	    }
	    
	    // Function to take user input for a 2x2 matrix
	    public static int[][] inputMatrix(Scanner scanner) {
	        int[][] matrix = new int[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print("Enter element at position (" + (i+0) + "," + (j+0) + "): ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        return matrix;
	    }
	    
	    // Function to perform matrix multiplication
	    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
	        int[][] result = new int[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                for (int k = 0; k < 2; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        return result;
	    }
	    
	    // Function to display a 2x2 matrix
	    public static void displayMatrix(int[][] matrix) {
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


