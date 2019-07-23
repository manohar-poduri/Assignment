import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of rows in a matrix");

        int rows = scanner.nextInt();
        System.out.println("enter the number of column in a matrix");

        int columns = scanner.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter the elements in first matrix");
        for (int i = 0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements in the second matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        //addition of matrix
        int[][] additionMatrix = new int[rows][columns];
        for (int i = 0;i<rows;i++){
            for (int j=0;j<columns;j++){
                additionMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //subtraction of matrix
        int[][] subtractionMatrix = new int[rows][columns];
        for (int i = 0;i<rows;i++){
            for (int j=0;j<columns;j++){
                subtractionMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        //multiplication of matrix
        int[][] multiplicationMatrix = new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                multiplicationMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        //Transpose of matrix
        int[][] transposeMatrix = new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                    transposeMatrix[i][j] = matrix1[i][j];
            }
        }

        System.out.println("\nFirst Matrix :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                 System.out.println(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSecond matrix: ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.println(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nThe Addition of the matrix : ");
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.println(additionMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n The Subtraction of the matrix: ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.println(subtractionMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n The multiplication of the matrix:");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.println(multiplicationMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n The Transpose matrix: ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.println(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
