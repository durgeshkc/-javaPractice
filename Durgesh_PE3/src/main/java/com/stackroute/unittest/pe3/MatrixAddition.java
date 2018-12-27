package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] matrix1 = new int[row][col];
        int [][] matrix2 = new int[row][col];
        int [][] result = new int[row][col];
        System.out.println("Enter the first matrix values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp = sc.nextInt();
                matrix1[i][j]=temp;
            }
        }
        System.out.println("Enter the Second matrix values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp = sc.nextInt();
                matrix2[i][j]=temp;
            }
        }
        //;;;;;;;;;;;Adding the two matrixes and putting the result into new matrix:::::::::::::::::
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp = matrix1[i][j]+matrix2[i][j];
                result[i][j] = temp;
            }
        }
        //:::::::::::::Displaying the matrix sum::::::::::::::::
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
