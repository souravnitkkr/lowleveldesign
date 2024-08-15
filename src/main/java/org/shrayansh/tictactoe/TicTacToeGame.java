package org.shrayansh.tictactoe;

import javafx.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> playerList;
    Board playingBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame(){
        //initializing player list
        playerList=new LinkedList<>();
        playerList.add(new Player("Player1",new PlayingPieceO()));
        playerList.add(new Player("Player2",new PlayingPieceX()));

        //initializing board
        playingBoard=new Board(3);
    }

    //we will start the game here and return the player winning the game here
    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {

            //take out the player whose turn is and also put the player in the list back
            Player playerTurn = playerList.removeFirst();

            //get the free space from the board
            List<Pair<Integer, Integer>> freeSpaceList = playingBoard.getFreeCells();

            if (freeSpaceList.isEmpty()) {
                noWinner=false;
                continue;
            }

            playingBoard.displayBoard();

            System.out.println("Player:" + playerTurn.getName() + " PieceType:" + playerTurn.getPlayingPiece().pieceType + " Enter row:column: ");
            //Taking input of row and column from user
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String numbers[] = input.split(",");
            int row = Integer.parseInt(numbers[0]);
            int column = Integer.parseInt(numbers[1]);

            boolean pieceAddedSuccessfully = playingBoard.addPiece(row, column, playerTurn.getPlayingPiece());
            if (!pieceAddedSuccessfully) {
                System.out.println("Incorrect position, try again!");
                playerList.addFirst(playerTurn);
                continue;
            }

            if (checkWinner(row,column,playerTurn.getPlayingPiece().pieceType)) {
                playingBoard.displayBoard();
                return playerTurn.getName() + " is a winner";
            }

            //adding the removed player to the last of queue
            playerList.addLast(playerTurn);
        }
        return "Game draw, No player is winner!";
    }

    public boolean checkWinner(int row,int column,PieceType pieceType){

        int size=playingBoard.size;
        PlayingPiece[][] board=playingBoard.board;
        boolean rowMatch=true,columnMatch=true,diagonalMatch=true,antiDiagonalMatch=true;

        //check horizontally
        for(int i=0;i<size;i++){
            if(board[row][i] == null || board[row][i].pieceType != pieceType)
            {
                rowMatch=false;
                break;
            }
        }

        if(rowMatch)
            return true;

        //check vertically
        for(int i=0;i<size;i++){
            if(board[i][column] == null || board[i][column].pieceType != pieceType)
            {
                columnMatch=false;
                break;
            }
        }

        if(columnMatch)
            return true;

        //check diagonally(left diagonal)
        for(int i=0;i<size;i++){
            if(board[i][i] == null || board[i][i].pieceType != pieceType){
                diagonalMatch=false;
                break;
            }
        }

        if(diagonalMatch)
            return true;

        //check diagonally(right diagonal)
        for(int i=0;i<size;i++){
            if(board[i][size-i-1] == null || board[i][size-i-1].pieceType != pieceType){
                antiDiagonalMatch=false;
                break;
            }
        }

        if(antiDiagonalMatch)
            return true;

        return false;

    }

}
