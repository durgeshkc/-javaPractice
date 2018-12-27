package com.stackroute.unittest.pe3;

public class Chessboard {

    public static void main(String args[]) {
        String white = "WW|";
        String black = "BB|";
        String [][] chessBoard = new String[8][8];          //Size of chess board is 8x8.........
        int evenRow = 0,evenCol = 0;
        int oddRow = 1,oddCol = 0;
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(i%2==0)
                {
                    if(j%2 == 0)
                    {
                        chessBoard[i][j] = white;
                    }
                    else
                    {
                        chessBoard[i][j] = black;
                    }
                }
                else
                {
                    if(j%2 ==0)
                    {
                        chessBoard[i][j] = black;
                    }
                    else
                    {
                        chessBoard[i][j] = white;
                    }
                }
            }
        }
        //Displaying the so formed chessboard..............
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
