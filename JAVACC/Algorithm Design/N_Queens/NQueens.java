package N_Queens;

import java.util.Scanner;

/**
 * Concept Declaration 
 * Main -> NQueens Funtion ->IsSafe -> NQueens Fuction
 * NQueens Funtion = Board,Row
 * IsSafe =Board,Row,Column
 */

public class NQueens {
    public static int No_Of_possibilities=0;  //Declaration of the No_Of_possibilities
    //Declaration of the IsSafe Function
     //Declaration of the IsSafe Function
    public static boolean IsSafe(char[][] Chess_Board,int row,int column){
        int n=Chess_Board[0].length;
        int r=row;
        int c=column;
        //Declaraion for the column
        for(int i=0;i<n;i++){
            if(Chess_Board[r][i]=='Q') return false;
        }
        r=row;
        c=column;
        //Declaraion for the column
        for(int i=0;i<n;i++){
            if(Chess_Board[i][c]=='Q') return false;
        }
        //Declaration for the diagonals
        //Upper - Right
        r=row;
        c=column;
        while(r>=0 && c<n){
            if(Chess_Board[r][c]=='Q') return false;
            r--;
            c++;
        }
        //Lower - Rigth
        r=row;
        c=column;
        while(r<n && c<n){
            if(Chess_Board[r][c]=='Q') return false;
            r++;
            c++;
        }
        //Upper - Left
        r=row;
        c=column;
        while(r>=0 && c>=0){
            if(Chess_Board[r][c]=='Q') return false;
            r--;
            c--;
        }
        //Upper - Right
        r=row;
        c=column;
        while(r<n && c>=0){
            if(Chess_Board[r][c]=='Q') return false;
            r++;
            c--;
        }
        //Declaration of the over condition
        return true;
    }
    
    //Declaration of the NQueens Function
    public static void nqueens(char[][] Chess_Board, int row){
        int n=Chess_Board[0].length;
        if(n==row){
            No_Of_possibilities++;
            //Print the Result
            System.out.println("\n\nPossibility No.: "+No_Of_possibilities);
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(Chess_Board[i][j]=='Q')
                        System.out.print(" 👑 ");
                    else
                        System.out.print(" . ");
                }
                System.out.println();
            }
            return;
        }
        //Declaration of the recursive Call
        for(int i=0;i<n;i++){
            if(IsSafe(Chess_Board, row, i)){
                Chess_Board[row][i]='Q';
                nqueens(Chess_Board, row+1);
                Chess_Board[row][i]='X';
            }
        }
    }

    //Declaration of the Driver Class
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter the number of Queens 👑 : ");
            int n =scanner.nextInt();
            char[][] board=new char[n][n];
            nqueens(board, 0);
            return;
        }
    }
}
