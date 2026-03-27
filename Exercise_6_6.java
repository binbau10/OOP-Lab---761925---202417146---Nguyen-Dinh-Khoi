import java.util.Scanner;
public class Exercise_6_6 {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        final int maxRowColumn = 100;
        System.out.println("Enter numbers of rows:");
        final int row = keyboard.nextInt();
        System.out.println("Enter numbers of columns:");
        final int column = keyboard.nextInt();
        if (row <= 0 || column <= 0){
            System.out.println("Invalid input");
        }
        else if (row > maxRowColumn || column > maxRowColumn){
            System.out.println("The numbers are too big");
        }
        else{
            int[][] matA = new int[row][column], matB = new int[row][column], matC = new int[row][column];
            System.out.println("Enter matrix A:");
            for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++){
                    matA[i][j] = keyboard.nextInt();
                }
            }
            System.out.println("Enter matrix B:");
            for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++){
                    matB[i][j] = keyboard.nextInt();
                    matC[i][j] = matA[i][j] + matB[i][j];
                }
            }
            System.out.println("Matrix C = A + B is:");
            for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++){
                    System.out.print(matC[i][j] + " ");
                }
                System.out.println("");
            }
        }
        keyboard.close();
    }
}
