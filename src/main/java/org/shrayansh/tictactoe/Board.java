package org.shrayansh.tictactoe;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class Board {

    int size;
    PlayingPiece[][] board;

    public Board(int size){
        this.size=size;
        this.board=new PlayingPiece[size][size];
    }

    //method to add playingPiece on any particular row and column on the board
    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        if(row < 0 || row>=size || column <0 || column >=size ||  board[row][column] != null) {
            return false;
        }else{
            board[row][column] = playingPiece;
            return true;
        }
    }

    //method to get list of all free cells in the board i.e. cell which is not filled
    //with PlayingPiece
    //We get list of pairs of row and column of cell
    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells = new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] == null){
                    Pair<Integer,Integer> rowColumn = new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void displayBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j< size;j++){
                if(board[i][j] != null)
                    System.out.print(board[i][j].pieceType+" |");
                else
                    System.out.print("  |");
            }
            System.out.println();
        }
    }

}
