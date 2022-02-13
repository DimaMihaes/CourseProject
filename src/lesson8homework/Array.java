package lesson8homework;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int col, row;

        int arr[][] = new int[10][];


        System.out.print("Enter row of array (Max 10): ");
        col = a.nextInt();
        System.out.print("Enter col of array (Max10):  ");
        row = a.nextInt();

        System.out.println("Enter " + (row * col) + "\n Array elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = a.nextInt();
            }
        }

        System.out.println("Array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

            a.close();
        }
    }
}